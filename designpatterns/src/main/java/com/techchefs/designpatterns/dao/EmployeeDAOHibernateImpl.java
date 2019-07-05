package com.techchefs.designpatterns.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.designpatterns.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO{

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;
	}

}
