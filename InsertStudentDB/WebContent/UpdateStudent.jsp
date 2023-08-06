<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<%
	int id = (int) request.getAttribute("id");
	String first = (String ) request.getAttribute("first");
	String last = (String) request.getAttribute("last");
	String add = (String) request.getAttribute("add");
	String city = (String) request.getAttribute("city");
	String salary = (String) request.getAttribute("salary");
	%>
	<form action="updateStud" >
		Id: <input type="text" name="id" value="<%=id%>">
		First name: <input type="text" name="first" value="<%=first%>">
		Last name: <input type="text" name="last" value="<%=last%>"> <br> <br>
		address: <input type="text" name="add" value="<%=add%>"> 
		City: <input type="text" name="city" value="<%=city%>"> 
		Salary: <input type="text" name="salary" value="<%=salary%>"> <br> <br>
		<button type="submit" value="submit">Update</button> 

	</form>
</body>
</html>