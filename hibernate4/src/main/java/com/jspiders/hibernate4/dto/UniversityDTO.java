package com.jspiders.hibernate4.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class UniversityDTO {

	@Id
	private int id;
	private String name;
	private String city;
	private String email;
}
