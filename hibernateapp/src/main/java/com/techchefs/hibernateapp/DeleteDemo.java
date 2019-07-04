package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;

public class DeleteDemo {

	public static void main(String[] args) {
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, 0);
		Transaction transaction=session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();
		
	}

}
