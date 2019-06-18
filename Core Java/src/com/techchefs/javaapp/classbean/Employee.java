
package com.techchefs.javaapp.classbean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class Employee implements Serializable{
	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joiningDate;
	private String gender;



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", age="
				+ age + ", joiningDate=" + joiningDate + ", gender=" + gender + "]";
	}
	

}
