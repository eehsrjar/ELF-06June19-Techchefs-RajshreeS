package com.techchefs.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techchefs.mywebapp.beans.EmployeeInfoBean;

@WebServlet("/forward")
public class ServletForwordDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeInfoBean empInfo=new EmployeeInfoBean();
		empInfo.setId(3000);
		empInfo.setEmpName("ABCDE");
		empInfo.setAge(23);
		
		//Pass the above object to EmployeeSearchServlet
		//request.setAttribute("info", empInfo);
		ServletContext ctx=getServletContext();
		ctx.setAttribute("info", empInfo);
		
		String url="search?id=1000";
		//String url="http://www.gmail.com";
		RequestDispatcher dispatcher=request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
