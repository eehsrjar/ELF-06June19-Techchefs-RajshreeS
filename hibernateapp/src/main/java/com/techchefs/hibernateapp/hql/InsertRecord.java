package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class InsertRecord {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		String hql="insert into EmployeeInfoNew(id,name,email) select id,empName,email from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		Transaction transaction=null;
		int res;
		
		try {
			transaction=session.beginTransaction();
			res=query.executeUpdate();
			transaction.commit();
			log.info("result: "+res);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			session.close();
		}
	}
}
