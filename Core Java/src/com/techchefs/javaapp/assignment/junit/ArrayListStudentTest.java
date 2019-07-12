package com.techchefs.javaapp.assignment.junit;

import java.util.ArrayList;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


import lombok.extern.java.Log;

@Log
public class ArrayListStudentTest {
	private static  ArrayListStudent listStudent=new ArrayListStudent();
	private static ArrayList<Student> s = new ArrayList<>();
	static {
		Student s1 = new Student(4, "Anjali", 98.8);
		Student s2 = new Student(9, "Sonali", 40.0);
		Student s3 = new Student(2, "Maya", 58.8);
		Student s4 = new Student(3, "Geetha", 70.8);
		Student s5 = new Student(1, "Yogi", 55.5);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);

		@Test
		void testTopper() {
			Double expecteds=96.00;
			Double actuals=listStudent.getTopper(t);
			
			Assert.assertEquals(expecteds, actuals);
			
		}


	}

	
}
