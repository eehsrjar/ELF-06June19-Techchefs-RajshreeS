package com.techchefs.hibernateapp.manytoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.techchefs.hibernateapp.mapping.HibernateImpl;


public class HibernateManyToOneTest {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(1233);
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
		
		EmployeeAddressPKBean addressPKBean1=new EmployeeAddressPKBean();
		addressPKBean1.setAddressType("Permanent");
		addressPKBean1.setEmpInfoBean(bean);
		
		EmployeeAddressPKBean addressPKBean2=new EmployeeAddressPKBean();
		addressPKBean2.setAddressType("Temparary");
		addressPKBean2.setEmpInfoBean(bean);
		
		EmployeeAddressInfoBean addressInfo=new EmployeeAddressInfoBean();
		addressInfo.setAddressPKBean(addressPKBean1);
		addressInfo.setAddress1("1st cross");
		addressInfo.setAddress2("XYZ");
		addressInfo.setCity("BAngalore");
		addressInfo.setLandmark("ABC");
		addressInfo.setState("kar");
		addressInfo.setCountry("India");
		addressInfo.setPincode(34566);
		
		EmployeeAddressInfoBean addressInfo1=new EmployeeAddressInfoBean();
		addressInfo1.setAddressPKBean(addressPKBean2);
		addressInfo1.setAddress1("2st cross");
		addressInfo1.setAddress2("XYZ");
		addressInfo1.setCity("BAngalore");
		addressInfo1.setLandmark("ABC");
		addressInfo1.setState("kar");
		addressInfo1.setCountry("India");
		addressInfo1.setPincode(34566);
		
		List<EmployeeAddressInfoBean> addressList=new ArrayList<EmployeeAddressInfoBean>();
		addressList.add(addressInfo1);
		addressList.add(addressInfo);
		
		HibernateImpl hib=new HibernateImpl();
		hib.createEmployeeBeanWithMultipleAddressInfo(bean, addressList);
	}
}
