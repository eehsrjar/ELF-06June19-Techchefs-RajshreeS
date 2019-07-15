package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
@Log
public class MyFirstServlet extends HttpServlet{
	
	public MyFirstServlet(){log.info("Inside MyFirstServlet constructor");}
	@Override
	
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.info("Inside doGet() Method  ");
		log.info("HTTP Method :"+req.getMethod());
		log.info("Protocol : "+req.getProtocol());
		log.info("Request URL :"+req.getRequestURL());
		
		ServletContext ctx=getServletContext();
		String appl=ctx.getInitParameter("Dynamic Web Application");
		
		ServletConfig config=getServletConfig();
		String use=config.getInitParameter("date");
		
		String currentDate=new Date().toString();
		
		//Get Query String Information
		String fnameValue=req.getParameter("fname");
		String lnameValue=req.getParameter("lname");
		String htmlResponse="<!DOCTYPE html>"+
				"<html>"+
				"<head>"+
				"<meta charset=\"ISO-8859-1\">"+
				"<title>First HTML</title>"+
				"</head>"+
				"<body>"+
				"      <h1>Current date and time :"+
				"      <br>"+
				"      <span style=\"color:red\">"+currentDate+"</span>"+
				"		<br><br>"+
				"		First Name :"+fnameValue+
				"		<br>"+	
				"		Last Name :"+lnameValue+	
				"		<br>"+	
				"		 Which App :"+appl+	
				"		<br>"+	
				"		To use for :"+use+	
				"		</h1>"+
				"</body>"+
				"</html>";
		
		//send the Above HTML response to browser
		resp.setContentType("text/html");
		//resp.setHeader("Refresh", "1");
		PrintWriter out=resp.getWriter();
		out.print(htmlResponse);
	}//End of doGet
}//End of class
