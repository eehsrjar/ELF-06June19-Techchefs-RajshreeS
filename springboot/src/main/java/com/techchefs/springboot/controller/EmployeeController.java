package com.techchefs.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.springboot.dto.EmployeeAddressInfoBean;
import com.techchefs.springboot.dto.EmployeeEducationalInfoBean;
import com.techchefs.springboot.dto.EmployeeExperienceInfoBean;
import com.techchefs.springboot.dto.EmployeeInfoBean;
import com.techchefs.springboot.dto.EmployeeOtherInfoBean;
import com.techchefs.springboot.dto.EmployeeResponse;
import com.techchefs.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;
	
	@GetMapping(path="/hello",produces = MediaType.TEXT_PLAIN_VALUE)
	public String  greetingMessage() {
		return "Hi Everyone";
	}
	@PostMapping(path="/create",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(EmployeeInfoBean bean) {
		for(EmployeeAddressInfoBean addressBean: bean.getAddressInfoBeans()) {
			addressBean.getAddressPKBean().setEmpInfoBean(bean);
		}
		for(EmployeeEducationalInfoBean eduInfoBean:bean.getEducationInfoBeans()) {
			eduInfoBean.getEducationPKBean().setEmpInfoBean(bean);
		}
		for(EmployeeExperienceInfoBean experienceInfoBean:bean.getExperienceInfoBeans()) {
			experienceInfoBean.getExpPKBean().setEmpInfoBean(bean);
		}
		EmployeeOtherInfoBean employeeOtherInfoBean=bean.getEmployeeOtherInfoBean();
		employeeOtherInfoBean.setBean(bean);
		
		repository.save(bean);
		EmployeeResponse response=new EmployeeResponse();
		/*
		 * response.setStatusCode(201); response.setMessage("Successfull");
		 * response.setDescription("Employee Data Added Successfully");
		 */
		return response;
	}
}
