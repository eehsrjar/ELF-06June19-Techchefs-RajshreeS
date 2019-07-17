package com.techchefs.springcore.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.techchefs.springcore.beans.DepartmentBean;
import com.techchefs.springcore.beans.Employee;
import com.techchefs.springcore.configuration.DepartmentConfig;
import com.techchefs.springcore.configuration.EmployeeConfig;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		//ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class,DepartmentConfig.class);

		Employee bean = context.getBean(Employee.class);
		log.info("" + bean.getId());
		log.info("" + bean.getName());
		DepartmentBean deptBean=bean.getDeptBean();
		log.info("" + deptBean.getDeptId());
		log.info("" + deptBean.getDeptName());

		((AbstractApplicationContext) context).close();
	}

}
