package com.bilal.UniversityApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class University {
	
	@Qualifier(value="student1")
	@Autowired
	
	private Student student;
	
	
	public void display() {
		System.out.println("Student Name:"+student.getName()+" rollno:"+student.getRoll());
	}

}
