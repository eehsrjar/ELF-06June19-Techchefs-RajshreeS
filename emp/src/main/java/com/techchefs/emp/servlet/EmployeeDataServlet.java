package com.techchefs.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techchefs.emp.beans.EmployeeInfoBean;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOHibernateImpl;


@WebServlet("/fetch")
public class EmployeeDataServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// validate the session
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		if (session == null) {
			// Invalid session. Generate login page with error Info
			out.print("<h1><span style='color:red'>Invalid Session. Please Login</span></h1>");
			out.print("<br><br>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./html/login.html");
			dispatcher.include(req, resp);
		} else {
			// valid session Generate proper response
			String id = req.getParameter("emp");
			EmployeeDAO dao = new EmployeeDAOHibernateImpl();
			EmployeeInfoBean bean = dao.getEmployeeInfo(id);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/welcome");
			req.setAttribute("bean", bean);
			dispatcher.forward(req, resp);
		}
	}
}
