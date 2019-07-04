package com.techchefs.hibernateapp.dto;

import java.io.Serializable;

public class DepartmentInfoBean implements Serializable{
	private int deptId;
	private String deptName;
	
	public DepartmentInfoBean() {
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
