<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<form action="StudentDetail" method="post">
		First name: <input type="text" name="firstname">
		Last name: <input type="text" name="lastname"> 
		salary: <input type="text" name="salary">
		<input type="submit" value="submit">
	</form>
	<a href="SelectRecord">Show all records</a>
</body>
</html>