package com.techchefs.javaapp.lambdaexp;

public class Student {
	String name;
	int m1;
	int m2;
	int m3;
	
	public Student(String name, int m1, int m2, int m3) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	void average(Student s)
	{
		int avg = (s.m1+s.m2+s.m3)/3;
		System.out.println(s.name+ " Average is  "+avg);
	}
	
}
