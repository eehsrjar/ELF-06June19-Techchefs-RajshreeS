package com.techchefs.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.techchefs.springcore.beans.DepartmentBean;
import com.techchefs.springcore.beans.Employee;

@Configuration
@Import(DepartmentConfig.class)
public class EmployeeConfig {
	@Bean
	public Employee getEmpBean() {
		Employee emp=new Employee();
		emp.setId(10);
		emp.setName("spring");
		return emp;
	}	
}
