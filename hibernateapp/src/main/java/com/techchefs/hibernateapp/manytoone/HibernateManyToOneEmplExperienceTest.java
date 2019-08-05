package com.techchefs.hibernateapp.manytoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.techchefs.hibernateapp.mapping.HibernateImpl;


public class HibernateManyToOneEmplExperienceTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(9875);
		bean.setEmpName("Jaya");
		bean.setAge(27);
		bean.setGender("female");
		bean.setSalary(56000.00);
		bean.setPhone(9632587410l);
		bean.setAccountNumber(14725836901l);
		bean.setJoiningDate(dateFormat.parse("2014-11-23"));
		bean.setEmail("jaya@gmail.com");
		bean.setDob(dateFormat.parse("1992-10-12"));
		bean.setDesignation("Analyst");
		bean.setDepartmentId(30);
		bean.setManagerId(1000);
		
		EmployeeExperiencePKBean expPKBean=new EmployeeExperiencePKBean();
		expPKBean.setCompanyName("Techchefs");
		expPKBean.setEmpInfoBean(bean);
		
		EmployeeExperiencePKBean expPKBean1=new EmployeeExperiencePKBean();
		expPKBean1.setCompanyName("ABC");
		expPKBean1.setEmpInfoBean(bean);
		
		EmployeeExperienceInfoBean empExBean=new EmployeeExperienceInfoBean();
		empExBean.setExpPKBean(expPKBean);
		empExBean.setDesignation("Developer");
		empExBean.setJoiningDate(dateFormat.parse("2014-11-23"));
		
		
		

		EmployeeExperienceInfoBean empExBean2=new EmployeeExperienceInfoBean();
		empExBean2.setExpPKBean(expPKBean1);
		empExBean2.setDesignation("Software Trainee");
		empExBean2.setJoiningDate(dateFormat.parse("2011-11-23"));
		empExBean2.setLeavingDate(dateFormat.parse("2013-11-23"));
		
		
		List<EmployeeExperienceInfoBean> expList=new ArrayList<EmployeeExperienceInfoBean>();
		expList.add(empExBean2);
		expList.add(empExBean);
		
		HibernateImpl hib=new HibernateImpl();
		hib.createEmployeeBeanWithMultipleExperienceInfo(bean, expList);
	}
}
