package com.techchefs.hibernateapp;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.dto.EmployeeInfoBean;
import com.techchefs.hibernateapp.dto.EmployeeOtherInfoBean;
import com.techchefs.hibernateapp.util.HibernateUtil;

public class SaveDemoWithHibernateUtil {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		SessionFactory factory=HibernateUtil.getSessionFactory();
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
		empOtherInfoBean.setId(1008);
		empOtherInfoBean.setPan("Phy4545Jk89");
		empOtherInfoBean.setIsChallenged(false);
		empOtherInfoBean.setMarried(false);
		empOtherInfoBean.setBloodGrp("B +ve");
		empOtherInfoBean.setEmergencyContactName("Ganesh");
		empOtherInfoBean.setEmergencyContactNumber(9685741230l);
		empOtherInfoBean.setNationality("Indian");
		empOtherInfoBean.setPassport("Hindu");
		empOtherInfoBean.setFatherName("RAmesh");
		empOtherInfoBean.setMotherName("Geetha");
		empOtherInfoBean.setAdhaar(5871235685l);
		empOtherInfoBean.setPassport("jgh54685ugyhig");
		
		Transaction transaction=session.beginTransaction();
		//session.save(bean);
		session.saveOrUpdate(empOtherInfoBean);
		transaction.commit();
		session.close();
	}

}
