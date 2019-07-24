package com.techchefs.emp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet("/")
public class FrontControllerServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String path=req.getPathInfo();
//		req.getRequestDispatcher("path").forward(req, resp);
		String path="/app"+req.getRequestURI().replace("/emp", "");
		req.getRequestDispatcher("path").forward(req, resp);
	}
}
