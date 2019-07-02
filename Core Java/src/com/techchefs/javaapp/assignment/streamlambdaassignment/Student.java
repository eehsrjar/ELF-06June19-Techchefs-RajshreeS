package com.techchefs.javaapp.assignment.streamlambdaassignment;

public class Student {
	private int id;
	private String name;
	private double percentage;
	private String gender;

	public Student(int id, String name, double percentage, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.gender = gender;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getPercentage() {
		return this.percentage;
	}

	public String getGender() {
		return this.gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", gender=" + gender + "]";
	}
	
}
