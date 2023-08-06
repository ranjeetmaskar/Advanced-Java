<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failure</title>
</head>
<body>
<h2>Data is incorrect</h2>
<%
	String s=(String)request.getAttribute("d");
	out.println("Username "+ s);
%>
</body>
</html>