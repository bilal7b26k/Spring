package com.bilal.MobileApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
          //		--------OBJECT 1-------------//
		Mobile mobile1=(Mobile)context.getBean("mobile");
		mobile1.setModel("mi5a");
		mobile1.setRam(4);
		mobile1.getDetails();
		
		
		
		 //		--------OBJECT 2-------------//
		Mobile mobile2=(Mobile)context.getBean("mobile");
		mobile2.getDetails();
		/*
		in SIngleton if you do not initialize the properties of the Second object the Spring controller 
		return us back the first object*/
	}

}
