<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html lang="en">
<head>
<title>Page Title</title>
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
	padding: 50px;
	text-align: right;
	/* background-image:url("https://previews.123rf.com/images/alexaldo/alexaldo1409/alexaldo140900388/31775157-abstract-network-global-connections-concept-black-and-white-background.jpg"); 
 width: 200%; 
 height: 100%;  */
	color: black;
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
	background-color: #aaa;
	width: 100%;
	padding: 20px;
}

/* profile pic radius*/
#img {
	border-radius: 50%;
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

	<div class="header">
		<background ="https://previews.123rf.com/images/alexaldo/alexaldo1409/alexaldo140900388/31775157-abstract-network-global-connections-concept-black-and-white-background.jpg" width="2000" height="300"> 
			<img src="https://shortcut-test2.s3.amazonaws.com/uploads/project/attachment/51762/default_CBICON.png"
			border="0" align="left" width="350" height="150">
		<h1 align="center">
			<b>CAP BOOK</b>
		</h1>
		<h3 align="center">Connecting People Since 1947</h3>
	</div>

	<div class="navbar">
		<a href="#">Profile</a> 
		<a href="#">Friends</a> 
		<a href="#">	Messages</a> 
		<a href="#">Notifications</a> 
		
			<a href="logoutUser" class="right"> Logout</a>
	</div>

	<div class="row">
		<div class="side">
			<h5>Photo of me:</h5>
			<div class="fakeimg"  id="img" style="height: 200px;" >Image</div>
			<p>Some text about me in culpa qui officia deserunt mollit anim..</p>
			<h3>More Text</h3>
			<p>Lorem ipsum dolor sit ame.</p>
			<div class="fakeimg" style="height: 60px;">Image</div>
			<br>
			<div class="fakeimg" style="height: 60px;">Image</div>
			<br>
			<div class="fakeimg" style="height: 60px;">Image</div>
		</div>
		<div class="main">
			<h2>TITLE HEADING</h2>
			<h5>Title description, Dec 7, 2017</h5>
			<div class="fakeimg" style="height: 200px;">Image</div>
			<p>Some text..</p>
			<p>Sunt in culpa qui officia deserunt mollit anim id est laborum
				consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
				labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
				exercitation ullamco.</p>
			<br>
			<h2>TITLE HEADING</h2>
			<h5>Title description, Sep 2, 2017</h5>
			<div class="fakeimg" style="height: 200px;">Image</div>
			<p>Some text..</p>
			<p>Sunt in culpa qui officia deserunt mollit anim id est laborum
				consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
				labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
				exercitation ullamco.</p>
		</div>
	</div>

	<div class="footer">
		<h2>Footer</h2>
	</div>

</body>
</html>


