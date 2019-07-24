package com.techchefs.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginpage")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie dummyCookie=new Cookie("dummyCookie","CheckCookiesEnabled");
		resp.addCookie(dummyCookie);
		
		PrintWriter out=resp.getWriter();
		HttpSession session = req.getSession(false);
		if(session ==null) {
			req.getRequestDispatcher("/loginJSP?msg=Session Expired. Login Again").forward(req, resp);
		}else {
			req.getRequestDispatcher("/welcome").forward(req, resp);
		}
//		if (session == null) {
//			// Invalid session. Generate login page with error Info
//			out.print("<h1><span style='color:red'>Invalid Session. Please Login</span></h1>");
//			out.print("<br><br>");
//			RequestDispatcher dispatcher = req.getRequestDispatcher("./html/login.html");
//			dispatcher.include(req, resp);
//		} else {
//			// valid session Generate proper response
//			RequestDispatcher dispatcher = req.getRequestDispatcher("/welcome");
//			dispatcher.forward(req, resp);
//		}

	}

}
