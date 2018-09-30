package com.bilal.MedicineApp;

import org.springframework.beans.factory.annotation.Required;

public class Medicine {
	
	
	private int id;
	private String name;
	private String expiry;
	
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+expiry);
	}

}
