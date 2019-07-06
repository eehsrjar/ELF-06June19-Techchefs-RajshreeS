package com.techchefs.designpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;
import com.techchefs.designpatterns.dao.EmployeeDAO;
import com.techchefs.designpatterns.dao.EmployeeDAOFactory;
import com.techchefs.designpatterns.dao.EmployeeDAOHibernateImpl;
import com.techchefs.designpatterns.dao.EmployeeDAOJDBCImpl;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {
	public static void main(String[] args) throws ParseException {
		//EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		//EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printEmployeeInfo(dao.getEmployeeInfo(1000));
		printEmployeeInfo(dao.getEmployeeInfo("1003"));
//		ArrayList<EmployeeInfoBean> arr=dao.getAllEmployeeInfo();
//		for (EmployeeInfoBean employeeInfoBean : arr) {
//			printEmployeeInfo(employeeInfoBean);
//		}
		
		
		//create an employeeinfobean 
		EmployeeInfoBean bean=new EmployeeInfoBean();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		bean.setId(1008);
		bean.setEmpName("Naren");
		bean.setAge(27);
		bean.setGender("male");
		bean.setSalary(56000.00);
		bean.setPhone(9632587410l);
		bean.setAccountNumber(14725836901l);
		bean.setJoiningDate(dateFormat.parse("2014-11-23"));
		bean.setEmail("naren@gmail.com");
		bean.setDob(dateFormat.parse("1992-10-12"));
		bean.setDesignation("salesman");
		bean.setDepartmentId(30);
		bean.setManagerId(1002);
		
		//log.info("Inserted the employee info? ->"+dao.createEmployeeInfo(bean));
		
		log.info("Deleted the employee info? ->"+dao.deleteEmployeeInfo(1007));
		
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
