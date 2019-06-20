package com.techchefs.javaapp.collection;

public class Student implements Comparable<Student>{
	String name;
	int id;
	double per;	

	public Student(String name, int id, double per) {
		super();
		this.name = name;
		this.id = id;
		this.per = per;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", per=" + per + "]";
	}
	/*Logic to sort students with respect to name*/
	@Override
	public int compareTo(Student s) 
	{		
		return (this.name).compareTo(s.name);
	}

	/*Logic to sort students with respect to id*/
	/*
	 * @Override public int compareTo(Student s) { if(this.id < s.id) { return -1; }
	 * else if(this.id > s.id) { return 1; } return 0; }
	 */


	/*Logic to sort students with respect to percentage*/
	/*public int compareTo(Student s) {
		if(this.per < s.per)
		{
			return -1;
		}
		else if(this.per > s.per)
		{
			return 1;
		}
		return 0;
	}*/



}
