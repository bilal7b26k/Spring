package com.bilal.AnimalApp;

public class Animal {
	
	private String name;
	private String color;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public void getDetails() {
		System.out.println("Anmimal :"+getName()+" color :"+getColor());
		
	}

}
