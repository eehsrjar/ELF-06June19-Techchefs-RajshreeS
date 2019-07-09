package com.techchefs.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		int result;
		Transaction transaction = null;
		String hqi="update from EmployeeInfoBean set deptId="+args[0]+" where id="+Integer.parseInt(args[1])+"";
		Query query=session.createQuery(hqi);
//		query.setParameter("did", Integer.parseInt(args[0]));
//		query.setParameter("eid", Integer.parseInt(args[1]));
		
		try {
			transaction = session.beginTransaction();
//			String hql =  "update from EmployeeInfoBean set empName='Jayesh' where id=:eid";
//			Query query = session.createQuery(hql);
//			query.setParameter("eid", 1003);
			
			result = query.executeUpdate();
			transaction.commit();
			log.info("Result :" + result);
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}

	}

}
