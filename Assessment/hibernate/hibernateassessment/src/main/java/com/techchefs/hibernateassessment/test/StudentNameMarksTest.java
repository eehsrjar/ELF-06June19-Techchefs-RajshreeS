package com.techchefs.hibernateassessment.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import com.techchefs.hibernateassessment.dto.Student;
import com.techchefs.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class StudentNameMarksTest {
	public static void main(String[] args) {
		Session session=HibernateUtil.openSession();
		String hql="select s.firstName,s.totalMarks from Student s";
		Query<Student> query=session.createQuery(hql);
		List<Student> list=query.list();
		for (Student student : list) {
			log.info("FirstName : "+student.getFirstName());
			log.info("Totalmarks : "+student.getTotalMarks());
		}
	}
}
