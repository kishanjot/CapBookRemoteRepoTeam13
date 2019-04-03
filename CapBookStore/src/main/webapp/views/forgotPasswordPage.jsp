<!DOCTYPE html>

<html>

<head>

<meta name="viewport" content="width=device-width, initial-scale=1">

<style>
body, html {
	height: 100%;
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

.bg-image {
	/* The image used */
	background-image:
		url("https://wallpapersite.com/images/wallpapers/blur-background-3840x2400-spectrum-electromagnetic-4k-901.jpg");
	/* Add the blur effect */
	filter: blur(6px);
	-webkit-filter: blur(6px);
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

.button {
	display: inline-block;
	border-radius: 4px;
	background-color: #f4511e;
	border: none;
	color: #FFFFFF;
	text-align: center;
	font-size: 28px;
	padding: 20px;
	width: 200px;
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
</style>
</head>
<body id="page-top">
	<div class="bg-image"></div>
	<div class="bg-text">
		
			<header class="masthead">
				<div class="container h-100">
					<div
						class="row h-100 align-items-up justify-content-center text-center">
						<div class="col-lg-10 align-self-end">
							<h1 class="text-uppercase text-white font-weight-bold">Forgot
								Password?</h1>
							<br>
							<h3>No problem reset your password</h3>
							<br>
						</div>
					</div>

					<div class="container-fluid justify-text-center" id="wrapper"
						style="padding: 0% 10 0 0;">
						<div class="container">
							<div class="row " id="loginForm">
								<div class="col-md-4 col-md-offset-4"></div>
								<form action="forgotPasswordAct" method="post" role="form">
									<div class="col-md-12 col-md-offset-12">
										<div class="form">
											<div class="form-group">
												Email:: &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; <input type="text"
													name="emailId" class="form-control" id="emailId"
													placeholder="EmailID" />
											</div>
											<hr>
											<div class="form-group">

												Question:: &nbsp; &nbsp; &nbsp; &nbsp; <select
													name="securityQstn">
													<option>Security Question</option>
													<option value="What's your nick name?">What's your
														nick name?</option>
													<option value="What's your favourite game?">What's
														your favourite game?</option>
													<option value="What's your pet name?">What's your
														pet name?</option>
													<option value="What's your favourite car?">What's
														your favourite car?</option>
													<option value="What's your favourite book?">What's
														your favourite book?</option>
													<option value="What's your birthplace?">What's
														your Birth Place?</option>
												</select>
											</div>
											<hr>
											<div class="form-group">

												Your Answer:: <input type="text" name="securityAns"
													class="form-control" id="securityAns"
													placeholder="Security Answer" />

											</div>
											<hr>
											<div class="form-group">
												Password:: <input type="password" name="password"
													class="form-control" id="password"
													placeholder="New Password" required />
											</div>
											<hr>
											<div class="form-group">
												<input type="submit" class="btn btn-success"
													onclick="alert('Your password changed successfully')"
													value="Change Password" />
											</div>
											<hr>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</header>
			<br>
			<br>

			<div>
				<a href="index"> <img
					src="https://static1.squarespace.com/static/54ff4e2ee4b0c31d3c0f20bb/t/5a633f08e4966be2942a0e40/1516453741436/back-to-main-page-of-tajweed-rules-in-English.png"
					border="0" width="270" height="50">
				</a>
			</div>
	</div>
</body>

</html>

