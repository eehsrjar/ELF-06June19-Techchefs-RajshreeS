package com.techchefs.javaapp.referenceoperator;

public class StudentAvgTest {

	public static void main(String[] args) {
		Student s = new Student();

		Average a = s::calculateAvg;
		a.avg(20, 30, 40);
	}

}
