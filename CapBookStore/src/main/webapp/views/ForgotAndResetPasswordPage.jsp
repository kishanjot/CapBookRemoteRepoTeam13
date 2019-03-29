<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>ForgetAndResetPassword</title>

<!-- Font Awesome Icons -->
<link href="resources/index/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Merriweather+Sans:400,700"
	rel="stylesheet">
<link
	href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic'
	rel='stylesheet' type='text/css'>

<!-- Plugin CSS -->
<link href="resources/index/vendor/magnific-popup/magnific-popup.css"
	rel="stylesheet">

<!-- Theme CSS - Includes Bootstrap -->
<link href="resources/index/css/creative.min.css" rel="stylesheet">

</head>

<body id="page-top">

	<header class="masthead">
		<div class="container h-100">
			<div
				class="row h-100 align-items-up justify-content-center text-center">
				<div class="col-lg-10 align-self-end">
					<h1 class="text-uppercase text-white font-weight-bold">Login
						Here</h1>
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
										<input type="text" name="emailId" class="form-control"
											id="emailId" placeholder="EmailID" />
									</div>

									<div class="form-group">
										<input type="text" name="securityQstn" class="form-control"
											id="securityQstn" placeholder="Security Question" />
									</div>

									<div class="form-group">
										<input type="text" name="securityAns" class="form-control"
											id="securityAns" placeholder="Security Answer" />
									</div>

									<div class="form-group">
										<input type="submit" class="btn btn-success"
											value="Change Password" />
									</div>
								</div>
							</div>

						</form>
					</div>

				</div>
			</div>
		</div>
	</header>
</body>

</html>