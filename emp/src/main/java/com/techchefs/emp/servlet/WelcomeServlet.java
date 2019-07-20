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
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeInfoBean bean=(EmployeeInfoBean) req.getAttribute("bean");
		
		PrintWriter out=resp.getWriter();
		HttpSession session = req.getSession();
		if(bean==null) {
			bean=(EmployeeInfoBean) session.getAttribute("bean");
		}
		if (session == null) {
			// Invalid session. Generate login page with error Info
			out.print("<h1><span style='color:red'>Invalid Session. Please Login</span></h1>");
			out.print("<br><br>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./html/login.html");
			dispatcher.include(req, resp);
		} else {
			// valid session Generate proper response
		if(bean==null) {
			out.print("<html>");
			out.print("<body>");
			out.print("<h1> <span style=\"color:red\">Employee Not Found</span></h1>");
			out.print("</body>");
			out.print("</html>");
		}else {
			out.print("<!DOCTYPE html>                                                                        ") ;
			out.print("<html>                                                                                 ") ;
			out.print("<head>                                                                                 ") ;
			out.print("<meta charset=\"ISO-8859-1\">                                                            ") ;
			out.print("<title>Insert title here</title>                                                       ") ;
			out.print("<link rel=\"stylesheet\"                                                                 ") ;
			out.print("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"       ") ;
			out.print("	integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"   ") ;
			out.print("	crossorigin=\"anonymous\">                                                              ") ;
			out.print("<script                                                                                ") ;
			out.print("	src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" ") ;
			out.print("	></script>                                                     ") ;
			out.print("</head>                                                                                ") ;
			out.print("<body>                                                                                 ") ;
			out.print("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">                            ") ;
			out.print("  <a class=\"navbar-brand\" href=\"welcome\">EMP</a>                                             ") ;
			out.print("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navrSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">");
			out.print("    <span class=\"navbar-toggler-icon\"></span>                                          ") ;
			out.print("  </button>                                                                            ") ;
			out.print("                                                                                       ") ;
			out.print("                                                                                       ") ;
			out.print("    <form class=\"form-inline my-2 my-lg-0\" action=\"./search\" method=\"GET\">                                            ") ;
			out.print("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" name=\"id\" aria-labelSearch\">");
			out.print("      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button") ;
			out.print("    </form>                                                                            ") ;
			
			out.print("    <a class=\"ml-auto\" href=\"./logout\">Logout</a>                                             ") ;
			out.print("</nav>                                                                                 ") ;
			out.print("                                                                                       ") ;
			out.print("<br> ID  "
					+ ">" + bean.getId());
			out.print("<br> Name  ====>" + bean.getEmpName());
			out.print("<br> Age  ====>" + bean.getAge());
			out.print("<br> Phone  ====>" + bean.getPhone());
			out.print("<br> Gender  ====>" + bean.getGender());
			out.print("<br> Salary  ====>" + bean.getSalary());
			out.print("<br> Joining Date  ====>" + bean.getJoiningDate());
			out.print("<br> Account number  ====>" + bean.getAccountNumber());
			out.print("<br>Email  ====>" + bean.getEmail());
			out.print("<br> Designation  ====>" + bean.getDesignation());
			out.print("<br> DOB  ====>" + bean.getDob());
			out.print("<br> DEPT_NO  ====>" + bean.getDepartmentId());
			out.print("<br> MNGR ID  ====>" + bean.getManagerId());			
			
			out.print("</body>                                                                                ") ;
			out.print("</html>                                                                                ") ;
		}
	   }
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}


}
