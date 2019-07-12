package com.techchefs.javaapp.assignment.streamlambdaassignment;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ForEachEmployee {
	public static void main(String[] args) {
		Employee e=new Employee("RAjshree", 20,  20000,2,"Developer");
		Employee e1=new Employee("Nagesh", 10,  15000,2,"Tester");
		Employee e2=new Employee("Maya", 30,  10000,2,"Analyst");
		Employee e3=new Employee("lAKA", 3,  40000,2,"Developer");
		ArrayList<Employee> arr=new ArrayList<Employee>();
		arr.add(e);
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		arr.stream().forEach(i->log.info(i+""));

	}
}
