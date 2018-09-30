package com.bilal.MobileApp;

import org.springframework.beans.factory.annotation.Autowired;

public class Mobile {
	private String name;
	
	@Autowired
	private Series series;
	
	public Mobile() {
		System.out.println("Mobile OBJ created");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Series getSeries() {
		return series;
	}
/*	public void setSeries(Series series) {
		this.series = series;
	}
	*/
	
	
	
	public void display() {
	
		System.out.println(name+" "+series.getName()+" "+series.getBudget());
	}
	

}
