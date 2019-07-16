package com.techchefs.springcore.beans;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class Employee {
	String name;
	int id;	
	DepartmentBean deptBean;
	public void init() {
		log.info("Initializing bean");
	}
	
	public void destroy() {
		log.info("Destroying bean");
	}
}
