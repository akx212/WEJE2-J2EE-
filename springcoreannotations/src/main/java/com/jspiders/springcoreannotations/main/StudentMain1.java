package com.jspiders.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotations.bean.StudentBean1;
import com.jspiders.springcoreannotations.config.StudentConfig1;

public class StudentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig1.class);
		
		StudentBean1 student = (StudentBean1)context.getBean("student2");
		
		System.out.println(student);
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
