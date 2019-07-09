package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable{
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "bean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany( cascade = CascadeType.ALL,mappedBy = "addressPKBean.empInfoBean")
	private List<EmployeeAddressInfoBean> addressInfoBeans;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "educationPKBean.empInfoBean")
	private List<EmployeeEducationalInfoBean> educationInfoBeans;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "expPKBean.empInfoBean")
	private List<EmployeeExperienceInfoBean> experienceInfoBeans;
//	@LazyCollection(LazyCollectionOption.FALSE)
//	@ManyToMany(cascade = CascadeType.ALL,mappedBy="infoBeans")
//	private List<TrainingInfoBean> trainingInfoBeans;
	@Id
	private int id;
	@Column(name="name")
	private String empName;
	private String password;
	private Integer age;
	private String gender;
	private Double salary;
	private Long phone;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="account_number")
	private Long accountNumber;
	private String email;
	private String designation;
	private Date dob;
	@Column(name="dept_id")
	private Integer departmentId;
//	@ManyToOne
//	@JoinColumn(name="dept_id")
//	private DepartmentInfoBean departmentId;
//	@Column(name="mngr_id")
//	private int managerId;
	  @JoinColumn(name="mngr_id",referencedColumnName = "id")	  
	  @ManyToOne(cascade = CascadeType.ALL)
	  private EmployeeInfoBean managerId;
	public EmployeeOtherInfoBean getEmployeeOtherInfoBean() {
		return employeeOtherInfoBean;
	}
	public void setEmployeeOtherInfoBean(EmployeeOtherInfoBean employeeOtherInfoBean) {
		this.employeeOtherInfoBean = employeeOtherInfoBean;
	}
	public List<EmployeeAddressInfoBean> getAddressInfoBeans() {
		return addressInfoBeans;
	}
	public void setAddressInfoBeans(List<EmployeeAddressInfoBean> addressInfoBeans) {
		this.addressInfoBeans = addressInfoBeans;
	}
	public List<EmployeeEducationalInfoBean> getEducationInfoBeans() {
		return educationInfoBeans;
	}
	public void setEducationInfoBeans(List<EmployeeEducationalInfoBean> educationInfoBeans) {
		this.educationInfoBeans = educationInfoBeans;
	}
	public List<EmployeeExperienceInfoBean> getExperienceInfoBeans() {
		return experienceInfoBeans;
	}
	public void setExperienceInfoBeans(List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		this.experienceInfoBeans = experienceInfoBeans;
	}
//	public List<TrainingInfoBean> getTrainingInfoBeans() {
//		return trainingInfoBeans;
//	}
//	public void setTrainingInfoBeans(List<TrainingInfoBean> trainingInfoBeans) {
//		this.trainingInfoBeans = trainingInfoBeans;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public EmployeeInfoBean getManagerId() {
		return managerId;
	}
	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}
	 
	
}
