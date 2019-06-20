package com.techchefs.javaapp.collection;

import java.util.TreeSet;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		EmployeeId i = new EmployeeId();
		EmployeeBySalary s = new EmployeeBySalary();
		EmployeeByName n = new EmployeeByName();
		TreeSet<Employee> te = new TreeSet<Employee>(n);
		
		Employee e1 = new Employee();
		e1.name = "Neha";
		e1.id = 2;
		e1.salary = 50000.00;
		
		Employee e2 = new Employee();
		e2.name = "Minku";
		e2.id = 7;
		e2.salary = 80000.00;
		
		Employee e3 = new Employee();
		e3.name = "Arpitha";
		e3.id = 1;
		e3.salary = 30000.00;
		
		te.add(e1);
		te.add(e2);
		te.add(e3);
		
		for(Employee e : te)
		{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
			System.out.println("*******************");
		}
	}

}
