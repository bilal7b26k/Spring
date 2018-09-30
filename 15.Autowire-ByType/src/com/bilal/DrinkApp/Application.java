package com.bilal.DrinkApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Drink drink=(Drink)ctx.getBean("Drink");
		drink.display();
		
	}

}
