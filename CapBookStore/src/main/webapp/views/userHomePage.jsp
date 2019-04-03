<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core"%>

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
 padding:1px;
  border:3px solid #021a40;
  width: 50%;
  padding: 20px;
 
}
/* profile pic radius*/
#img
{

border-radius: 50%;
 width: 200px;
 height: 200px;
}
/*div background image*/
#bgimg {
    background-image: url('https://images.unsplash.com/photo-1530103043960-ef38714abb15?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80');
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

/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
  .navbar a {
    float: none;
    width: 100%;
  }
}

.dropbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
}

.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color: #3e8e41;}
</style>
</head>
<body>

<div class="header" id=bgimg>
  <!--<div class="fakeimg" id="img" style="height:200px; ">-->

  </div>
</div>

<div class="navbar">

  <a href="#">About Me</a>

 
 <!--  <a href="#">Friends</a> -->
  
  <div class="dropdown">
  <button class="dropbtn">Friends</button>
  <div class="dropdown-content">
    <a href="#">Link 1</a>
    <a href="#">Link 2</a>
    <a href="#">Link 3</a>
  </div>
</div>
 
  <a href="#">Notifications</a>
   <a href="logoutUser" class="right">LogOut</a>
  <a href="editProfile"> Edit Profile</a>
 
</div>

<div class="row">
  <div class="side">
    <h2>About Me</h2>
    	 

     <img src="/resources${login.profilePic}">

    <p>${login.firstName} ${login.lastName}</p>

    

  </div>
  <div class="main">
    <h2>Hey, What's Going On In Your Life? Post Here</h2>
   
   	<form action="updatePost" method="post">
									<textarea rows="4" cols="80" name="postMessage"></textarea>
									</p>
									<div class="w3-button w3-theme">
										<i class="fa fa-pencil"></i> 
										<input type="submit" class="w3-button w3-theme" value="Post" />
										
									</div>
								</form>
								
								<form action="showAllPosts" method="post">
										<input type="submit" class="w3-button w3-theme" value="See Old Posts" />
								</form>
<div style="background-color:lightblue">
							<s:forEach var="abc" items="${posts}">
                                Posted By:- ${abc.profile.emailId}<br>
                               Message :- ${abc.postContent}<br><br>
                               <hr>
                                </s:forEach>
</div>

</body>
</html>