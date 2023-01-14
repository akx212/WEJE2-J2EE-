package com.jspiders.hibernate5.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class UniversityDTO1 {

	@Id
	private int id;
	private String name;
	private String city;
	private String email;
	
	@ManyToMany(mappedBy = "university")
	private List <CollegeDTO1> college;
}
