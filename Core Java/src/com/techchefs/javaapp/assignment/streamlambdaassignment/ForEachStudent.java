package com.techchefs.javaapp.assignment.streamlambdaassignment;

import java.util.ArrayList;

import com.techchefs.javaapp.assignment.filehandlingassignment.Student;

import lombok.extern.java.Log;

@Log
public class ForEachStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> arr=new ArrayList<>();
		arr.add(new Student(2, "Ram", 56.9, "Male"));
		arr.add(new Student(6, "Maya", 67.9, "Female"));
		arr.add(new Student(3, "Jack", 86.9, "Male"));
		arr.add(new Student(8, "Neha", 76.9, "Female"));
		arr.stream().forEach(i->log.info(i+""));

	}
}
