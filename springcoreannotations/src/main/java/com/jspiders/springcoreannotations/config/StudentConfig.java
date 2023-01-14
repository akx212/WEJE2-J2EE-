package com.jspiders.springcoreannotations.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotations.bean.StudentBean;

public class StudentConfig {

//	@Bean
//	public StudentBean getStudent() {
//		StudentBean student = new StudentBean();
//		student.setId(1);
//		student.setName("Raju");
//		student.setEmail("paisa@scam.com");
//		student.setContact(9876543211l);
//		student.setCity("Mumbai");
//		return student;
//	}
	@Bean("student1")
	public StudentBean getStudent1() {
		return new StudentBean();
	}
		
	
}
