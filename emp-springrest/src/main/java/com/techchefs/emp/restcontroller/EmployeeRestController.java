package com.techchefs.emp.restcontroller;

import static com.techchefs.emp.commons.EMPConstants.DB_INTERACTION_TYPE;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
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
import com.techchefs.emp.dto.EmployeeInfoBean;
@RestController
@RequestMapping("/controller")
public class EmployeeRestController {
	
	@Autowired
	@Qualifier(DB_INTERACTION_TYPE)
	EmployeeDAO dao;
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
	  CustomDateEditor editor=new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
        binder.registerCustomEditor(Date.class, editor);
    }
	@GetMapping(value="/getEmployee",produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public  EmployeeInfoBean getEmployeeXml(@RequestParam int id) {
		return dao.getEmployeeInfo(id);
	}
	@GetMapping(value="/getAllEmployee",produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE})	
	public  List<EmployeeInfoBean> getAllEmployeeXml(){
		return dao.getAllEmployeeInfo();
	}
	@PostMapping(path="/createEmployee")
	public  boolean addEmployee(@RequestBody EmployeeInfoBean bean) {
		return dao.createEmployeeInfo(bean);
	}
	@PutMapping(path="/updateEmployee")
	public  boolean modifyEmployee(@RequestBody EmployeeInfoBean bean) {
		return dao.updateEmployeeInfo(bean);
	}
	@DeleteMapping(path="/removeEmployee")
	public  boolean removeEmployee(@RequestParam("id") int id) {
		return dao.deleteEmployeeInfo(id);
	}
}
