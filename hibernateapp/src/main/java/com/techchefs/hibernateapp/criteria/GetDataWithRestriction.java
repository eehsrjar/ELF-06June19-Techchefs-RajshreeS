package com.techchefs.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class GetDataWithRestriction {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(EmployeeInfoBean.class);
		Criterion criterion= Restrictions.eq("id", 1000);
		criteria.add(criterion);
		EmployeeInfoBean bean=(EmployeeInfoBean) criteria.uniqueResult();
//		List<EmployeeInfoBean> beans=criteria.list();
//		for (EmployeeInfoBean bean : beans) {
			log.info("ID  ====>" + bean.getId());
			log.info("Name  ====>" + bean.getEmpName());
			log.info("Age  ====>" +bean.getAge());
			log.info("Phone  ====>" +bean.getPhone() );
			log.info("Gender  ====>" +bean.getGender() );
			log.info("Salary  ====>" +bean.getSalary());
			log.info("Joining Date  ====>" + bean.getJoiningDate());
			log.info("Account number  ====>" + bean.getAccountNumber());
			log.info("Email  ====>" + bean.getEmail());
			log.info("Designation  ====>" +bean.getDesignation() );
			log.info("DOB  ====>" + bean.getDob());
			log.info("DEPT_NO  ====>" + bean.getDeptId());
			log.info("MNGR ID  ====>" + bean.getMngrId());
			log.info("***************************************");
		//}
			
			
	}
}
