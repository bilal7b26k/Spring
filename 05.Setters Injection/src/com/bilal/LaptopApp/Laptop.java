package com.bilal.LaptopApp;

public class Laptop {
	private String name;
	private String processor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void getDetails() {
		System.out.println(getName()+" "+getProcessor());
	}
	
}
