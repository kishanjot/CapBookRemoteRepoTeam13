<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
.error {
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
			<form action="uploadImage" method="post"
				enctype="multipart/form-data">
				<table>

					 <tr>
						<td><font size="10">Email ID :</font></td>
						<td><input type="email" name="emailId" /></td>
					</tr>  
					<tr>
						<td><font size="10">Choose profile picture :</font></td>
						<td><input type="file" name="file" value="Choose the file" /></td>
					</tr>
					<tr>

						<td><a href=editProfile> Upload The File </a></td>

					</tr>
				</table>
			</form>
			<div align="center" class="error">
				<font size="20">${errorMessage}</font>
			</div>
			<br /> <br />
			<br />
			<br />
			<br />
			<br />
			<br />
			<br />
			<br /> <img src="/resources${profile.profilePic}"> <br />
			 <a href="userProfilePage">Go Back To User Profile Page</a>
		</div>
	</div>
</body>

</html> --%>





<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
	height: 300%;
	margin: 0;
	font-family: Arial, Helvetica, sans-serif; <
	img src="D: \Users\ADM-IG-HWDLAB1D\Desktop " style=" width:128px;
	height: 128px;
	">
}

* {
	box-sizing: border-box;
}

.bg-image {
	/* The image used */
	background-image: url("https://cdn1.medicalnewstoday.com/content/images/articles/010/10566/smoke-in-shape-of-ekg.jpg");
	/* Add the blur effect */
	filter: blur(8px);
	-webkit-filter: blur(8px);
	/* Full height */
	height: 100%;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

/* Position text in the middle of the page/image */
.bg-text {
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/opacity/see-through */
	color: white;
	font-weight: bold;
	border: 3px solid #f1f1f1;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	z-index: 2;
	width: 80%;
	padding: 20px;
	text-align: center;
}
</style>

</head>
<body>
<div class="bg-text">
<h1>Capbook Profile Picture Upload</h1>
</div>

	<div class="bg-image"></div>
	
	<div class="bg-text">
  
  <br>
  
 
			<form action="savefile" method="post"
								enctype="multipart/form-data">
								<input type="file" name="file" /><br> <br><input type="submit"
									value="Upload Profile Picture" /><br>
							</form>
			<div align="center" class="error">
				<font size="20">${errorMessage}</font>
			</div>
   <img src="/resources${profile.profilePic}"> <br />
			 <a href="userProfilePage">Go Back To User Profile Page</a>
</div>

</body>
</html>
