package com.techchefs.javaapp.implementinglambda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Abc", 1, 15000.00);
		Employee e2 = new Employee("Xyz", 2, 40000.00);
		Employee e3 = new Employee("Pqr", 3, 10000.00);
		Employee e4 = new Employee("Jkl", 5, 5000.00);
		Employee e5 = new Employee("Str", 18, 11000.00);

		Comparator<Employee> c = (a, b) -> (a.name).compareTo(b.name);

		TreeSet<Employee> ts = new TreeSet<>(c);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		for (Employee e : ts) {
			log.info("Id: " + e.id);
			log.info("Name : " + e.name);
			log.info("Salary " + e.salary);
			log.info("***************");
		}

	}

}
