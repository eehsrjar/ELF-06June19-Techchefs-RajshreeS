package com.techchefs.warehouse.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techchefs.warehouse.beans.ItemBean;
import com.techchefs.warehouse.util.HibernateUtil;

public class AddTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Session session=context.getBean(HibernateUtil.class).openSession();
		
		ItemBean bean=new ItemBean();
		bean.setItemId(104);
		bean.setName("Harddisk");
		bean.setDescription("Sony");
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
