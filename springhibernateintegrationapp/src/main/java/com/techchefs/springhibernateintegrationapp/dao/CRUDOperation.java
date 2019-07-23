package com.techchefs.springhibernateintegrationapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.springhibernateintegrationapp.beans.EmployeeInfoBean;
import com.techchefs.springhibernateintegrationapp.config.HibernateConfig;

public class CRUDOperation {
	ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
	SessionFactory factory=context.getBean(SessionFactory.class);
	public EmployeeInfoBean getData(int id) {
		Session session=factory.openSession();
		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}
	public void addUpdateData(EmployeeInfoBean bean) {
		Session session=factory.openSession();
		Transaction txn=null;
		try {
			txn=session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			
		}
	}
	public void removeData(int id) {
		Session session=factory.openSession();
		Transaction txn=null;
		try {
			txn=session.beginTransaction();
			session.delete(id);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			
		}
	}
}
