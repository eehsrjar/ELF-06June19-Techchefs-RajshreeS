package com.techchefs.hibernateapp.manytomany;

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

import com.techchefs.hibernateapp.manytoone.EmployeeInfoBean;

import lombok.Data;
@Entity
@Table(name="training_info")
@Data
public class TrainingInfoBean implements Serializable{
	@Id
	@Column(name="course_id")
	private int courseId;
	@Column(name="course_name")
	private String courseName;
	private String duration;
	@Column(name="course_type")
	private String courseType;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_training",joinColumns = {@JoinColumn(name="course_id")},
	inverseJoinColumns = {@JoinColumn(name="id")})
	List<EmployeeInfoBean> infoBeans;
}
