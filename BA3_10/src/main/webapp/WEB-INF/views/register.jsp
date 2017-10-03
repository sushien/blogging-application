<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter your  details</h1>
<a href="home">home</a>
<a href="go_to_login">sign in</a>
<form action="/BloggingApplication/go_to_home1" method="POST">
<h1>Enter your login details</h1>
	   		<table>
			    <tr>
			        <td>User username:</td>
			        <td><input type="text" name="username" /></td>
			    </tr>
			    <tr>
			        <td>Email id:</td>
			        <td><input type="email" name="email"  /></td>
			    </tr>
			    <tr>
			        <td>User Password:</td>
			        <td><input type="password" name="password" /></td>
			    </tr>

				<tr>
			      <button type="submit" value="go_to_home1">signup</button>
		      </tr>
			</table> 
		</form>

</form>  
<a href="go_to_home1">sign up</a>
</body>
</html> -->

<html>

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Blog Home - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
   <!--  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    Custom styles for this template
    <link href="css/blog-home.css" rel="stylesheet">
	<link rel="stylesheet" href="css/signup.css">
	<script type="text/javascript" src="js/signup.js"> -->

 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/signup.css" ></link>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/blog-home.css" ></link>

 
 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
		
	
	
	
	
	
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
</script>

	
  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="home">Blog Space</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active"  >
               
                <!-- <a class="nav-link" href="home">Home -->
                
                <span class="sr-only">(current)</span>
              </a>
            </li>
            
          </ul>
        </div>
      </div>
    </nav>
  <body >
  <div class="container"  >
  
  <div class="container5">
  <h1 ><b>Blog Space</b></h1 >
  <h2  >Registration Form </h2>
  </div>
  <div class="jumbotron" >

  <form name="myForm" action="/BloggingApplication/go_to_home1" onsubmit="return validateForm()" method="post">  
<div class="form-group">
      <label for="name"><b>Username:</b></label>
      <input type="text" class="form-control" id="username" name="username">
    </div>


<div class="form-group">
      <label for="mail"><b>Password:</b></label>
      <input type="password" class="form-control" id="password" name="password">
    </div>



<div class="form-group">
      <label for="mail"><b>Enter the email address:</b></label>
      <input type="mail" class="form-control" id="email" name="email" >
    </div>


  


<button type="submit" a href="/sign_in" name="submit" class="btn btn-default" id="submitform" ><b>Submit</b></button>
  <button type="reset" name="Cancel" class="btn btn-default" id="resetform"><b>Cancel</b></button>	
  <br></br>
  </form>
  <p>Already have an Account? <a href="go_to_login">Sign In</a></p><br>
</form>

</div>
</div>
</div>
</body>
    <!-- /.container -->

    <!-- Footer -->
    <footer class=" py-5 bg-dark"    >
      <div class="container1">
        <p class="m-0 text-center text-white">Copyright &copy; Blog Space 2017</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
<!--     <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script> -->
<script>
function validateForm() {
    var x = document.forms["myForm"]["username"].value;
    if (x == "") {
        alert("username must be filled");
        return false;
    }
	x = /(?=.*[a-z]|[A-Z]).{6,}/;
    if(!x.test(myForm.username.value)) {
      alert("Error: Username must minimun six characters");
      myForm.username.focus();
      return false;
    }
	 var y = document.forms["myForm"]["password"].value;
    if (y == "") {
        alert("password must be filled");
        return false;
    }
	y = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;

    if(!y.test(myForm.password.value)) {
      alert("Error: Password must contain at least one number, one lowercase and one uppercase letter at least six characters");
      myForm.password.focus();
      return false;
    }
	var z = document.forms["myForm"]["email"].value;
    if (z == "") {
        alert("email must be filled");
        return false;
    }
	z = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

    if(!z.test(myForm.email.value)) {
      alert("enter a valid email id");
      myForm.email.focus();
      return false;
	
    
	
}
}

</script>



  </body>

</html>
