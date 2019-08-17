package com.techchefs.emp.restcontroller;

import static com.techchefs.emp.commons.EMPConstants.DB_INTERACTION_TYPE;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dto.EmployeeAddressInfoBean;
import com.techchefs.emp.dto.EmployeeEducationalInfoBean;
import com.techchefs.emp.dto.EmployeeExperienceInfoBean;
import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.EmployeeOtherInfoBean;
import com.techchefs.emp.dto.EmployeeResponse;

import lombok.extern.java.Log;
@Log
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/controller")
public class EmployeeRestController {

	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDAO dao;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping(value = "/getEmployee", produces =  MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployeeXml(@RequestParam int id,HttpServletRequest req) {
		//return dao.getEmployeeInfo(id);
		EmployeeResponse employeeResponse=new EmployeeResponse();
		if(req.getSession(false)!=null) {
		EmployeeInfoBean bean=dao.getEmployeeInfo(id);
		
		if(bean !=null) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setDescription("Employee Data found successfully");
			employeeResponse.setBeans(Arrays.asList(bean));
		}else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Employee Data not found");
		}return employeeResponse;
		}else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please Login first");
		}
		return employeeResponse;
	}
		
	@GetMapping(value = "/getEmployeesById", produces =  MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployees(@RequestParam int id,HttpServletRequest req) {
		//return dao.getEmployeeInfo(id);
		EmployeeResponse employeeResponse=new EmployeeResponse();
		log.info("Req.getsession"+req.getSession(false));
		if(req.getSession(false)!=null) {
		//EmployeeInfoBean bean=dao.getEmployeeInfo(id);
		List<EmployeeInfoBean> beans=dao.getEmployeeIds(id);
		if(beans !=null) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setDescription("Employee Data found successfully");
			employeeResponse.setBeans(beans);
		}else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Employee Data not found");
		}return employeeResponse;
		}else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please Login first");
		}
		return employeeResponse;
	}
	@GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(HttpServletRequest req) {
		//return dao.getAllEmployeeInfo();
		EmployeeResponse employeeResponse=new EmployeeResponse();
		List<EmployeeInfoBean> bean=dao.getAllEmployeeInfo();
		if(req.getSession(false)!=null) {
		if(bean !=null) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setDescription("Employee Data found successfully");
			employeeResponse.setBeans(bean);
		}else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Employee Data not found");
		}return employeeResponse;
		}else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please Login first");
		}
		return employeeResponse;
	}

	@PostMapping(path = "/createEmployee",consumes =MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse addEmployee(@RequestBody EmployeeInfoBean bean) {
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
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (dao.createEmployeeInfo(bean)) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setDescription("Employee Data inserted successfully");
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Employee Data not Inserted");
		}
		return employeeResponse;
	}

	@PutMapping(path = "/updateEmployee",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeInfoBean bean,HttpServletRequest req) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(req.getSession(false)!=null) {
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
		if (dao.updateEmployeeInfo(bean)) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setDescription("Employee Data Updated successfully");
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Employee Data not Updated");
		}return employeeResponse;
		}else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please Login first");
		}
		return employeeResponse;
	}

	@DeleteMapping(path = "/removeEmployee",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse removeEmployee(@RequestParam("id") int id,HttpServletRequest req) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if(req.getSession(false)!=null) {
		if (dao.deleteEmployeeInfo(id)) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setDescription("Employee Data Deleted successfully");
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Employee Data not Deleted");
		}return employeeResponse;
		}else {
			employeeResponse.setStatusCode(501);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Please Login first");
		}
		return employeeResponse;
	}
}
