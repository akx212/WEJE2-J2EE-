package com.jspiders.hibernate5.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class ProductDTO1 {
	
	@Id
	private int id;
	
	private String name;
	
	private double price;
	
	private String category;
	
	@ManyToMany(mappedBy = "products")
	private List<CustomerDTO1> customers;

}
