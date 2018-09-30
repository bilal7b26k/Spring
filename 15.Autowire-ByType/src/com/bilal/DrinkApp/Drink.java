package com.bilal.DrinkApp;

public class Drink {
	private String name;
	private Brand brand;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	
	public void display() {
		System.out.println(name+" "+brand.getName()+" "+brand.getColor());
	}
	

}
