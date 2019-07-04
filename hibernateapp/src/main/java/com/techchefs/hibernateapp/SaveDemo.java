package com.techchefs.hibernateapp;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeOtherInfoBean;

public class SaveDemo {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//configuration.addAnnotatedClass(EmployeeInfoBean.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
//		EmployeeInfoBean bean=new EmployeeInfoBean();
//		bean.setId(1007);
//		bean.setEmpName("Jaya");
//		bean.setAge(27);
//		bean.setGender("female");
//		bean.setSalary(56000.00);
//		bean.setPhone(9632587410l);
//		bean.setAccountNumber(14725836901l);
//		bean.setJoiningDate(dateFormat.parse("2014-11-23"));
//		bean.setEmail("jaya@gmail.com");
//		bean.setDob(dateFormat.parse("1992-10-12"));
//		bean.setDesignation("Analyst");
//		bean.setDeptId(30);
//		bean.setMngrId(1002);
		
		EmployeeOtherInfoBean empOtherInfoBean=new EmployeeOtherInfoBean();
		empOtherInfoBean.setId(100);
		empOtherInfoBean.setPan("AM2345Jk89");
		empOtherInfoBean.setIsChallenged(false);
		empOtherInfoBean.setMarried(false);
		empOtherInfoBean.setBloodGrp("A+");
		empOtherInfoBean.setEmergencyContactName("Rama");
		empOtherInfoBean.setEmergencyContactNumber(2589631470l);
		empOtherInfoBean.setNationality("Indian");
		empOtherInfoBean.setPassport("Hindu");
		empOtherInfoBean.setFatherName("Rama");
		empOtherInfoBean.setMotherName("Naina");
		empOtherInfoBean.setAdhaar(1478523690);
		empOtherInfoBean.setPassport("jdfgi76486");
		
		Transaction transaction=session.beginTransaction();
		//session.save(bean);
		session.saveOrUpdate(empOtherInfoBean);
		transaction.commit();
		session.close();
	}

}
