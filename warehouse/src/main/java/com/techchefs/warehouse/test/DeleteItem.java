package com.techchefs.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.warehouse.beans.ItemBean;
import com.techchefs.warehouse.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class DeleteItem {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();
		
		ItemBean bean=session.get(ItemBean.class, 100);
		
		
		Transaction txn=null;
		try {
			txn=session.beginTransaction();
			session.delete(bean);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			
		}
	}
}
