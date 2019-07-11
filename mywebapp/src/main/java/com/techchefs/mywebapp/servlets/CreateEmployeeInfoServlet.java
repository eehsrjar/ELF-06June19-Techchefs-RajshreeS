package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;
import com.techchefs.mywebapp.dao.EmployeeDAO;
import com.techchefs.mywebapp.dao.EmployeeDAOFactory;
@WebServlet("/create")
public class CreateEmployeeInfoServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		bean.setId(Integer.parseInt(req.getParameter("id")));
		bean.setEmpName(req.getParameter("name"));
		bean.setAge(Integer.parseInt(req.getParameter("age")));
		bean.setAccountNumber(Long.parseLong(req.getParameter("accountnumber")));
		bean.setGender(req.getParameter("inputGender"));
		bean.setSalary(Double.parseDouble(req.getParameter("salary")));
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
		
		EmployeeDAO dao=EmployeeDAOFactory.getInstance();
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
