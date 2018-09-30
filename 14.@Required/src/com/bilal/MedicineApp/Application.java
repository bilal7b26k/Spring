package com.bilal.MedicineApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Medicine med=(Medicine)ctx.getBean("med");
		med.display();
	}

}
