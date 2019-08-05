package com.techchefs.hibernateapp.manytomany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.techchefs.hibernateapp.manytoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.mapping.HibernateImpl;

public class ManyToManyTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(1114);
		bean.setEmpName("Naren");
		bean.setAge(24);
		bean.setGender("male");
		bean.setSalary(50000.00);
		bean.setPhone(9632587120l);
		bean.setAccountNumber(14725836671l);
		bean.setJoiningDate(dateFormat.parse("2017-12-23"));
		bean.setEmail("naren@gmail.com");
		bean.setDob(dateFormat.parse("1993-10-12"));
		bean.setDesignation("Analyst");
		bean.setDepartmentId(10);
		bean.setManagerId(1111);  
		
		
		EmployeeInfoBean bean2=new EmployeeInfoBean();
		bean2.setId(1115);
		bean2.setEmpName("Soundarya");
		bean2.setAge(23);
		bean2.setGender("female");
		bean2.setSalary(50000.00);
		bean2.setPhone(9632587120l);
		bean2.setAccountNumber(14725836671l);
		bean2.setJoiningDate(dateFormat.parse("2017-12-23"));
		bean2.setEmail("soundarya@gmail.com");
		bean2.setDob(dateFormat.parse("1993-10-12"));
		bean2.setDesignation("Software Trainee");
		bean2.setDepartmentId(20);
		bean2.setManagerId(1111);
		
		
		EmployeeInfoBean bean3=new EmployeeInfoBean();
		bean3.setId(1116);
		bean3.setEmpName("Ria");
		bean3.setAge(23);
		bean3.setGender("female");
		bean3.setSalary(50000.00);
		bean3.setPhone(9632587120l);
		bean3.setAccountNumber(14725836671l);
		bean3.setJoiningDate(dateFormat.parse("2017-12-23"));
		bean3.setEmail("ria@gmail.com");
		bean3.setDob(dateFormat.parse("1993-10-12"));
		bean3.setDesignation("Software Developer");
		bean3.setDepartmentId(30);
		bean3.setManagerId(1111);
		
		TrainingInfoBean trainingInfoBean=new TrainingInfoBean();
		trainingInfoBean.setInfoBeans(Arrays.asList(bean,bean2,bean3));
		trainingInfoBean.setCourseId(1);
		trainingInfoBean.setCourseName("Fullstack Developer");
		trainingInfoBean.setDuration("2 Months");
		trainingInfoBean.setCourseType("Inhouse");
		
		HibernateImpl impl=new HibernateImpl();
		impl.createTrainingInfo(trainingInfoBean);
	}
}
