package com.bilal.BikeApp;

public class Bike {
	private String[] name;

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}
	
	public void getDetails() {
		for (String string : name) {
			System.out.println(string);
		}
	}
	
	
	

}
