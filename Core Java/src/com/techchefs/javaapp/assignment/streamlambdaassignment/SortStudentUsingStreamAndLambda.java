package com.techchefs.javaapp.assignment.streamlambdaassignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.techchefs.javaapp.array.ForEachExample;

import lombok.extern.java.Log;

@Log
public class SortStudentUsingStreamAndLambda {

	public static void main(String[] args) {
		Comparator<Student> c = (i, j) -> {
			if(i.getId() > j.getId()) {
				return 1;
			}else if(i.getId() < j.getId()) {
				return -1;
			}else
			{
				return 0;
			}
		};
		TreeSet<Student> treeSet = new TreeSet<>(c);
		treeSet.add(new Student(4, "Anjali", 98.8,"Female"));
		treeSet.add(new Student(9, "Sonali", 40.0,"Female"));
		treeSet.add(new Student(2, "Mannoj", 58.8,"Male"));
		treeSet.add(new Student(3, "Geetha", 70.8,"Female"));
		treeSet.add(new Student(1, "Yogi", 55.5,"Male"));
		
		for (Student student : treeSet) {
			log.info(""+student.toString());
		}
				
	}

	
}
