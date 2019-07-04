package com.techchefs.hibernateapp;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeOtherInfoBean;

public class UpdateRecord {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
//		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, 0);
//		bean.setJoiningDate(dateFormat.parse("2010-08-30"));
		EmployeeOtherInfoBean bean =session.get(EmployeeOtherInfoBean.class, 100);
		bean.setReligion("Hindu");
		
		Transaction transaction=session.beginTransaction();
		session.update(bean);
		transaction.commit();
		session.close();
	}

}
