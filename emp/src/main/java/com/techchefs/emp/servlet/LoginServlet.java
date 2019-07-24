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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Check cookies are disabled
		if(req.getCookies()==null) {
			req.getRequestDispatcher("./html/cookiesDisabled.html").include(req, resp);
			return;
		}
		
		int id = Integer.parseInt(req.getParameter("id"));
		String password = req.getParameter("password");
		
		EmployeeDAO dao = new EmployeeDAOHibernateImpl();
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		RequestDispatcher dispatcher=null;
		if (bean != null && bean.getPassword().equals(password)) {
			//validate credentials
			HttpSession session=req.getSession();
			session.setAttribute("bean",bean);
			dispatcher = req.getRequestDispatcher("/welcome");
			dispatcher.forward(req, resp);

		} else {
			
//			resp.setContentType("text/html");
//			PrintWriter out=resp.getWriter();
//			
//			out.print("<br>");
//			dispatcher=req.getRequestDispatcher("./html/login.html");
//			dispatcher.include(req, resp);
//			out.print("<p style=\"text-align:center,color:red;\">Invalid Credentials</p>");
			req.getRequestDispatcher("/loginFail?msg=Invalid Credentials").forward(req, resp);;
		}
	}
}
