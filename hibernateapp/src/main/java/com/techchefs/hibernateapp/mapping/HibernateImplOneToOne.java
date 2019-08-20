package com.techchefs.hibernateapp.mapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class HibernateImplOneToOne {
	private SessionFactory factory1=new Configuration().configure("com/techchefs/hibernateapp/onetoone/hibernate.cfg.xml").buildSessionFactory();
	public void createEmployeeBeanWithOtherInfo(EmployeeInfoBean bean,EmployeeOtherInfoBean otherBean) {
		Session session=factory1.openSession();
		Transaction txn=session.beginTransaction();
		session.save(bean);
		session.save(otherBean);
		txn.commit();
		session.close();
	}
	public void createEmployeeInfo(EmployeeInfoBean bean,EmployeeOtherInfoBean otherBean) {
		Session session=factory1.openSession();
		Transaction txn=session.beginTransaction();
		session.save(bean);
		session.save(otherBean);
		txn.commit();
		session.close();
	}
	
}
