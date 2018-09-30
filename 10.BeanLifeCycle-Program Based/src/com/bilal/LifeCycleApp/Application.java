package com.bilal.LifeCycleApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		BeanLifeCycle bfc=(BeanLifeCycle)ctx.getBean("lifecycle");
		bfc.getMessage();
		ctx.close();
	}

}
