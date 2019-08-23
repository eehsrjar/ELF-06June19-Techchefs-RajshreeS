package com.techchefs.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;
@Entity
@Table(name="employee_other_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOtherInfoBean implements Serializable{
	//@XmlTransient
	@JsonIgnore
	@Id
	@OneToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean bean;
	@Column(name="pan")
	private String pan;
	@Column(name="is_married")
	private Boolean isMarried;
	@Column(name="blood_grp")
	private String bloodGrp;
	@Column(name="is_challenged")
	private Boolean isChallenged;
	@Column(name="emergency_contact_number")
	private Long emergencyContactNumber;
	@Column(name="emergency_contact_name")
	private String emergencyContactName;
	@Column(name="nationality")
	private String nationality;
	@Column(name="religion")
	private String religion;
	@Column(name="father_nm")
	private String fatherName;
	@Column(name="mother_nm")
	private String motherName;
	@Column(name="spouse_nm")
	private String spouseName;
	@Column(name="passport")
	private String	passport;
	@Column(name="aadhaar")
	private Long adhaar;
	
	public EmployeeOtherInfoBean() {
	}

	public EmployeeInfoBean getBean() {
		return bean;
	}

	public void setBean(EmployeeInfoBean bean) {
		this.bean = bean;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Boolean getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(Boolean isMarried) {
		this.isMarried = isMarried;
	}

	public String getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public Boolean getIsChallenged() {
		return isChallenged;
	}

	public void setIsChallenged(Boolean isChallenged) {
		this.isChallenged = isChallenged;
	}

	public Long getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(Long emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public Long getAdhaar() {
		return adhaar;
	}

	public void setAdhaar(Long adhaar) {
		this.adhaar = adhaar;
	}

	
}
