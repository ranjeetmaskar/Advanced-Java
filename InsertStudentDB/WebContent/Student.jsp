<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<form action="InsertStudent" method="post">
		First name: <input type="text" name="first">
		Last name: <input type="text" name="last"><br><br>
		address: <input type="text" name="add">
		City: <input type="text" name="city">
		Salary: <input type="text" name="salary"><br><br>
		<button type="submit" value="submit">Save</button><br><br>
		
	</form>
	<a href="ShowAllRecords">Show All Records</a>
</body>
</html>