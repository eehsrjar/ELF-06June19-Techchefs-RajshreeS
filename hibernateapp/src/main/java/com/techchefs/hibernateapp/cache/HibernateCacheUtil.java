package com.techchefs.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class HibernateCacheUtil {
	private static SessionFactory factory=null;
	private HibernateCacheUtil() {}
	private static SessionFactory buildFactory() {
		if(factory == null) {
			factory=new Configuration().configure("com/techchefs/hibernateapp/cache/hibernate.cache.cfg.xml").addAnnotatedClass(EmployeeInfoNew.class).buildSessionFactory();
		}
		return factory;
	}
	public static Session openSession() {
		return buildFactory().openSession();
	}
}
