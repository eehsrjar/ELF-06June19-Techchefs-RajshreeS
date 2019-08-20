package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;

@Data
@Embeddable
@ToString
public class EmployeeEducationPKBean implements Serializable{
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean empInfoBean;
	@Column(name="education_type")
	private String educationType;

}
