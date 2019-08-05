package com.techchefs.hibernateapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	@Id
	private int id;
	@Column(name="name")
	private String empName;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="account_number")
	private long accountNumber;
	private String email;
	private String designation;
	private Date dob;
	@Column(name="dept_id")
	private int departmentId;
	@Column(name="mngr_id")
	private int managerId;
	/*
	 * @JoinColumn(name="mngr_id",referencedColumnName = "id")
	 * 
	 * @OneToMany private EmployeeInfoBean managerId;
	 */
	
}
