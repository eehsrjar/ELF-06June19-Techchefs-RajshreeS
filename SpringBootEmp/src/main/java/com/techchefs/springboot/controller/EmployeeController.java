package com.techchefs.springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String greetingMessage() {
		return "Hi Everyone";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {
		System.out.println(bean.getId());
		for (EmployeeAddressInfoBean addressBean : bean.getAddressInfoBeans()) {
			addressBean.getAddressPKBean().setEmpInfoBean(bean);
		}
		for (EmployeeEducationalInfoBean eduInfoBean : bean.getEducationInfoBeans()) {
			eduInfoBean.getEducationPKBean().setEmpInfoBean(bean);
		}
		for (EmployeeExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBeans()) {
			experienceInfoBean.getExpPKBean().setEmpInfoBean(bean);
		}
		EmployeeOtherInfoBean employeeOtherInfoBean = bean.getEmployeeOtherInfoBean();
		employeeOtherInfoBean.setBean(bean);

		System.out.println("Ohter id"+bean.getEmployeeOtherInfoBean().getBean().getId());
		
		EmployeeInfoBean manager = bean.getManagerId();
		manager = repository.findById(manager.getId()).get();
		bean.setManagerId(manager);
		System.out.println(bean.getManagerId().getId());
		EmployeeResponse response = new EmployeeResponse();
		//if (!repository.existsById(bean.getId())) {
		//if(	repository.save(bean)!=null) {
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee Data Added Successfully");
//		} else {
//			response.setStatusCode(501);
//			response.setMessage("Failed");
//			response.setDescription("Employee Data Addition failed");
//		}

		return response;
	}
	@GetMapping(path="/getEmployee",produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam int id) {
		EmployeeResponse response = new EmployeeResponse();
		EmployeeInfoBean bean=repository.findById(id).get();
		if(bean != null) {
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Employee Data Fetched Successfully");
			response.setBeans(Arrays.asList(bean));
		} else {
			response.setStatusCode(501);
			response.setMessage("Failed");
			response.setDescription("Not Found");
		}
	
		return response;
	}

}
