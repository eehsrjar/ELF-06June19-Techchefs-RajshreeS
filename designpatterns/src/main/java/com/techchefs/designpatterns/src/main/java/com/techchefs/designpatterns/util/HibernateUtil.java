package com.techchefs.designpatterns.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;

public class HibernateUtil {

	private static SessionFactory factory = null;
	
	private HibernateUtil() {}

	private static SessionFactory buildSessionFactory() {
		return  new Configuration().configure().addAnnotatedClass(EmployeeInfoBean.class).buildSessionFactory();
	}

	private static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory=buildSessionFactory();
			return factory;
		}
		return factory;
	}
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
}
