<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		User-name: <input type="text" name="user"><br><br>
		Password: <input type="password" name="pass"><br><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>