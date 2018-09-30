package com.bilal.CarApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		Car car=(Car)con.getBean("car");
		car.getDetails();
	}

}
