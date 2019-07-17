package com.techchefs.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.springcore.beans.Employee;

import lombok.extern.java.Log;
@Log
public class EmployeeWithDepartmentConstructor {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("empBeans.xml");
		Employee emp=(Employee) context.getBean("emp");
		log.info("Id: "+emp.getId());
		log.info("Name: "+emp.getName());
		log.info("Id: "+emp.getDeptBean().getDeptId());
		log.info("Name: "+emp.getDeptBean().getDeptName());
		
	}
}
