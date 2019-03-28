<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>User Profile Page</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

/* Style the body */
body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

/* Header/logo Title */
.header {
	padding: 80px;
	text-align: center;
	background: #1abc9c;
	color: white;
}

/* Increase the font size of the heading */
.header h1 {
	font-size: 40px;
}

/* Style the top navigation bar */
.navbar {
	overflow: hidden;
	background-color: #333;
}

/* Style the navigation bar links */
.navbar a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 20px;
	text-decoration: none;
}

/* Right-aligned link */
.navbar a.right {
	float: right;
}

/* Change color on hover */
.navbar a:hover {
	background-color: #ddd;
	color: black;
}

/* Column container */
.row {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	-ms-flex-wrap: wrap; /* IE10 */
	flex-wrap: wrap;
}

/* Create two unequal columns that sits next to each other */
/* Sidebar/left column */
.side {
	-ms-flex: 30%; /* IE10 */
	flex: 30%;
	background-color: #f1f1f1;
	padding: 20px;
}

/* Main column */
.main {
	-ms-flex: 70%; /* IE10 */
	flex: 70%;
	background-color: white;
	padding: 20px;
}

/* Fake image, just for this example */
.fakeimg {
	padding: 1px;
	border: 3px solid #021a40;
	width: 50%;
	padding: 20px;
}
/* profile pic radius*/
#img {
	border-radius: 50%;
	width: 200px;
	height: 200px;
}
/*div background image*/
#bgimg {
	background-image:
		url('https://images.unsplash.com/photo-1530103043960-ef38714abb15?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80');
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}
/* Footer */
.footer {
	padding: 20px;
	text-align: center;
	background: #ddd;
}

/* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 700px) {
	.row {
		flex-direction: column;
	}
}

.button {
	display: inline-block;
	border-radius: 4px;
	background-color: black;
	border: none;
	color: #FFFFFF;
	text-align: center;
	font-size: 15px;
	padding: 3px;
	width: 100px;
	transition: all 0.5s;
	cursor: pointer;
	margin: 5px;
}

.button span {
	cursor: pointer;
	display: inline-block;
	position: relative;
	transition: 0.5s;
}

.button span:after {
	content: '\00bb';
	position: absolute;
	opacity: 0;
	top: 0;
	right: -20px;
	transition: 0.5s;
}

.button:hover span {
	padding-right: 25px;
}

.button:hover span:after {
	opacity: 1;
	right: 0;
}
/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
	.navbar a {
		float: none;
		width: 100%;
	}
}
</style>
</head>
<body>

	<div class="header" id=bgimg>
		<div class="fakeimg" id="img" style="height: 200px;">
	
		<a href="uploadPic">
		<input type ="button"  class="button"  value=" upload"style="vertical-align: middle" /> </a>
	</div></div>

	<div class="navbar">

		<a href="#">Photos</a> <a href="#">Friends</a>


	</div>

	<div class="row">
		<div class="side">
			<h2>About Me</h2>

			<div class="fakeimg" id="img" style="height: 200px;"></div>


		</div>
		<div class="main">
			<h2>Add bio</h2>
			<textarea id="subject" name="subject"
				placeholder="Add somenthing about you..." style="height: 100px"></textarea>
			<br>
			<button class="button" style="vertical-align: middle">
				<span>Post</span>
			</button>

			<br>
			<h2>Personal Details</h2>
			<h5>Lives in Chandigarh</h5>
			<h5>From Chandigarh</h5>
			<h5>Mobile number Chandigarh</h5>
			<h5>Relationship status</h5>


		</div>
	</div>

	<div class="footer">
		<h2>Footer</h2>
	</div>

</body>
</html>