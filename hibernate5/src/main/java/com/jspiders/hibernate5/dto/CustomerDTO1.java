package com.jspiders.hibernate5.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data

public class CustomerDTO1 {
	
	@Id
	private int id;
	
	private String name;
	
	private long contact;
	
	private String email;
	
	@ManyToMany
	private List<ProductDTO1> products;


}
