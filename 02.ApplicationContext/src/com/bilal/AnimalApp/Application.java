package com.bilal.AnimalApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Animal animal=(Animal)context.getBean("animal");
		animal.getDetails();
	}

}
