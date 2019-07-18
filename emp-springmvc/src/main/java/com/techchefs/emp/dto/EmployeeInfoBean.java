package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	@Id
	private int id;
	@Column(name="name")
	private String empName;
	private String password;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	@Column(name="joining_date")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date joiningDate;
	@Column(name="account_number")
	private long accountNumber;
	private String email;
	private String designation;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dob;
	@Column(name="dept_id")
	private int departmentId;
	@Column(name="mngr_id")
	private int managerId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private EmployeeOtherInfoBean otherInfoBean;
	
}
