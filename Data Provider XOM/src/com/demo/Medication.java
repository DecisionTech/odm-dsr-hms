package com.demo;

public class Medication {
	private String NDC;
	private String name;
	
	public Medication(){
		super();
	}
	
	public Medication(String ndc, String name){
		NDC = ndc;
		this.name = name;
	}

	public String getNDC() {
		return NDC;
	}

	public String getName() {
		return name;
	}

	public void setNDC(String nDC) {
		NDC = nDC;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doit(){
		
		Medication m = new com.demo.Medication("1", "Coumadin");

	}
	public boolean equals(Object object){
		if(object instanceof Medication){
			Medication medication = ((Medication)object);
			if(medication != null &&
			   medication.getName() != null &&
			   medication.getNDC() != null &&
			   medication.getName().equalsIgnoreCase(name) &&
			   medication.getNDC().equals(NDC)){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		String string = "";
		return string;
	}
}	
