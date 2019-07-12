package com.techchefs.javaapp.assignment.streamlambdaassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.techchefs.javaapp.assignment.filehandlingassignment.Student;

import lombok.extern.java.Log;
@Log
public class StudentWithDistinction {
public static void main(String[] args) {
	ArrayList<Student> arr=new ArrayList<>();
	arr.add(new Student(2, "Ram", 30.9, "Male"));
	arr.add(new Student(6, "Maya", 67.9, "Female"));
	arr.add(new Student(3, "Jack", 86.9, "Male"));
	arr.add(new Student(8, "Neha", 76.9, "Female"));
	
	Predicate<Student> x1 = i -> i.getPercentage() < 35.00;
	List<Student> x = arr.stream().filter(x1).collect(Collectors.toList());
	for(Student s:x) {
		log.info(""+s);
	}

}
}
