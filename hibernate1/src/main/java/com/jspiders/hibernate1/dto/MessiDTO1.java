package com.jspiders.hibernate1.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class MessiDTO1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private int age;
	private String club;
	
	@OneToOne(mappedBy = "messi")
	private List <RonaldoDTO1> ronaldo;
}
