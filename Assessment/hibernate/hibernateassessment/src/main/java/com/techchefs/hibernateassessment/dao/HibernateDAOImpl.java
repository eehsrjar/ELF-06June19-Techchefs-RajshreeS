package com.techchefs.hibernateassessment.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techchefs.hibernateassessment.dto.CustomerBean;
import com.techchefs.hibernateassessment.util.HibernateUtil;

public class HibernateDAOImpl implements HibernateDAO{
	SessionFactory factory=HibernateUtil.getSessionFactory();
	Transaction txn=null;
	@Override
	public boolean saveOrUpdate(CustomerBean bean) {
		Session session=factory.openSession();
		try {
		txn=session.beginTransaction();
		session.saveOrUpdate(bean);
		txn.commit();
		return true;
		}catch(Exception ex) {
			txn.rollback();			
			return false;
		}finally {
			session.close();
		}
		
	}

	@Override
	public CustomerBean getCustomerInfo(int id) {
		Session session=factory.openSession();
		CustomerBean bean=session.get(CustomerBean.class, id);
		session.close();
		return bean;
	}

	@Override
	public boolean deleteCustomerInfo(int id) {
		Session session=factory.openSession();
		try {
		txn=session.beginTransaction();
		CustomerBean bean=session.get(CustomerBean.class, id);
		session.delete(bean);
		txn.commit();
		return true;
		}catch(Exception ex) {
			txn.rollback();			
			return false;
		}finally {
			session.close();
		}
	}

}
