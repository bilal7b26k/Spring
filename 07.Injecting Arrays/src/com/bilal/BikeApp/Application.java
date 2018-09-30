package com.bilal.BikeApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Bike bike=(Bike)context.getBean("bike");
		bike.getDetails();
		
	}

}
