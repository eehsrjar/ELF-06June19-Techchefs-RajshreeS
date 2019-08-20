package com.techchefs.hibernateassessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity(name="student")
public class Student implements Serializable{
	@Id
	private int rollNum;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String subject;
	@Column(name="total_marks")
	private double totalMarks;
}
