package com.techchefs.hibernateapp.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techchefs.hibernateapp.manytomany.TrainingInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeEducationalInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeExperienceInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.manytoone.EmployeeOtherInfoBean;

public class HibernateImpl {
	private SessionFactory factory=new Configuration().configure("com/techchefs/hibernateapp/manytoone/hibernate.cfg.xml").buildSessionFactory();
	public void createEmployeeBeanInfo(EmployeeInfoBean bean,EmployeeOtherInfoBean otherBean,
			List<EmployeeAddressInfoBean> addressInfoBeans,
			List<EmployeeEducationalInfoBean> educationInfoBeans,
			List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(bean);
		session.save(otherBean);
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
			session.save(employeeAddressInfoBean);
		}
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : educationInfoBeans) {
			session.save(employeeEducationalInfoBean);
	}
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : experienceInfoBeans) {
			session.save(employeeExperienceInfoBean);
	}
		txn.commit();
		session.close();
	}
	
	public void createTrainingInfo(TrainingInfoBean trainingInfoBean) {
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(trainingInfoBean);
		txn.commit();
		session.close();
	}
	
	public void createEmployeeBeanWithMultipleAddressInfo(com.techchefs.hibernateapp.manytoone.EmployeeInfoBean bean,List<EmployeeAddressInfoBean> addressInfoBeans) {
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(bean);
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBeans) {
			session.save(employeeAddressInfoBean);
		}
		
		txn.commit();
		session.close();
	}
	public void createEmployeeBeanWithMultipleEducationInfo(com.techchefs.hibernateapp.manytoone.EmployeeInfoBean bean,List<EmployeeEducationalInfoBean> educationInfoBeans) {
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(bean);
		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : educationInfoBeans) {
				session.save(employeeEducationalInfoBean);
		}
		txn.commit();
		session.close();
	}
	
	public void createEmployeeBeanWithMultipleExperienceInfo(com.techchefs.hibernateapp.manytoone.EmployeeInfoBean bean,List<EmployeeExperienceInfoBean> experienceInfoBeans) {
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(bean);
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : experienceInfoBeans) {
				session.save(employeeExperienceInfoBean);
		}
		txn.commit();
		session.close();
	}
	
}
