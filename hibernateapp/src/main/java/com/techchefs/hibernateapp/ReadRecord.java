package com.techchefs.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
public class ReadRecord {

	public static void main(String[] args) {
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
//		EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, 1000);
//		log.info("ID  ====>" + bean.getId());
//		log.info("Name  ====>" + bean.getEmpName());
//		log.info("Age  ====>" +bean.getAge());
//		log.info("Phone  ====>" +bean.getPhone() );
//		log.info("Gender  ====>" +bean.getGender() );
//		log.info("Salary  ====>" +bean.getSalary());
//		log.info("Joining Date  ====>" + bean.getJoiningDate());
//		log.info("Account number  ====>" + bean.getAccountNumber());
//		log.info("Email  ====>" + bean.getEmail());
//		log.info("Designation  ====>" +bean.getDesignation() );
//		log.info("DOB  ====>" + bean.getDob());
//		log.info("DEPT_NO  ====>" + bean.getDeptId());
//		log.info("MNGR ID  ====>" + bean.getMngrId());
//		log.info("***************************************");
		
		EmployeeOtherInfoBean bean =session.get(EmployeeOtherInfoBean.class, 100);
		
		log.info("ID  ====>" + bean.getId());
		log.info("Challenged status  ====>" + bean.getIsChallenged());
//		log.info("Name  ====>" + bean.getEmpName());
//		log.info("Age  ====>" +bean.getAge());
//		log.info("Phone  ====>" +bean.getPhone() );
//		log.info("Gender  ====>" +bean.getGender() );
//		log.info("Salary  ====>" +bean.getSalary());
//		log.info("Joining Date  ====>" + bean.getJoiningDate());
//		log.info("Account number  ====>" + bean.getAccountNumber());
//		log.info("Email  ====>" + bean.getEmail());
//		log.info("Designation  ====>" +bean.getDesignation() );
//		log.info("DOB  ====>" + bean.getDob());
//		log.info("DEPT_NO  ====>" + bean.getDeptId());
//		log.info("MNGR ID  ====>" + bean.getMngrId());
		log.info("***************************************");
		session.close();
	}

}
