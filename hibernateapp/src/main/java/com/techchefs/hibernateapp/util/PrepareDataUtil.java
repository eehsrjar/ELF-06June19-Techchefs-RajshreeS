package com.techchefs.hibernateapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.techchefs.hibernateapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDataUtil {
	
	private PrepareDataUtil() {}
	public static EmployeeOtherInfoBean prepareData(int id) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(id);
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
		bean.setDeptId(30);
		bean.setMngrId(1002);
		
		
		EmployeeOtherInfoBean empOtherInfoBean=new EmployeeOtherInfoBean();
		empOtherInfoBean.setBean(bean);
		empOtherInfoBean.setPan("AM2345Jk89");
		empOtherInfoBean.setChallenged(false);
		empOtherInfoBean.setMarried(false);
		empOtherInfoBean.setBloodGrp("A+");
		empOtherInfoBean.setEmergencyContactName("Rama");
		empOtherInfoBean.setEmergencyContactNumber(258963147l);
		empOtherInfoBean.setNationality("Indian");
		empOtherInfoBean.setPassport("Hindu");
		empOtherInfoBean.setFatherName("Rama");
		empOtherInfoBean.setMotherName("Naina");
		empOtherInfoBean.setAdhaar(1478523690);
		empOtherInfoBean.setPassport("jdfgi76486");
		
		
		return empOtherInfoBean;
	}
}
