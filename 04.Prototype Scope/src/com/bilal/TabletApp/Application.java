package com.bilal.TabletApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		
		// -------------Object 1---------------- //
		Tablet tab1=context.getBean("tablet", Tablet.class);
		tab1.setName("samsung");
		tab1.setOs("android");
		tab1.getDetails();
		
		
		// -------------Object 2---------------- //
		Tablet tab2=context.getBean("tablet", Tablet.class);
		tab2.getDetails();
		
		
		/*
		 * in prototype scope calling Second object will not return First Object
		 */
		
	}

}
