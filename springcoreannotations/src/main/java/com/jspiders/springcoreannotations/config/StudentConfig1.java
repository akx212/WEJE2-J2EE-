package com.jspiders.springcoreannotations.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springcoreannotations.bean.StudentBean;
import com.jspiders.springcoreannotations.bean.StudentBean1;

public class StudentConfig1 {

	@Bean("student2")
	public StudentBean1 getStudent2() {
		StudentBean1 student = new StudentBean1(3,"Amar","amar@gmail.com",9874565544l,"Pune");
		return student;
			
		
	}
}
