package com.demo.database;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

public class MockDatabase {
	
	public Properties loadData(String propTableName) {
		Properties properties = new OrderedProperties();
		InputStream stream = getClass().getClassLoader().getResourceAsStream(propTableName);
		try {
			properties.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return properties;
	}
	

	public static void test() {
		// TODO Auto-generated method stub
		MockDatabase md = new MockDatabase();
		Properties patients = md.loadData("patients.properties");
		for (Enumeration e = patients.propertyNames(); e.hasMoreElements();) {
			System.out.println("key is " + e.nextElement().toString());
		}	
		
		String patient = patients.getProperty("Patient5");
		System.out.println("Patient 5 is + " + patient);
		
		String[] patientParts = patient.split(",");
		for (String string : patientParts) {
			System.out.println(string);
		}  
		 
		
	}


class OrderedProperties extends Properties {

    public OrderedProperties() {
        super ();

        names = new Vector();
    }

    public Enumeration propertyNames() {
        return names.elements();
    }

    public Object put(Object key, Object value) {
        if (names.contains(key)) {
            names.remove(key);
        }

        names.add(key);

        return super.put(key, value);
    }

    public Object remove(Object key) {
        names.remove(key);

        return super .remove(key);
    }

    private Vector names;

}
}