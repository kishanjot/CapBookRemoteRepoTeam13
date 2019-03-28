<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <style>
.index1 {
	width: 500px;
	margin: auto;
	border: 5px solid black;
	background-color: lightorange;
	background-position: center top;
	background-color: yellow;
	padding-top: 20px;
	padding-right: 15px;
	padding-bottom: 30px;
	padding-left: 15px;
}

h1.h {
	border-bottom: 6px solid red;
	background-color: lightgrey;
	color: green;
	text: bold;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center" class="index1">
		<h1 class="h">*Cap-Book*</h1>
		<br>
		<table>
			<tr>
				<td>1) Click Here to</td>
				<td><a href="registration"> Sign Up </a></td>
			</tr>
			<tr>
				<td>2) Click Here to</td>
				<td><a href="login"> Log In </a></td>
			</tr>
		</table>
	</div>
</body>
</html> --%>

-----------------------------------------------------------------------------------------------


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<title>Capbook</title>
<head>
<link type="text/css" rel="stylesheet" href="style.css" />
<meta name="Description"
	content="Capbook Style Homepage Design with Login Form registration for using html and CSS" />


</head>
<style>
body {
	height: 750px;
}

.fb-header-base {
	width: 100%;
	height: 90px;
	position: absolute;
	top: 0;
	left: 0;
	color: #adb1ba;
	z-index: 7;
	font-family: verdana;
	-webkit-box-shadow: 0 3px 8px rgba(0, 0, 0, .25);
}

.fb-header {
	width: 100%;
	height: 90px;
	position: absolute;
	background: #095b28;
	top: 0;
	left: 0;
	color: #adb1ba;
	z-index: 7;
	font-family: verdana;
}

#img1 {
	left: 178px;
	height: 50px;
	width: 100px;
	top: 25px;
}

#form1 {
	left: 750px;
	height: 60px;
	width: 180px;
	top: 20px;
	font-family: verdana;
	font-size: 12px;
}

#form2 {
	left: 940px;
	height: 60px;
	width: 250px;
	top: 20px;
	font-family: verdana;
	font-size: 12px;
}

#img2 {
	top: 180px;
	left: 198px;
	width: 937px;
	height: 1195px;
}

.submit1 {
	left: 1130px;
	top: 35px;
	background: #5b7bc0;
	color: black;
	position: fixed;
	z-index: 20;
	height: 22px;
	width: 50px;
	cursor: pointer;
}

.fb-body {
	position: absolute;
	left: 0px;
	top: 90px;
	width: 100%;
	height: 645px;
}

#intro1 {
	left: 178px;
	top: 20px;
	font-family: verdana;
	font-size: 20px;
	color: #287a91;
	height: 75px;
	width: 550px;
}

#intro2 {
	left: 750px;
	top: 20px;
	font-family: verdana;
	font-size: 30px;
	color: #9baf34;
	font-weight: bold;
	height: 75px;
	width: 500px;
}

#intro3 {
	left: 750px;
	top: 70px;
	font-family: verdana;
	font-size: 18px;
	color: #228203;
	height: 50px;
	width: 300px;
}

#intro6 {
	left: 1178px;
	top: 20px;
	font-family: verdana;
	font-size: 20px;
	color: #287a91;
	height: 75px;
	width: 550px;
}

#form3 {
	top: 120px;
	left: 750px;
	font-family: verdana;
	font-size: 20px;
	color: #142170;
	width: 450px;
	height: 495px;
}

#namebox {
	width: 200px;
	height: 40px;
	border-radius: 5px 5px 5px 5px;
	background: white;
	padding: 10px;
	font-size: 18px;
	margin-top: 8px;
	border-width: 1px;
	border-style: solid;
	border-color: gray;
}

#mailbox {
	width: 408px;
	height: 40px;
	border-radius: 5px 5px 5px 5px;
	background: white;
	padding: 10px;
	font-size: 18px;
	margin-top: 8px;
	border-width: 1px;
	border-style: solid;
	border-color: gray;
}

#r-b {
	font-size: 12px;
	height: 15px;
	width: 15px;
}

.button2 {
	width: 250px;
	height: 40px;
	left: 750px;
	top: 625px;
	background: green;
	font-family: verdana;
	font-size: 18px;
	color: white;
	border-radius: 5px 5px 5px 5px;
	border-width: 1px;
	border-style: solid;
	border-color: gray;
	cursor: pointer;
	outline: none;
}

#intro4 {
	font-family: verdana;
	font-size: 12px;
	color: gray;
}

#intro5 {
	font-family: verdana;
	font-size: 14px;
	color: gray;
}

.fb-body-footer {
	width: 100%;
	position: absolute;
	left: 0px;
	height: 80px;
	background: white;
	top: 700px;
}

#fb-body-footer-base {
	width: 900px;
	top: 15px;
	left: 200px;
	color: #095b28;
	height: 60px;
}
</style>

<body>
<!-- ---LOGIN     -->
	<div class="fb-header-base"></div>
	<div class="fb-header">
<form:form action="loginUser" method="Post"
				modelAttribute="profile">
		<div id="form1" class="fb-header">
			Email or Phone<br> <form:input placeholder="Email" type="emailId"
				name="name"  path="emailId"/><br> <input type="checkbox" />Keep me logged in
		</div>

		<div id="form2" class="fb-header">
			Password<br> <form:input placeholder="Password" type="password"
				name="password"  path="password"/><br> Forgot your password?
		</div>
	
	<input type="submit" class="submit1" value="login" />
	</form:form>
	</div>
	
	<!-- Register -->
	<div class="fb-body">
		<div id="intro1" class="fb-body">
			Capbook helps you connect and share with the <br> people in your
			life.
		</div>
		<div id="intro6" class="fb-body"></div>
		<div id="intro2" class="fb-body">Create an account</div>
		<div id="img2" class="fb-body">
			<img src="cap10.PNG" />
		</div>
		<div id="intro3" class="fb-body">It's free and always will be.</div>
		<div id="form3" class="fb-body">
		<form:form action="registerUser" method="post"
				modelAttribute="profile">
						<form:input placeholder="First Name" type="text" id="namebox" name="name1" path="firstName" />
			<form:input placeholder="Last Name" type="text" id="namebox" path="lastName"  /> <br>
			<form:input placeholder="Email" type="text" id="mailbox" path="emailId" /><br> 
			<form:input placeholder="Country" type="text" id="namebox" path="country" /> 
			<form:input 	placeholder="City" type="text" id="namebox" path="city"/><br>
				 <form:input placeholder="Mobile Number" type="text" id="mailbox" path="mobileNo"/><br> 
				<form:input placeholder="Password" type="password" id="mailbox"  path="password"/><br> 
				<form:input 	type="date" id="namebox"  path="dateOfBirth"/><br>
			<br> <input type="radio" id="r-b" name="sex" value="male" checked="checked"/>Male
			<input type="radio" id="r-b" name="sex" value="female" />Female<br>
			<br>
			<p id="intro4">By clicking Create an account, you agree to our
				Terms and that you have read our Data Policy, including our Cookie
				Use.</p>
			<input type="submit" class="button2" value="Create an account" /> <br>
			<hr>
			<p id="intro5"></p>
</form:form>
		</div>

	</div>
	<div class="fb-body-footer">
		<div id="fb-body-footer-base" class="fb-body-footer">
			English (UK)<br>
			<hr>
			Sign Up,Log In:
		</div>
	</div>

</body>

</html>