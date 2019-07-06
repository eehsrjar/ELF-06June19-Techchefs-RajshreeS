package com.techchefs.designpatterns.beans;

import java.io.Serializable;
import java.util.Date;

public class EmployeeExperienceInfoBean implements Serializable{
	private int id;
	private String companyName; 
	private String designation;
	private Date joiningDate;
	private Date leavingDate;
	
	public EmployeeExperienceInfoBean() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}
	
	
	
	}
