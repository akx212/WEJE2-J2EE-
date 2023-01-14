package com.jspiders.hibernate1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data

public class RonaldoDTO {
	
	@Id
	private int id;
	private String name;
	private String email;
	private int age;
	private String club;
	

}
