package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTest {
	public static void main(String[] args) {
		//1.Load the config file
		Configuration configuration=new Configuration();
		configuration.configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml");
		configuration.addAnnotatedClass(EmployeeInfoNew.class);
		
		//2.Build Session Factory
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//3.Open Session
		Session session=sessionFactory.openSession();
		
		//4.Interact with DB via session
		EmployeeInfoNew employeeInfoNew=session.get(EmployeeInfoNew.class, 1000);
		log.info("Id  "+employeeInfoNew.getId());
		log.info("Name  "+employeeInfoNew.getName());
		log.info("Email  "+employeeInfoNew.getEmail());
		log.info("Bean"+employeeInfoNew.toString());
		
		EmployeeInfoNew employeeInfoNew1=session.get(EmployeeInfoNew.class, 1000);
	
		log.info("2nd time"+employeeInfoNew1.toString());
		
		EmployeeInfoNew employeeInfoNew2=session.get(EmployeeInfoNew.class, 1000);
		
		log.info("3rd time"+employeeInfoNew2.toString());
		
		//5.Close session
		session.close();
		
	}
}
