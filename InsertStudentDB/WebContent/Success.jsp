<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h2>Submission Successfully...!</h2>
	<%
		String f = (String) request.getAttribute("f");
		out.print("Firstname = " + f);
		String l = (String) request.getAttribute("l");
		out.print("Lastname = " + l);
		String a = (String) request.getAttribute("a");
		out.print("Address = " + a);
		String c = (String) request.getAttribute("c");
		out.print("City = " + c);
		String s = (String) request.getAttribute("s");
		out.print("Salary = " + s);
	%>

</body>
</html>