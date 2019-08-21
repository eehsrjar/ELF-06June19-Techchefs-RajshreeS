package com.techchefs.hibernateapp.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;
@Entity
@Table(name="employee_educational_info")
@Data
public class EmployeeEducationalInfoBean implements Serializable{
	@EmbeddedId
	private EmployeeEducationPKBean educationPKBean;
	@Column(name="degree_type")
	private String degreeType;
	private String branch;
	@Column(name="college_name")
	private String collegeName;
	private String university;
	private int yop;
	private double percentage;	 
	private String location;
	
	public EmployeeEducationalInfoBean() {
	}

	
	
}