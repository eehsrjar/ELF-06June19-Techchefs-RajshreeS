package com.techchefs.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory = null;	

	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		factory = configuration.buildSessionFactory();
		return factory;
	}

	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory=buildSessionFactory();
			return factory;
		}
		return factory;
	}
}
