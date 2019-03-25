<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.a {
	width: 500px;
	margin: auto;
	border: 3px solid black;
	background-color: #33ffad;
	background-position: center top;
	padding-top: 20px;
	padding-right: 15px;
	padding-bottom: 30px;
	padding-left: 15px;
}

.b {
	border-bottom: 2px solid black;
	background-color: lightgrey;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center" class="a">
		<h2 class="b">Enter User Details Here</h2>
		<table>
			<form:form action="loginUser" method="post"
				modelAttribute="profile">
				<tr>
					<td>EmailId</td>
					<td><form:input path="emailId" size="30" /></td>
					<td><form:errors path="emailId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="password" type="password" size="30" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
				</tr>
				<br>
				<tr>
					<td><input type="submit" value="Login" /></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>-->