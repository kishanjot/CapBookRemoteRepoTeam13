<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
	height: 100%;
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

	<div class="bg-image"></div>
		
	 
<div class="bg-text">
<h1>"Welcome to CapBook   ${profile.firstName} ${profile.lastName}"</h1>
  <h2>You Have Been Successfully Registered :)</h2>
  <h2>Your Registered EmailId is:-${profile.emailId}</h2>
  <br>
  <a href="index"  >
	 <img src="https://static1.squarespace.com/static/54ff4e2ee4b0c31d3c0f20bb/t/5a633f08e4966be2942a0e40/1516453741436/back-to-main-page-of-tajweed-rules-in-English.png" border="0"  width="270" height="50">
		</a>
</div>
</body>
</html>
