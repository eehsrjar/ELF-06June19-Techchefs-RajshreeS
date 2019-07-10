package com.techchefs.mywebapp.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;
import com.techchefs.mywebapp.util.HibernateUtil;


public class EmployeeDAOHibernateImpl implements EmployeeDAO{

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session=HibernateUtil.openSession();
		Query query=session.createQuery("from EmployeeInfoBean");
		
		return (List<EmployeeInfoBean>) query.list();
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		EmployeeInfoBean bean=null;
		try(Session session=HibernateUtil.openSession();){
			bean=session.get(EmployeeInfoBean.class, id);
		}
		return bean;
	}
	
	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn=null;
		try(Session session=HibernateUtil.openSession();){
			txn=session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		}catch(Exception e) {
			if(txn!=null) {
				txn.rollback();
			}
			return false;
		}
		
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
