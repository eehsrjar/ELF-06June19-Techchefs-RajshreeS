package com.techchefs.designpatterns.dao;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.hibernate.HibernateException;
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
		//1.Load the config file
		Configuration configuration=new Configuration();
		configuration.configure();
//		configuration.configure("MyHibernateConfig.xml");
//		//configuration.configure(new File("D://MyHibernateConfig.xml"));
//		try {
//			configuration.configure(new URL("https://raw.githubusercontent.com/eehsrjar/ELF-06June19-Techchefs-RajshreeS/master/MyHibernateConfig.xml"));
//		} catch (HibernateException | MalformedURLException e) {
//			e.printStackTrace();
//		}
		
		
		//2.Build the SessionFactory
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//3.Open Session
		Session session = sessionFactory.openSession();
		
		//4.Interact with DB via Session
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		
		//5.close Session
		session.close();
		return bean;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
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
