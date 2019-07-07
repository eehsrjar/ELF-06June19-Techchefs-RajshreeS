package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "bean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "addressPKBean.empInfoBean")
	private List<EmployeeAddressInfoBean> addressInfoBeans;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "educationPKBean.empInfoBean")
	private List<EmployeeEducationalInfoBean> educationInfoBeans;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "expPKBean.empInfoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBeans;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans;
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
	private Date joiningDate;
	@Column(name="account_number")
	private long accountNumber;
	private String email;
	private String designation;
	private Date dob;
//	@Column(name="dept_id")
//	private int departmentId;
	@ManyToOne
	@JoinColumn(name="dept_id")
	private DepartmentInfoBean departmentId;
//	@Column(name="mngr_id")
//	private int managerId;
	  @JoinColumn(name="mngr_id",referencedColumnName = "id")	  
	  @ManyToOne 
	  private EmployeeInfoBean managerId;
	 
	
}
