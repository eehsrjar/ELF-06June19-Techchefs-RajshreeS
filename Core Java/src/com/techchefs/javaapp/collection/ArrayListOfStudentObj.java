package com.techchefs.javaapp.collection;

import java.util.ArrayList;

public class ArrayListOfStudentObj {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		
		Student s=new Student("Ram", 12, 56.90);
		Student s1=new Student("Sham", 10, 70.90);
		Student s2=new Student("Ram", 12, 80.00);
		
		arr.add(s);
		arr.add(s1);
		arr.add(s2);
		
		for(Student st : arr)
		{
			System.out.println(st);
		}
		
		for(int i=0;i<arr.size();i++) 
		{
			
		}
	}

}
