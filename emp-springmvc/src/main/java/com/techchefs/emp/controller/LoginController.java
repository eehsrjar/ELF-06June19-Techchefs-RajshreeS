package com.techchefs.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.soap.Addressing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.techchefs.emp.commons.EMPConstants.DB_INTERACTION_TYPE;
import static com.techchefs.emp.commons.EMPConstants.PROP_FILENAME;
import static com.techchefs.emp.commons.EMPConstants.VIEW_LOGIN_PAGE;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.techchefs.emp.commons.EMPConstants.VIEW_HOME_PAGE;
import static com.techchefs.emp.commons.EMPConstants.VIEW_CREATE_EMPLOYEE_PROFILE;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dto.EmployeeAddressInfoBean;
import com.techchefs.emp.dto.EmployeeEducationalInfoBean;
import com.techchefs.emp.dto.EmployeeExperienceInfoBean;
import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dto.EmployeeOtherInfoBean;

import lombok.extern.java.Log;
@Log
@Controller
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

	@PostMapping("/authenticate")
	public String submitLoginForm(Integer id, String password, HttpServletRequest req, @Value("${loginFail}") String msg) {
		
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		log.info("Bean Object:"+bean);
		if (bean != null && bean.getPassword().equals(password)) {
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			return VIEW_HOME_PAGE;
		} else {
			req.setAttribute("msg", msg);
			return VIEW_LOGIN_PAGE;
		}
	}
	@GetMapping("/createEmployee")
	public String createEmployeePage() {
		return VIEW_CREATE_EMPLOYEE_PROFILE;
	}
	
	@PostMapping("/create")
	public String createEmployee(EmployeeInfoBean bean,int mngId,ModelMap map) {
		
		EmployeeInfoBean magBean=dao.getEmployeeInfo(mngId);
		bean.setManagerId(magBean);
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
		if(dao.createEmployeeInfo(bean)) {
		map.addAttribute("msg", "Employee Account Created Successfully");
		return VIEW_LOGIN_PAGE;
		}else {
			map.addAttribute("msg", "Error Try Again");
			return VIEW_LOGIN_PAGE;
		}
	}
	
	@GetMapping("/logout")
	public String logoutFun(ModelMap map,HttpSession session,@Value("${logout}") String msg) {		
		session.invalidate();
		map.addAttribute("msg",msg);
		return VIEW_LOGIN_PAGE;
	}
}
