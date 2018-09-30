package com.bilal.LifeCycleApp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean,DisposableBean{
	
	private String message;

	public String getMessage() {
		System.out.println(message);
		return message;
	}




	public void setMessage(String message) {
		this.message = message;
	}




	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method running");
		
	}
	
	
	

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method running");
	}

}
