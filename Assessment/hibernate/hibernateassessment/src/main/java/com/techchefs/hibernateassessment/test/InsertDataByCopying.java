package com.techchefs.hibernateassessment.test;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import com.techchefs.hibernateassessment.dto.TestBean;
import com.techchefs.hibernateassessment.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class InsertDataByCopying {
	public static void main(String[] args) {
		Session session=HibernateUtil.openSession();
		Query query=session.createQuery("insert into TestBean(id,firstName,lastName,city) select id,firstName,lastName,city from CustomerBean");
		int res=query.executeUpdate();
		if(res>0) {
			log.info("Data added");
		}else {
			log.info("Wrong");
		}
	}
}
