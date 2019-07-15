package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/include")
public class ServletIncludeDemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=null;
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("1111111111111111");
		out.print("<br>");
		dispatcher=req.getRequestDispatcher("index.html");
		dispatcher.include(req, resp);
		out.print("<br>");
		out.print("2222222222222222");
		out.print("<br>");
		dispatcher=req.getRequestDispatcher("currentDate?fname=abc&lname=apo");
		dispatcher.include(req, resp);
		out.print("<br>");
		out.print("3333333333333333");
		out.print("<br>");
		dispatcher=req.getRequestDispatcher("search?id=1003");
		dispatcher.include(req, resp);
		out.print("<br>");
		out.print("4444444444444444");
		out.print("5555555555555555");
	
	}
}
