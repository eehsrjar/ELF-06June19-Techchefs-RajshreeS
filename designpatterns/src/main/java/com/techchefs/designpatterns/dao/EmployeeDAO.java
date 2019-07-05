package com.techchefs.designpatterns.dao;

import java.util.ArrayList;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	  ArrayList<EmployeeInfoBean> getAllEmployeeInfo();
	  EmployeeInfoBean getEmployeeInfo(String id);
	  EmployeeInfoBean getEmployeeInfo(int id);
}
