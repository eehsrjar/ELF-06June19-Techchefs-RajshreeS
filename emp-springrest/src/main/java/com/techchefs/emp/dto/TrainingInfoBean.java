package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="training_info")

public class TrainingInfoBean implements Serializable{
	@Id
	@Column(name="course_id")
	private Integer courseId;
	@Column(name="course_name")
	private String courseName;
	private String duration;
	@Column(name="course_type")
	private String courseType;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_training",joinColumns = {@JoinColumn(name="course_id")},
	inverseJoinColumns = {@JoinColumn(name="id")})
	List<EmployeeInfoBean> infoBeans;

	TrainingInfoBean(){}
	
	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public List<EmployeeInfoBean> getInfoBeans() {
		return infoBeans;
	}

	public void setInfoBeans(List<EmployeeInfoBean> infoBeans) {
		this.infoBeans = infoBeans;
	}
	
	
}
