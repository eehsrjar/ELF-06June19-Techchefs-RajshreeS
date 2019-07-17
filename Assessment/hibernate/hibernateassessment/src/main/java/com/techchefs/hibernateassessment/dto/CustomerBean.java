package com.techchefs.hibernateassessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity(name="customer")
public class CustomerBean implements Serializable{
	@Id
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="contact_number")	
	private long contactNumber;
	private String address;
	private String city;
	private String state;
	private String country;


}
