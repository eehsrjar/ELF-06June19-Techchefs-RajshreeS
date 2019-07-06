package com.techchefs.hibernateapp.manytoonemngrid;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateImpl {
	private SessionFactory factory=new Configuration().configure("com/techchefs/hibernateapp/onetomany/hibernate.cfg.xml").buildSessionFactory();
	public void createEmployee(EmployeeInfoBean empBean ) {
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(empBean);
		txn.commit();
		session.close();
	}
	
	
}
