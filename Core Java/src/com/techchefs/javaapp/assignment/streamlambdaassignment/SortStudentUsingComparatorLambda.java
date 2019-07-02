package com.techchefs.javaapp.assignment.streamlambdaassignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class SortStudentUsingComparatorLambda {

	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(4, "Anjali", 98.8,"Female"));
		arrayList.add(new Student(9, "Sonali", 40.0,"Female"));
		arrayList.add(new Student(2, "Mannoj", 58.8,"Male"));
		arrayList.add(new Student(3, "Geetha", 70.8,"Female"));
		arrayList.add(new Student(1, "Yogi", 55.5,"Male"));
		
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

		List<Student> li = arrayList.stream().sorted(c).collect(Collectors.toList());
		log.info("" + li);
		
		li.stream().forEach(i->log.info(""+i.toString()));
		
	}

}
