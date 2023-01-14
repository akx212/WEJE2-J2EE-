package com.jspiders.hibernate1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

public class MessiDTO {
	
	@Id
	private int id;
	private String name;
	private String email;
	private int age;
	private String club;
	
	@OneToOne
	private RonaldoDTO ronaldo;

}
