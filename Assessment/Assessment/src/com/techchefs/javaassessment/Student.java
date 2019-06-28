package com.techchefs.javaassessment;

public class Student {
	int roleNumber;
	String name;
	double percentage;

	public Student(int roleNumber, String name, Double percentage) {
		this.roleNumber = roleNumber;
		this.name = name;
		this.percentage = percentage;
	}

	public int getRoleNumber() {
		return this.roleNumber;
	}

	public String getName() {
		return this.name;
	}

	public double getPercentage() {
		return this.percentage;
	}

	@Override
	public String toString() {
		return "Student [roleNumber=" + roleNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
}
