package com.techchefs.hibernateassessment.cache;

import org.hibernate.Session;

import lombok.extern.java.Log;
@Log
public class CacheTest {
	public static void main(String[] args) {
		log.info("First Time"+getEmployeeInfo(100));
		log.info("Second Time"+getEmployeeInfo(100));
		log.info("Third Time"+getEmployeeInfo(100));
	}
	private static EmployeeInfoBean getEmployeeInfo(int id) {
		Session session=HibernateUtil.openSession();
		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, id);
		return bean;
	}
}
