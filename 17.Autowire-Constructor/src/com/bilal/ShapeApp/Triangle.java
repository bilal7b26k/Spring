package com.bilal.ShapeApp;

public class Triangle {
	private String area;
	private String parameter;
	
	public Triangle() {
		System.out.println("running no-arg constructor of TRIANGLE CLASS");
	}
	
	public Triangle(String area,String parameter) {
		System.out.println("running double-arg constructor of TRIANGLE CLASS");
		this.area=area;
		this.parameter=parameter;
	}

}
