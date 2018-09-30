package com.bilal.ShapeApp;

public class Shape {

	private Circle circle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public void display() {

		System.out.println(circle.getName()
				);
	}
	
	
}
