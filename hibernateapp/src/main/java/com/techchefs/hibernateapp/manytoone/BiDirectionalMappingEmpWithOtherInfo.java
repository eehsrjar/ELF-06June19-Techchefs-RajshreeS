package com.techchefs.hibernateapp.manytoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.techchefs.hibernateapp.mapping.HibernateImpl;

public class BiDirectionalMappingEmpWithOtherInfo {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setId(1114);
		bean.setEmpName("Soundarya");
		
		
		EmployeeOtherInfoBean empOtherInfoBean=new EmployeeOtherInfoBean();
		empOtherInfoBean.setBean(bean);
		empOtherInfoBean.setPan("AM2345Jk89");
		
		bean.setEmployeeOtherInfoBean(empOtherInfoBean);
		
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
		
		bean.setAddressInfoBeans(Arrays.asList(addressInfo,addressInfo1));
		
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
		
		bean.setEducationInfoBean(Arrays.asList(employeeEducationalInfoBean1,employeeEducationalInfoBean));
		
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
		
		bean.setExperienceInfoBean(Arrays.asList(empExBean,empExBean2));
		
		HibernateImpl impl=new HibernateImpl();
		impl.createEmployee(bean);
	}
}
