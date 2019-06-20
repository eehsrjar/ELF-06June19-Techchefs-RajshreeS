package com.techchefs.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorEx {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		Student s=new Student("Ram", 12, 56.90);
		Student s1=new Student("Sham", 10, 70.90);
		Student s2=new Student("Anil", 2, 80.00);

		arr.add(s);
		arr.add(s1);
		arr.add(s2);
		
		Iterator<Student> it =arr.iterator();
		while(it.hasNext())
		{
			Student st = it.next();
			System.out.println("Id is "+st.getId());
			System.out.println("Name is "+st.getName());
			System.out.println("Percentage is "+st.getPer());
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}

}
