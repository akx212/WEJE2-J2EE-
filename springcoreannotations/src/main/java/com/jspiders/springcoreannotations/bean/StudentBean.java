package com.jspiders.springcoreannotations.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class StudentBean {
//
//	private int id;
//	private String name;
//	private String email;
//	private long contact;
//	private String city;
	
	@Value("2")
	private int id;
	@Value("Shyam")
	private String name;
	@Value("shyam@scam.com")
	private String email;
	@Value("9874563211")
	private long contact;
	@Value("Mumbai")
	private String city;
}
