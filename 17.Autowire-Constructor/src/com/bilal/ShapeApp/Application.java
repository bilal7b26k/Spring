package com.bilal.ShapeApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Shape shape=(Shape)ctx.getBean("triangle");
//		shape.display();
		
	}


}
