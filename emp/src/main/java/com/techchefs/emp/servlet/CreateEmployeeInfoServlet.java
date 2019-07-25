package com.techchefs.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.emp.beans.EmployeeInfoBean;
import com.techchefs.emp.beans.EmployeeOtherInfoBean;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOHibernateImpl;

import lombok.extern.java.Log;
@Log
@WebServlet("/create")
public class CreateEmployeeInfoServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.info("Name"+req.getParameter("name"));
		EmployeeInfoBean bean=new EmployeeInfoBean();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setEmpName(req.getParameter("name"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accountnumber")));
		bean.setGender(req.getParameter("gender"));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
		bean.setPassword(req.getParameter("password"));
		try {
			bean.setDob(dateFormat.parse(req.getParameter("dob")));
			bean.setJoiningDate(dateFormat.parse(req.getParameter("dateofjoin")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setDesignation(req.getParameter("designation"));
		bean.setEmail(req.getParameter("email"));
		bean.setPhone(Long.parseLong(req.getParameter("phone")));
		bean.setDepartmentId(Integer.parseInt(req.getParameter("deptid")));
		bean.setManagerId(Integer.parseInt(req.getParameter("mngrid")));
		log.info("emergencycontactnumber"+req.getParameter("emergencycontactnumber"));
		EmployeeOtherInfoBean otherInfoBean=new EmployeeOtherInfoBean();
		otherInfoBean.setId(Integer.parseInt(req.getParameter("id")));
		otherInfoBean.setPan(req.getParameter("pan"));
		otherInfoBean.setMarried(Boolean.parseBoolean(req.getParameter("inputStatus")));
		otherInfoBean.setBloodGrp(req.getParameter("inputbloodgrp"));
		otherInfoBean.setChallenged(Boolean.parseBoolean(req.getParameter("physicallyChallenged")));
		otherInfoBean.setEmergencyContactNumber(Long.parseLong(req.getParameter("emergencycontactnumber")));
		otherInfoBean.setEmergencyContactName(req.getParameter("emergencycontactname"));
		otherInfoBean.setNationality(req.getParameter("inputnationality"));
		otherInfoBean.setReligion(req.getParameter("inputreligion"));
		otherInfoBean.setMotherName(req.getParameter("mothername"));
		otherInfoBean.setFatherName(req.getParameter("fathername"));
		otherInfoBean.setSpouseName(req.getParameter("spousename"));
		otherInfoBean.setPassport(req.getParameter("passport"));
		otherInfoBean.setAdhaar(Long.parseLong(req.getParameter("adharnumber")));
		
		
		bean.setOtherInfoBean(otherInfoBean);
		
		EmployeeDAO dao=new EmployeeDAOHibernateImpl();
		PrintWriter out=resp.getWriter();
		if(dao.createEmployeeInfo(bean)) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1> <span style=\"color:green\">Employee created successfully</span></h1>");
			out.print("</body>");
			out.print("</html>");
		}else {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1> <span style=\"color:red\">Employee Not created</span></h1>");
			out.print("</body>");
			out.print("</html>");
		}
	}
}
