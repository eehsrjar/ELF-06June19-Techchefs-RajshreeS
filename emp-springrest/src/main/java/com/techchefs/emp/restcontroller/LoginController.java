package com.techchefs.emp.restcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.techchefs.emp.commons.EMPConstants.DB_INTERACTION_TYPE;
import static com.techchefs.emp.commons.EMPConstants.PROP_FILENAME;
import static com.techchefs.emp.commons.EMPConstants.VIEW_LOGIN_PAGE;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import static com.techchefs.emp.commons.EMPConstants.VIEW_HOME_PAGE;
import static com.techchefs.emp.commons.EMPConstants.VIEW_CREATE_EMPLOYEE_PROFILE;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dto.EmployeeAddressInfoBean;
import com.techchefs.emp.dto.EmployeeEducationalInfoBean;
import com.techchefs.emp.dto.EmployeeExperienceInfoBean;
import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.EmployeeOtherInfoBean;
import com.techchefs.emp.dto.EmployeeResponse;

import lombok.extern.java.Log;
@Log
@RestController
@RequestMapping("/login")
@PropertySource(PROP_FILENAME)
public class LoginController {
	 @InitBinder
	    public void initBinder(WebDataBinder binder) {
		  CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
	        binder.registerCustomEditor(Date.class, editor);
	    }
	
	  @Autowired
	  @Qualifier(DB_INTERACTION_TYPE)
	  EmployeeDAO dao;
	 

	@GetMapping("/loginPage")
	public String getForm() {
		return VIEW_LOGIN_PAGE;
	}
	@PostMapping(value="/authenticate",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id,String password,HttpServletRequest req) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		EmployeeResponse employeeResponse=new EmployeeResponse();
		if(bean != null && bean.getPassword().equals(password)) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("Successfull");
			employeeResponse.setBeans(Arrays.asList(bean));
			employeeResponse.setDescription("Employee logged in successfully");
//			HttpSession session=req.getSession();
//			session.setAttribute("bean", bean);
			req.getSession().setAttribute("bean", bean);
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("Invalid Credentials");
		}
		return employeeResponse;
	}
	
	
	@GetMapping(value="/logout",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {		
		session.invalidate();
		EmployeeResponse employeeResponse=new EmployeeResponse();
		employeeResponse.setStatusCode(201);
		employeeResponse.setMessage("Successfull");
		employeeResponse.setDescription("Logged out successfully");
		return employeeResponse;
		
	}
	@GetMapping(value="/readCookie",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name="JSESSIONID") String sessionId) {
		EmployeeResponse employeeResponse=new EmployeeResponse();
		employeeResponse.setStatusCode(201);
		employeeResponse.setMessage("Successfull");
		employeeResponse.setDescription("JSESSIONID: "+sessionId);
		return employeeResponse;
	}
	 
}
