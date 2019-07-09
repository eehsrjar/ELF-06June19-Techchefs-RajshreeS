package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
@SuppressWarnings("serial")
@Data
@Entity
@Table(name="employee_address_info")
@ToString
public class EmployeeAddressInfoBean implements Serializable{
	@EmbeddedId
	private EmployeeAddressPKBean addressPKBean;
	private String address1;
	private String address2;
	private String landmark;
	private String city;
	private String state;
	private String country;
	private Integer pincode;
	
	EmployeeAddressInfoBean(){}	
}
