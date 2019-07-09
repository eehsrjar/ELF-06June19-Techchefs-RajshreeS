package com.techchefs.hibernateapp.criteria;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailUsingProjection {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection projection1 = Projections.property("empName");
		Projection projection2 = Projections.property("id");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection1);
		projectionList.add(projection2);
		criteria.setProjection(projectionList);

		List<Object[]> list = criteria.list();
		for (Object[] obj : list) {

			log.info("" + obj[0]);
			log.info("" + obj[1]);
		}
	}
}
