package com.bilal.LifeApp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Life {
	
	private String message;
	
	
	
	public String getMessage() {
		System.out.println(message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@PostConstruct
	public void initMe() {
		System.out.println("running init()");
	}
	
	@PreDestroy
	public void destroyMe() {
		System.out.println("destroying()");
	}

}
