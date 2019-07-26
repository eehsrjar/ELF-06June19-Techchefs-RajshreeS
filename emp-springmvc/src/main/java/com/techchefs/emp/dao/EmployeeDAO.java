package com.techchefs.emp.dao;

import java.util.ArrayList;
import java.util.List;

import com.techchefs.emp.dto.EmployeeInfoBean;



public interface EmployeeDAO {
	  List<EmployeeInfoBean> getAllEmployeeInfo();
	  EmployeeInfoBean getEmployeeInfo(String id);
	  EmployeeInfoBean getEmployeeInfo(int id);
	  boolean createEmployeeInfo(EmployeeInfoBean bean);
	  boolean updateEmployeeInfo(EmployeeInfoBean bean);
	  boolean deleteEmployeeInfo(int id);
	  boolean deleteEmployeeInfo(String id);
	  public ArrayList<EmployeeInfoBean> getEmployeeIds(int eid);
}
