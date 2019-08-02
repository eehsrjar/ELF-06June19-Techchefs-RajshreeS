package com.techchefs.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.techchefs.emp.commons.EMPConstants.DB_INTERACTION_TYPE;
import static com.techchefs.emp.commons.EMPConstants.PROP_FILENAME;
import static com.techchefs.emp.commons.EMPConstants.VIEW_LOGIN_PAGE;
import static com.techchefs.emp.commons.EMPConstants.VIEW_HOME_PAGE;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/login")
@PropertySource(PROP_FILENAME)
public class LoginController {
	
	
	  @Autowired
	  @Qualifier(DB_INTERACTION_TYPE)
	  EmployeeDAO dao;
	 

	@GetMapping("/loginPage")
	public String getForm() {
		return VIEW_LOGIN_PAGE;
	}

	@PostMapping("/authenticate")
	public String submitLoginForm(int id, String password, HttpServletRequest req, @Value("${loginFail}") String msg) {
		
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		if (bean != null && bean.getPassword().equals(password)) {
			HttpSession session = req.getSession(true);
			session.setAttribute("bean", bean);
			return VIEW_HOME_PAGE;
		} else {
			req.setAttribute("msg", msg);
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
