package com.techchefs.hibernateapp.manytoonemngrid;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class HibernateManyToOneTest {
	public static void main(String[] args) throws ParseException {
		//EmployeeInfoBean bean1=new EmployeeInfoBean();
		
		
		
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(1113);
		bean.setEmpName("Soundarya");
		bean.setAge(23);
		bean.setGender("female");
		bean.setSalary(50000.00);
		bean.setPhone(9632587120l);
		bean.setAccountNumber(14725836671l);
		bean.setJoiningDate(dateFormat.parse("2017-12-23"));
		bean.setEmail("soundarya@gmail.com");
		bean.setDob(dateFormat.parse("1993-10-12"));
		bean.setDesignation("Software Trainee");
		bean.setDepartmentId(20);
		
		HibernateImpl impl=new HibernateImpl();
		impl.createEmployee(bean);
	}
}
