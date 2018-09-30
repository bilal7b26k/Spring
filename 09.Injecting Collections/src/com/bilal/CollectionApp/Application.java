package com.bilal.CollectionApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Footballers foot=(Footballers)ctx.getBean("footballers");
		foot.getDetails();
		
	}
}
