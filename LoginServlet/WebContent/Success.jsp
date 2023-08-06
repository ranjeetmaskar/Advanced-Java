<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<h2>Data is correct</h2>
<%
	String s = (String) request.getAttribute("s");
	out.println("Username:"+s);
%>
</body>
</html>