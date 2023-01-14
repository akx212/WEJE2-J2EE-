package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.StudentBean;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
		
//		1st way of getting bean
//		StudentBean studentBean = context.getBean(StudentBean.class);
		
//		 2nd way of getting beans
		StudentBean studentBean = (StudentBean)context.getBean("student1");
		
		System.out.println(studentBean);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
