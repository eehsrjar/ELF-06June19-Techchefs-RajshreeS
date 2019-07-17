package com.techchefs.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Employee {
	String name;
	int id;	
	@Resource(name="hr")
	DepartmentBean deptBean;
	public Employee() {}
//	public Employee(String name, int id, DepartmentBean deptBean) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.deptBean = deptBean;
//	}
	@PostConstruct
	public void init() {
		log.info("Initializing bean");
	}
	@PreDestroy
	public void destroy() {
		log.info("Destroying bean");
	}

	
}
