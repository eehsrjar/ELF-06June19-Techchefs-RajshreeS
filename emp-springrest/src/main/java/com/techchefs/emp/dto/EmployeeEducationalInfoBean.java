package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;
@Entity
@Table(name="employee_educational_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationalInfoBean implements Serializable{
	@EmbeddedId
	private EmployeeEducationPKBean educationPKBean;
	@Column(name="degree_type")
	private String degreeType;
	private String branch;
	@Column(name="college_name")
	private String collegeName;
	private String university;
	private Date yop;
	private Double percentage;	 
	private String location;
	
	public EmployeeEducationalInfoBean() {
	}

	public EmployeeEducationPKBean getEducationPKBean() {
		return educationPKBean;
	}

	public void setEducationPKBean(EmployeeEducationPKBean educationPKBean) {
		this.educationPKBean = educationPKBean;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Date getYop() {
		return yop;
	}

	public void setYop(Date yop) {
		this.yop = yop;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
}
