package com.techchefs.hibernateassessment.test;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

import com.techchefs.hibernateassessment.dto.Student;
import com.techchefs.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class StoredProcedureTest {
	public static void main(String[] args) {
		Session session=HibernateUtil.openSession();
		StoredProcedureQuery query=session.createStoredProcedureCall("getDetails");
		session.close();
		List<Student> list=(List<Student>)query.getResultList();
		
		  for (Student student : list) {
		  log.info("FirstName : "+student.getFirstName());
		  log.info("Totalmarks : "+student.getTotalMarks()); }
		 
	}
}
