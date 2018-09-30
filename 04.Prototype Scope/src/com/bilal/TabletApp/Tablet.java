package com.bilal.TabletApp;

public class Tablet {
	private String name;
	private String os;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public void getDetails() {
	System.out.println(getName()+" "+getOs());
	
	}
	
	

}

