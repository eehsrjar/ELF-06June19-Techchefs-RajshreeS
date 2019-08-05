package com.techchefs.hibernateapp.manytoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.techchefs.hibernateapp.mapping.HibernateImpl;


public class HibernateManyToOneEmplEducationTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(9870);
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
		
		EmployeeEducationPKBean educationPKBean=new EmployeeEducationPKBean();
		educationPKBean.setEmpInfoBean(bean);
		educationPKBean.setEducationType("10");
		
		EmployeeEducationPKBean educationPKBean1=new EmployeeEducationPKBean();
		educationPKBean1.setEmpInfoBean(bean);
		educationPKBean1.setEducationType("Graduation");
		
		EmployeeEducationalInfoBean employeeEducationalInfoBean=new EmployeeEducationalInfoBean();
		employeeEducationalInfoBean.setEducationPKBean(educationPKBean);
		employeeEducationalInfoBean.setBranch("anc");
		employeeEducationalInfoBean.setCollegeName("dhfsdff");
		employeeEducationalInfoBean.setDegreeType("R");
		employeeEducationalInfoBean.setLocation("fhdg");
		employeeEducationalInfoBean.setPercentage(57.89);
		employeeEducationalInfoBean.setUniversity("ru");
		employeeEducationalInfoBean.setYop(2000);
		
		
		EmployeeEducationalInfoBean employeeEducationalInfoBean1=new EmployeeEducationalInfoBean();
		employeeEducationalInfoBean1.setEducationPKBean(educationPKBean1);
		employeeEducationalInfoBean1.setBranch("dgff");
		employeeEducationalInfoBean1.setCollegeName("ytuty");
		employeeEducationalInfoBean1.setDegreeType("d");
		employeeEducationalInfoBean1.setLocation("uiou");
		employeeEducationalInfoBean1.setPercentage(70.89);
		employeeEducationalInfoBean1.setUniversity("ru");
		employeeEducationalInfoBean1.setYop(2005);
		
		List<EmployeeEducationalInfoBean> eduList=new ArrayList<EmployeeEducationalInfoBean>();
		eduList.add(employeeEducationalInfoBean1);
		eduList.add(employeeEducationalInfoBean);
		
		HibernateImpl hib=new HibernateImpl();
		hib.createEmployeeBeanWithMultipleEducationInfo(bean, eduList);
	}
}
