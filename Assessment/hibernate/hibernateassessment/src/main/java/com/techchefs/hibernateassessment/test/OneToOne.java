package com.techchefs.hibernateassessment.test;

import com.techchefs.hibernateassessment.dto.StudentInfo;

public class OneToOne {
	public static void main(String[] args) {
		StudentInfo student=new StudentInfo();
		student.setRollNum(100);
		student.setName("abd");
		student.setAge(45);
		student.setEmailId("abc@gamil.com");
		student.setGender("female");
	}
}
