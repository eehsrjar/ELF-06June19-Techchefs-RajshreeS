package com.techchefs.javaapp.collection;

import java.util.Comparator;

public class EmployeeBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.id > e2.id)
		{
			return 1;
		}
		else if(e1.id < e2.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	

}
