package com.techchefs.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeExperiencePKBean implements Serializable{
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean empInfoBean;
	@Column(name="company_name")
	private String companyName; 
	
	EmployeeExperiencePKBean(){}

	public EmployeeInfoBean getEmpInfoBean() {
		return empInfoBean;
	}

	public void setEmpInfoBean(EmployeeInfoBean empInfoBean) {
		this.empInfoBean = empInfoBean;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
