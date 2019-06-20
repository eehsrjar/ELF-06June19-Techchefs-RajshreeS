package com.techchefs.javaapp.array;

import java.util.Date;

import com.techchefs.javaapp.classbean.Employee;

public class EmployeeObjectUsingForEach {

	public static void main(String[] args) {
		Employee[] emp=new Employee[3];
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Radha");
		e1.setAge(20);	
		e1.setGender("Female");
		e1.setSalary(2000.0);
		e1.setDepartment("comp");
		e1.setJoiningDate(new Date(20/06/1995));
		
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("Mini");
		e2.setAge(89);	
		e2.setGender("Female");
		e2.setSalary(2000.0);
		e2.setDepartment("EC");
		e2.setJoiningDate(new Date(2/06/1998));
		
		Employee e3=new Employee();
		e3.setId(3);
		e3.setName("Mohan");
		e3.setAge(20);	
		e3.setGender("male");
		e3.setSalary(67890.0);
		e3.setDepartment("Mech");
		e3.setJoiningDate(new Date(20/07/200));
		
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		System.out.println(emp.length);
		for(Employee obj : emp)
		{
			System.out.println(obj);
			
		}
		
	}

}
