package com.jspiders.hibernate1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class WifeDTO {

	@Id
	private int id;
	private String name;
	private String email;
	private int age;
	private long contact;
	
}
