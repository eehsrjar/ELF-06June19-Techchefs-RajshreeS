package com.techchefs.designpatterns;

import java.util.ArrayList;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;
import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;
import com.techchefs.designpatterns.dao.EmployeeDAOHibernateImpl;
import com.techchefs.designpatterns.dao.EmployeeDAOJDBCImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {
	public static void main(String[] args) {
		//EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		//EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printEmployeeInfo(dao.getEmployeeInfo(1000));
		printEmployeeInfo(dao.getEmployeeInfo("1003"));
//		ArrayList<EmployeeInfoBean> arr=dao.getAllEmployeeInfo();
//		for (EmployeeInfoBean employeeInfoBean : arr) {
//			printEmployeeInfo(employeeInfoBean);
//		}
	}

	private static void printEmployeeInfo(EmployeeInfoBean bean) {
		if (bean != null) {
			log.info("ID  ====>" + bean.getId());
			log.info("Name  ====>" + bean.getEmpName());
			log.info("Age  ====>" + bean.getAge());
			log.info("Phone  ====>" + bean.getPhone());
			log.info("Gender  ====>" + bean.getGender());
			log.info("Salary  ====>" + bean.getSalary());
			log.info("Joining Date  ====>" + bean.getJoiningDate());
			log.info("Account number  ====>" + bean.getAccountNumber());
			log.info("Email  ====>" + bean.getEmail());
			log.info("Designation  ====>" + bean.getDesignation());
			log.info("DOB  ====>" + bean.getDob());
			log.info("DEPT_NO  ====>" + bean.getDepartmentId());
			log.info("MNGR ID  ====>" + bean.getManagerId());
			log.info("***************************************");
		}
	}
}
