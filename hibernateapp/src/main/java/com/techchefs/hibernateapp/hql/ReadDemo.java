package com.techchefs.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory =HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
//		String hql="from EmployeeInfoBean";
//		Query query=session.createQuery(hql);
//		List<EmployeeInfoBean> employeeInfoBeans= query.list();
//		for (EmployeeInfoBean bean : employeeInfoBeans) {
//			log.info("ID  ====>" + bean.getId());
//			log.info("Name  ====>" + bean.getEmpName());
//			log.info("Age  ====>" +bean.getAge());
//			log.info("Phone  ====>" +bean.getPhone() );
//			log.info("Gender  ====>" +bean.getGender() );
//			log.info("Salary  ====>" +bean.getSalary());
//			log.info("Joining Date  ====>" + bean.getJoiningDate());
//			log.info("Account number  ====>" + bean.getAccountNumber());
//			log.info("Email  ====>" + bean.getEmail());
//			log.info("Designation  ====>" +bean.getDesignation() );
//			log.info("DOB  ====>" + bean.getDob());
//			log.info("DEPT_NO  ====>" + bean.getDeptId());
//			log.info("MNGR ID  ====>" + bean.getMngrId());
//			log.info("***************************************");
//		}
		
		String hql="Select empName from EmployeeInfoBean";
		Query query=session.createQuery(hql);
		List<String> empName=query.list();
		for (String name : empName) {
			log.info("Employee name: "+name);
		}
		
		
	}

}
