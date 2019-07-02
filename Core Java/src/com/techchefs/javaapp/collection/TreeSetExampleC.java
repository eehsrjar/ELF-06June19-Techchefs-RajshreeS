package com.techchefs.javaapp.collection;

import java.util.TreeSet;

public class TreeSetExampleC {

	public static void main(String[] args) {
		TreeSet<Student> tr= new TreeSet<Student>();
		Student s=new Student("Ram", 12, 56.90);
		Student s1=new Student("Sham", 10, 80.00);
		Student s2=new Student("Anil", 2, 70.79);

		tr.add(s);
		tr.add(s1);
		tr.add(s2);
		
		for(Student st : tr)
		{
			System.out.println(st);
		}
	}

}
