package com.techchefs.warehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techchefs.warehouse.beans.ItemBean;
import com.techchefs.warehouse.config.HibernateConfig;

public class AddItem {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory= context.getBean(SessionFactory.class);
		Session session=factory.openSession();
		
		ItemBean bean=new ItemBean();
		bean.setItemId(102);
		bean.setName("Keyboard");
		bean.setDescription("Dell");
		bean.setQuantity(2);
		bean.setCost(1000.00);
		
		Transaction txn=null;
		try {
			txn=session.beginTransaction();
			session.save(bean);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
			
		}
	}
}
