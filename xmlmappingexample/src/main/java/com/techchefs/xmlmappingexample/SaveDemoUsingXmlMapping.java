package com.techchefs.xmlmappingexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.xmlmappingexample.dto.DepartmentInfoBean;

import lombok.extern.java.Log;
@Log
public class SaveDemoUsingXmlMapping {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		DepartmentInfoBean bean=new DepartmentInfoBean();
		bean.setDeptId(50);
		bean.setDeptName("HR");
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(bean);
		transaction.commit();
//		DepartmentInfoBean bean=session.get(DepartmentInfoBean.class, 10);
//		
//		log.info("Dept Id :"+bean.getDeptId());
//		log.info("Dept Name :"+bean.getDeptName());
		
		session.close();
	}
}
