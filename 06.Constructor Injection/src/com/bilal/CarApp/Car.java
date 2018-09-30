package com.bilal.CarApp;

public class Car {
	
	private String name;
	private int mileage;
	
	public Car() {
		System.out.println("running no-arg const...");
	}

	public Car(String name, int mileage) {
		System.out.println("running 2-arg const...");
		this.name = name;
		this.mileage = mileage;
	}

	public void getDetails() {
		System.out.println(name+"\n"+mileage);
		
	}
	
	

}
