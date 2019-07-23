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

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		if(session!=null) {
			session.invalidate();
		}
		resp.setContentType("text/html");
		out.print("<h5><span style='color:green'>Logged out successfully.</span></h5>");
		out.print("<br><br>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("./html/login.html");
		dispatcher.include(req, resp);
	}

}