package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.StudentBean1;

public class StudentMain1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig1.xml");
		
		StudentBean1 studentBean= (StudentBean1)context.getBean("student3");
		
		System.out.println(studentBean);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
