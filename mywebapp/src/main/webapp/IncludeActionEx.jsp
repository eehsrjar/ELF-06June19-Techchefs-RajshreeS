<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
LLLLLLLLLLLLLLLLLLLLLLLLL
<br>
<jsp:include page="index.html"></jsp:include>
<br>
AAAAAAAAAAAAAAA
<br>
<jsp:include page="currentDate"></jsp:include>
<br>
AAAAAAAAAAAAAAA
<br>
<jsp:include page="currentDate?fname=gfffffffffff&lname=tttttttttttttt"></jsp:include>
<br>
AAAAAAAAAAAAAAA
<br>
<jsp:include page="currentDate">
	<jsp:param value="gdfhj" name="fname"/>
	<jsp:param value="fghd" name="lname"/>
</jsp:include>
<br>
^^^^^^^^^^^^^&&&&&&&
<br>
<jsp:include page="myFirstJSP.jsp"></jsp:include>
<br>
</body>
</html>