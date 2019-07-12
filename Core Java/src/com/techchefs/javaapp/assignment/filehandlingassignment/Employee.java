package com.techchefs.javaapp.assignment.filehandlingassignment;

public class Employee {
	String name;
	int id;
	double salary;
	int experience;
	String designation;
	public Employee(String name, int id, double salary, int experience, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.experience = experience;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public int getExperience() {
		return experience;
	}
	public String getDesignation() {
		return designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", experience=" + experience
				+ ", designation=" + designation + "]";
	}
	
	
}
