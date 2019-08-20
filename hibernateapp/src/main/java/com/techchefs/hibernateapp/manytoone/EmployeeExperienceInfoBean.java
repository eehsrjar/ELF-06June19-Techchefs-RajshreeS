package com.techchefs.hibernateapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable{
	@EmbeddedId
	private EmployeeExperiencePKBean expPKBean;
	private String designation;
	@Column(name="joining_date")
	private Date joiningDate;
	@Column(name="leaving_date")
	private Date leavingDate;
	
	public EmployeeExperienceInfoBean() {
	}

	}
