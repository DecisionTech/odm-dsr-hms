package com.demo;

public class Medication {
	private String ndc = "ndc";
	private String name = "name";
	
	public Medication(){
		super();
	}
	
	public Medication(String ndc, String name){
		this.ndc = ndc;
		this.name = name;
	}
	
	public String getNdc() {
		return ndc;
	}

	public String getName() {
		return name;
	}
	
	public void setNdc(String ndc) {
		this.ndc = ndc;
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
			   medication.getNdc() != null &&
			   medication.getName().equalsIgnoreCase(this.name) &&
			   medication.getNdc().equals(this.ndc)){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		String string = "" + this.getName() + ", " + this.getNdc() ;
		return string;
	}
}	
