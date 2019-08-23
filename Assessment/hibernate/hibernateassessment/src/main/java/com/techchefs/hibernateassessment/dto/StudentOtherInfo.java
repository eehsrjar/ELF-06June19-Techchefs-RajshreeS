package com.techchefs.hibernateassessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="student_other_info")
public class StudentOtherInfo implements Serializable{
	@Id
	private int rollNum;
	private String fatherName;
	private String motherName;
	private String gender;
	private String nationality;
	private String religion;
}


