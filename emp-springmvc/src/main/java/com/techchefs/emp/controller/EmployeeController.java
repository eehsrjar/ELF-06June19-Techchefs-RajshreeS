package com.techchefs.emp.controller;

import static com.techchefs.emp.commons.EMPConstants.VIEW_HOME_PAGE;
import static com.techchefs.emp.commons.EMPConstants.VIEW_SEARCH_EMPLOYEE;
import static com.techchefs.emp.commons.EMPConstants.DB_INTERACTION_TYPE;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techchefs.emp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOHibernateImpl;
@Log
@Controller
@RequestMapping("/employee")
@PropertySource("classpath:msg.properties")
public class EmployeeController {
	@InitBinder
    public void initBinder(WebDataBinder binder) {
	  CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
        binder.registerCustomEditor(Date.class, editor);
    }
	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDAO dao;

	@GetMapping("/search")
	public String searchEmployeeById(int id, ModelMap map, @Value("${EmpNotFound}") String msg) {
		ArrayList<EmployeeInfoBean> arrId = dao.getEmployeeIds(id);
		if (arrId != null) {
			map.addAttribute("ArrayIds", arrId);
			return VIEW_SEARCH_EMPLOYEE;
		} else {
			map.addAttribute("msg", msg);
			return VIEW_HOME_PAGE;
		}
	}

	@GetMapping("/fetch")
	public String getEmployeeDetails(int emp, ModelMap map) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(emp);
		map.addAttribute("bean", bean);
		return VIEW_HOME_PAGE;

	}
	@GetMapping("/updateEmployee")
	public String getUpdateEmployee() {
		return "updateEmployee";
	}
	@PostMapping("/updateEmployee")
	public String updateEmployee(EmployeeInfoBean bean,int mngId) {
		EmployeeInfoBean mngBean=dao.getEmployeeInfo(mngId);
		bean.setManagerId(mngBean);
		dao.createEmployeeInfo(bean);
		return VIEW_HOME_PAGE;
	}

}
