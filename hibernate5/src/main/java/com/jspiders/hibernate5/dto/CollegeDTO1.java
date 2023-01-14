package com.jspiders.hibernate5.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.jspiders.hibernate5.dto.UniversityDTO1;

import lombok.Data;

@Entity
@Data
public class CollegeDTO1 {

	@Id
	private int id;
	private String name;
	private String city;
	private long contact;
	
	@ManyToMany
	private List <UniversityDTO1> university;
}
