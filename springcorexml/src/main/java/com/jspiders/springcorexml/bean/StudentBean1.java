package com.jspiders.springcorexml.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentBean1 {

	private int id;
	private String name;
	private String email;
	private long contact;
}
