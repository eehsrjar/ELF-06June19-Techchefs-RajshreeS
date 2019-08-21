package com.techchefs.librarymngt.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name="user_details")
public class UserBean implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int userId;
	private String password;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email",unique=true)
	private String email;
	@Column(name="phone_no")
	private long phoneNo;
	@Column(name="address")
	private String address;		
	@Column(name="user_type")
	private String userType;
	@Column(name="user_image")
	private String userImage;
	@Column(name="user_status")
	private String userStatus;
}
