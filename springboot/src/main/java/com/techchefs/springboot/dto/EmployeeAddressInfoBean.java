package com.techchefs.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;
import lombok.ToString;
@SuppressWarnings("serial")

@Entity
@Table(name="employee_address_info")
//@XmlAccessorType(XmlAccessType.FIELD)
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

	public EmployeeAddressPKBean getAddressPKBean() {
		return addressPKBean;
	}

	public void setAddressPKBean(EmployeeAddressPKBean addressPKBean) {
		this.addressPKBean = addressPKBean;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
}
