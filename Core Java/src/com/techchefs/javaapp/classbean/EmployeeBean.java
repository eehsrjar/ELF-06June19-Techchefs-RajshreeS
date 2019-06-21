package com.techchefs.javaapp.classbean;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeBean {
	
	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joiningDate;
	private String gender;
	
}
