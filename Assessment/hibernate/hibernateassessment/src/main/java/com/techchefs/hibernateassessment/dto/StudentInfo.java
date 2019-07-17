package com.techchefs.hibernateassessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity(name="student_info")
public class StudentInfo implements Serializable{
	@Id
	private int rollNum;
	private String name;
	private int age;
	private String gender;
	private long mobileno;
	private String emailId;
	private StudentInfo studentInfo;
}


