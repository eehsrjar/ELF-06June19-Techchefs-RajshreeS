<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
	<h1>Current date and time :<%String currentDate = new Date().toString(); %>
	<br>
	<span style="color:red"><%= currentDate %>
</span></h1>

</body>
</html>