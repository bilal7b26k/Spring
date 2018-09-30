package com.bilal.LifeApp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Life life=(Life)ctx.getBean("life");
		life.getMessage();
		ctx.close();
	}

}
