package com.techchefs.javaapp.classbean;

import java.util.logging.Logger;

public class EmployeeBeanMain {
	private static final Logger loger = Logger.getLogger("Employee");
	public static void main(String[] args) {
		Employee e = new Employee();
		loger.info("Without Lombok ===>"+e.toString());
		
		EmployeeBean b = new EmployeeBean();
		b.setAge(45);
		loger.info("Without Lombok ===>"+b.toString());
	}

}
