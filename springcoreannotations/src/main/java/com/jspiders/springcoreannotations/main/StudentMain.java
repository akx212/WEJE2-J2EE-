package com.jspiders.springcoreannotations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcoreannotations.bean.StudentBean;
import com.jspiders.springcoreannotations.config.StudentConfig;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);		
//		StudentBean student = context.getBean(StudentBean.class);	
//		System.out.println(student);
//		((AnnotationConfigApplicationContext)context).close();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);		
		StudentBean student = (StudentBean)context.getBean("student1");	
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();

	}

}
