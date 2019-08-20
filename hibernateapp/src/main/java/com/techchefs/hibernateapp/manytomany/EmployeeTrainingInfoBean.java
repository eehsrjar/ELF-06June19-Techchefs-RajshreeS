package com.techchefs.hibernateapp.manytomany;

import java.io.Serializable;

public class EmployeeTrainingInfoBean implements Serializable
{
	private int id;
	private int courseId;
	
	public EmployeeTrainingInfoBean() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
}
