package com.bilal.MobileApp;

public class Mobile {
	private int ram;
	private String model;
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void getDetails() {

		System.out.println("Mobile :"+getModel()+" "+getRam()+"gb ram");
	}
	
	

}
