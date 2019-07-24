<!DOCTYPE html>
<%@page import="com.techchefs.emp.beans.EmployeeInfoBean"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="welcome">EMP</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navrSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>


		<form class="form-inline my-2 my-lg-0" action="./search" method="GET">
			<input class="form-control mr-sm-2" type="search"
				placeholder="Search" name="id" aria-labelSearch>
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>

		<a class="ml-auto" href="./logout">Logout</a>
	</nav>
	<% EmployeeInfoBean bean=(EmployeeInfoBean)request.getSession().getAttribute("bean"); %>
	<div>
	<br> ID : <%=bean.getId() %>
	<br> Name ====> <%=bean.getEmpName() %> 
	<br> Age ====>"  <%=bean.getAge() %>
	<br> Phone ====>"  <%=bean.getPhone() %>
	<br> Gender ====>"  <%=bean.getGender()%>
	<br> Salary ====>"  <%=bean.getSalary()%>
	<br> Joining Date ====>"  <%=bean.getJoiningDate()%>
	<br> Account number ====>"  <%=bean.getAccountNumber()%>
	<br>Email ====>"  <%=bean.getEmail()%>
	<br> Designation ====>" <%= bean.getDesignation()%>
	<br> DOB ====>" <%=bean.getDob()%>
	<br> DEPT_NO ====>"  <%=bean.getDepartmentId()%>
	<br> MNGR ID ====>" <%= bean.getManagerId()%>
	</div>
</body>
</html>
