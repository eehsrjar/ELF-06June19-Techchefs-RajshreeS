package com.techchefs.springhibernateintegrationapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.springhibernateintegrationapp.beans.EmployeeInfoBean;
import com.techchefs.springhibernateintegrationapp.config.HibernateConfig;
import com.techchefs.springhibernateintegrationapp.dao.CRUDOperation;

import lombok.extern.java.Log;
@Log
public class SpringHibernateIntegrationTest {
	public static void main(String[] args) throws ParseException {
		CRUDOperation operation=new CRUDOperation();
		//Read operation
		EmployeeInfoBean bean=operation.getData(1007);
		
		if(bean !=null) {
			log.info("ID  ====>" + bean.getId());
			log.info("Name  ====>" + bean.getEmpName());
			log.info("Password ====>"+bean.getPassword());
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
		}
		
		//Insert Operation
		EmployeeInfoBean bean1=new EmployeeInfoBean();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		bean1.setId(1008);
		bean1.setEmpName("Naren");
		bean1.setAge(27);
		bean1.setGender("male");
		bean1.setSalary(56000.00);
		bean1.setPhone(9632587410l);
		bean1.setAccountNumber(14725836901l);
		bean1.setJoiningDate(dateFormat.parse("2014-11-23"));
		bean1.setEmail("naren@gmail.com");
		bean1.setDob(dateFormat.parse("1992-10-12"));
		bean1.setDesignation("salesman");
		bean1.setDepartmentId(30);
		bean1.setManagerId(1002);
		operation.addUpdateData(bean1);
		
		//Delete Operation
		operation.removeData(100);
	}
}
