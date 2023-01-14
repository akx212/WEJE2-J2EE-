package com.jspiders.hibernate4.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class CollegeDTO {

	@Id
	private int id;
	private String name;
	private String city;
	private long contact;
	
	@ManyToMany
	private List <UniversityDTO> university;
}
