package com.techchefs.javaapp.assignment.junit;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class ArrayListStudent {
	static Comparator<Student> c = (i, j) -> (i.perc).compareTo(j.perc);

	public static void main(String[] args) {
		Student s1 = new Student(4, "Anjali", 98.8);
		Student s2 = new Student(9, "Sonali", 40.0);
		Student s3 = new Student(2, "Maya", 58.8);
		Student s4 = new Student(3, "Geetha", 70.8);
		Student s5 = new Student(1, "Yogi", 55.5);

		ArrayList<Student> s = new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);

		Student st = getTopper(s);
		log.info("" + st.name + "  Percentage :" + st.perc);
		Student st1 = getLessPercStudent(s);
		log.info("" + st1.name + "  Percentage :" + st1.perc);

	}

	static Student getTopper(ArrayList<Student> al) {
		return al.stream().max(c).get();

	}

	static Student getLessPercStudent(ArrayList<Student> al) {
		return al.stream().min(c).get();

	}
}
