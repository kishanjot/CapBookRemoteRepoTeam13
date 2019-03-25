<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<div align="center">
		<h2>Welcome ${profile.firstName} ${profile.lastName} Your
			SignUp Has Been Done Successfully :)</h2>
		<h2>EmailId:-${profile.emailId}</h2>
		<br> <a href="index">*Back To Home Page*</a>
	</div>
</body>
</html>