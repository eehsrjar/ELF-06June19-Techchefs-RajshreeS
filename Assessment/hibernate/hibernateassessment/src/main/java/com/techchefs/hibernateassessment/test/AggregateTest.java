package com.techchefs.hibernateassessment.test;

import org.hibernate.Query;
import org.hibernate.Session;

import com.techchefs.hibernateassessment.util.HibernateUtil;

public class AggregateTest {
public static void main(String[] args) {
	Session session=HibernateUtil.openSession();
	Query query=session.createQuery("min(totalMarks) from Student");
	int res=query.executeUpdate();
}
}
