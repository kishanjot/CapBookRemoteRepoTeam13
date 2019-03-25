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
<title>Registration</title>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center" class="a">
		<h2 class="b">Enroll User Details Here</h2>
		<table>
			<form:form action="registerUser" method="post"
				modelAttribute="profile">
				<tr>
					<td>EmailId</td>
					<td><form:input path="emailId" size="30" /></td>
					<td><form:errors path="emailId" cssClass="error" /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><form:input path="firstName" size="30" /></td>
					<td><form:errors path="firstName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input path="lastName" size="30" /></td>
					<td><form:errors path="lastName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>DateOfBirth</td>
					<td><form:input path="dateOfBirth" size="30" /></td>
					<td><form:errors path="dateOfBirth" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><select>
							<option value="male">Male</option>
							<option value="female">Female</option>
							<option value="other">Other</option>
					</select></td>
				</tr>
				<tr>
					<td>MobileNo</td>
					<td><form:input path="mobileNo" size="30" /></td>
					<td><form:errors path="mobileNo" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><form:input path="country" size="30" /></td>
					<td><form:errors path="country" cssClass="error" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><form:input path="city" size="30" /></td>
					<td><form:errors path="city" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="password" type="password" size="30" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Security Question</td>
					<td><select>
							<option value="petname">Enter your pet's name</option>
							<option value="hometown">Enter your Home town</option>
							<option value="nickname">Enter your NickName</option>
					</select></td>
				</tr>
				<tr>
					<td>Security Answer</td>
					<td><form:input path="securityAns" size="30" /></td>
					<td><form:errors path="securityAns" cssClass="error" /></td>
				</tr>

				<br>
				<tr>
					<td><input type="submit" value="Create Account" /></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>
-->