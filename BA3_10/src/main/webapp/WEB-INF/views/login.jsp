<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <h1>Enter your login details</h1>
<a href="home">home</a>
<a href="sign_in">sign in</a>
<a href="sign_up">sign up</a> -->
<!-- <form action="login1" method="post">  
<h1>Enter your login details</h1>
Email:<input type="text" name="email"/><br/>  
Password:<input type="password" name="password"/><br/>  
input type="sign_in" value="login"/ 
<a href="home">home</a>
<a href="sign_in">sign in</a>
<a href="sign_up">sign up</a> 
</form>  -->



<a href="home">home</a>

<a href="sign_up">sign up</a> 

<form action="/BloggingApplication/sign_in" method="POST">
<h1>Enter your login details</h1>
	   		<table>
			    <tr>
			        <td>User username:</td>
			        <td><input type="text" name="username" value="email" /></td>
			    </tr>
			    <tr>
			        <td>User Password:</td>
			        <td><input type="password" name="password" value="password"/></td>
			    </tr>

				<tr>
			      <button type="submit" value="signin">signin</button>
		      </tr>
			</table> 
		</form>




<form:form method="POST"  modelAttribute="user" action="">
           <h1>Enter your login details</h1>
	   		<table>
			    <tr>
			        <td><form:label path="username">User username:</form:label></td>
			        <td><form:input path="username" value="${user.username}" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="password">User Password:</form:label></td>
			        <td><form:input path="password" value="${user.password}"/></td>
			    </tr>

				<tr>
			      <a href="sign_in">sign in</a>
		      </tr>
			</table> 
		</form:form>
</body>
</html> --%>
<html >

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Blog Home - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
   

    <!-- Custom styles for this template -->


  
<%--  <script type="text/javascript" src="<%request.getContextPath();%>/resources/js/signin.js"></script> --%>
 <link rel="text/javascript" href="<%=request.getContextPath()%>/resources/js/signin.js"></link> 
 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/signin.css"></link>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/home.css" ></link>
 
 
 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
		




  </head>

  <body>
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">Blog Space</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="home">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            
			   <li class="nav-item active" >
              <a class="nav-link"  href="sign_up">SignUp</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
	<br/>
	<br/>
	


  <div class="container" style="width:50%; padding-top:40px;"">
  
  <h2 style="text-align:center;" ><b>LOG IN</b> </h2>
  
  <div class="jumbotron" >

<form name="myForm" action="/BloggingApplication/sign_in" method="post" onsubmit="return validateForm()">  

<div class="form-group">
 <label for="name"> <b>Username:</b></label>
 <input type="text" class="form-control" id="username"  name="username" value="">
 </div>




<div class ="form-group">
      <label for="mail"><b>Password:</b></label>
      <input type="password" class="form-control" id="password"  name="password" value="" >
    </div>
                                                                    

  <button type="submit" name="submit" value="sign_in" class="btn btn-default" id="submitform"><b>Submit</b></button>
  <button type="reset" name="Cancel" class="btn btn-default" id="resetform"><b>Reset</b></button><br/>
  <a href="forgotpassword.jsp">Forgot Password?</a>

</form>
</div>
</div>



    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-1 text-center text-white">Copyright &copy; Blog Space 2017</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
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

    if(!x.test(myForm.password.value)) {
      alert("Error: at least one number, one lowercase and one uppercase letter at least six characters");
      myForm.password.focus();
      return false;
    }
	
}
</script>
</body>
</html>
