package com.techchefs.hibernateassessment.util;

/*Question 4. Write a Session Factory singleton class to get session object.*/
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory=null;
	private HibernateUtil() {}
	private static SessionFactory buildSessionfactory() {
		return new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		if(factory==null) {
			factory=buildSessionfactory();
		}
		return factory;
	}
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}
