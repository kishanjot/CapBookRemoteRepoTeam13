<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>CapBook Image Upload</title>
<style type="text/css">
.error{
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>CapBook Image Upload</h1>
	</div>
	<div class="container">
		<div align="center">
			<form action="uploadImage" method="post" enctype="multipart/form-data">
				<table>

					<tr>
						<td><font size="10">Email ID :</font></td>
						<td><input type="email" name="emailId" /></td>
					</tr>
					<tr>
						<td><font size="10">Choose profile picture :</font></td>
						<td><input type="file" name = "file" value="Choose the file"/></td>
					</tr>
					<tr>
					
						<td> 	
						<a href =editProfile> Upload The File  </a>
						</td>
					
					</tr>
				</table>
			</form>
			<div align="center" class="error"><font size="20">${errorMessage}</font></div>
			<br />
			<br /><br /><br /><br /><br /><br /><br /><br />
			<img src="/resources${profile.profilePic}">
			
			<br /> <a href="index">Go Back to home page</a>
		</div>
	</div>
</body>

</html>