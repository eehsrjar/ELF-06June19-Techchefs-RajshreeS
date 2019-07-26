package com.techchefs.emp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.techchefs.emp.dto.EmployeeInfoBean;
import com.techchefs.emp.dao.EmployeeDAOHibernateImpl;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeDAOHibernateImpl dao;
	@RequestMapping(path = "/getMsg",method = RequestMethod.GET)
	public ModelAndView getMessage() {
		ModelAndView modelAndView=new ModelAndView();
		//modelAndView.setViewName("../WEB-INF/views/messagePage.jsp");
		modelAndView.setViewName("messagePage");
		return modelAndView;
	}
	@GetMapping("/getMessage")
	public ModelAndView getMessage(ModelAndView modelAndView) {
		//modelAndView.setViewName("../WEB-INF/views/messagePage.jsp");
		modelAndView.setViewName("messagePage");
		return modelAndView;
	}
	
	@GetMapping("/getForm")
	public String getForm() {
		return "loginForm";
	}
	
	@PostMapping("/login")
	public String submitLoginForm(int id,String password,ModelMap map) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if(bean !=null && bean.getPassword().equals(password)) {
			map.addAttribute("bean", bean);
		return "home";
		}
		else {
			map.addAttribute("msg", "Invalid Credentials");
			return "loginForm";
		}
	}
	@GetMapping("/search")
	public String searchEmployeeById(int id,ModelMap map) {
		ArrayList<EmployeeInfoBean> arrId = dao.getEmployeeIds(id);
		
		if(arrId !=null) {
			map.addAttribute("ArrayIds",arrId);
			return "searchEmployee";
		}else {
			map.addAttribute("msg","No employee Found");
			return "home";
		}
	}
	@GetMapping("/fetch")
	public String getEmployeeDetails(int emp,ModelMap map) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(emp);
		map.addAttribute("bean", bean);
		return "home";
		
	}
	@GetMapping("/logout")
	public String logoutFun(ModelMap map) {
		map.addAttribute("msg", "Successfully logged out");
		return "loginForm";
	}
}
