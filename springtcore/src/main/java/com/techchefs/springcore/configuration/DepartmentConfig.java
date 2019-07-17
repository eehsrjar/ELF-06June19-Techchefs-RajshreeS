package com.techchefs.springcore.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.techchefs.springcore.beans.DepartmentBean;
import com.techchefs.springcore.beans.Employee;

@Configuration
public class DepartmentConfig {
	
	@Bean(name = "it")
	public DepartmentBean getDeptBean() {
		DepartmentBean bean=new DepartmentBean();
		bean.setDeptId(1);
		bean.setDeptName("IT");
		return bean;
	}
	@Bean(name="hr")
	public DepartmentBean getDepHR() {
		DepartmentBean bean=new DepartmentBean();
		bean.setDeptId(2);
		bean.setDeptName("HR");
		return bean;
	}
	@Bean(name="testing")
	public DepartmentBean getDeptTesting() {
		DepartmentBean bean=new DepartmentBean();
		bean.setDeptId(3);
		bean.setDeptName("Testing");
		return bean;
	}
}
