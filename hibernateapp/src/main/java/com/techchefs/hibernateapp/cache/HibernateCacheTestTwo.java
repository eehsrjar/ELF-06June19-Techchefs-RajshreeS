package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;




@Log
public class HibernateCacheTestTwo {
	public static void main(String[] args) {

		log.info("1st time " + getEmpployeeData(1000).toString());
		log.info("2nd time " + getEmpployeeData(1000).toString());
		log.info("3rd time " + getEmpployeeData(1000).toString());
	}

	private static EmployeeInfoNew getEmpployeeData(int id) {
		// 1.Load the config file
		Configuration configuration = new Configuration();
		configuration.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
		configuration.addAnnotatedClass(EmployeeInfoNew.class);

		// 2.Build Session Factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// 3.Open Session
		Session session = sessionFactory.openSession();

		// 4.Interact with DB via session
		EmployeeInfoNew employeeInfoNew = session.get(EmployeeInfoNew.class, id);


		// 5.Close session
		session.close();
		return employeeInfoNew;
	}
}
