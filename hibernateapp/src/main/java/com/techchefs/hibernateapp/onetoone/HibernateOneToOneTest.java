package com.techchefs.hibernateapp.onetoone;

import java.text.ParseException;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techchefs.hibernateapp.util.HibernateUtil;
import com.techchefs.hibernateapp.util.PrepareDataUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {
	public static void main(String[] args) throws ParseException {
		int id=1446;
		EmployeeOtherInfoBean data=PrepareDataUtil.prepareData(id);
		save(data);
	}
	
	private static void save(EmployeeOtherInfoBean data) {
		Transaction txn=null;
		try(SessionFactory factory=HibernateUtil.getSessionFactory();
				Session session=factory.openSession();){
				 txn=session.beginTransaction();
				 session.save(data);
				 txn.commit();
		}catch(Exception ex) {
			log.severe(Arrays.toString(ex.getStackTrace()));
			if(txn!=null) {
				txn.rollback();
			}
		}
	}
}
