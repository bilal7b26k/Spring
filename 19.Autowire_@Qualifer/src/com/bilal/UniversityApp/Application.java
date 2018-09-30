package com.bilal.UniversityApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		University uni=(University)con.getBean("uni");
		uni.display();
	}

}
