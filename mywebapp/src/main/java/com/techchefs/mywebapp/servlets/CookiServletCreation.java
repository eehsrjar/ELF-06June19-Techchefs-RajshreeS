package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiServletCreation
 */
public class CookiServletCreation extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Create cookie
		Cookie myCooki=new Cookie("Movie", "Super30");
		Cookie myCooki2=new Cookie("mylocation", "BAngalore");
		myCooki2.setMaxAge(7*24*60*60);//sec
		//Send the above cookie to browser
		resp.addCookie(myCooki);
		resp.addCookie(myCooki2);
		PrintWriter out =resp.getWriter();
		out.print("Cookie is created");
		
	}
}
