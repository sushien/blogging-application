 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--  <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>create blog</title>
</head>
<body>
<a href="home2">home</a>
<a href="logout1">logout</a>



<form action="/BloggingApplication/approve_req" method="POST">
<h1>Enter your blog details</h1>
	   		<table>
			    <tr>
			        <td>Blog Title:</td>
			        <td><input type="text" name="blogtitle"  /></td>
			    </tr>
			    <tr>
			        <td>Blog summary</td>
			        <td><input type="textarea" name="summary" /></td>
			    </tr>
			    <tr>
			        <td>Blog description</td>
			        <td><input type="textarea" name="description" /></td>
			    </tr>
			    <tr>
			        <td>Author</td>
			        <td><input type="textarea" name="author" /></td>
			    </tr>
			     <tr>
			        <td>Category</td>
			        <td><input type="textarea" name="category" /></td>
			    </tr>
			    </tr>
					<input type=hidden " name="username" value="${update_blog1.blogId}">
				</tr>
			    <tr>
			        <td>upload</td>
			        <td><input type="file" name="browse" /></td>
			    </tr>

				<tr>
			      <button type="submit" value="approve_req">send for approval</button>
		      </tr>
			</table> 
		</form> 









<a href="approve_req">approve request</a>
<h1>create blog successfully!!</h1>${mds}
</body>
</html> 
 --%>

<html>

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Blog Home - Start Bootstrap Template</title>

    <!-- Bootstrap core CSS -->
     <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/signin.css"></link>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/home.css" ></link>
 
 
 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	

    <!-- Custom styles for this template -->
    
    
 

  </head>

  <body>
<form action="/BloggingApplication/approve_req" method="POST">
    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">Blog Space</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="home1.html">Registered Username
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item active">
              <a class="nav-link" href="home">Logout
               
              </a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
<div class="container" ; style="padding-top:100px ;padding-bottom:100px"">
<div class="form-group">
  <label for="usr">Enter Title here:</label>
  <input type="text" name="blogtitle" class="form-control" id="usr">
</div><br/>
<br/>
<label for="author">Enter Author Name:</label>
<input type="text" name="author" class="form-control" id="author">
<br/>
<br/>
Select Category:
	<div class="dropdown">
    	<select name="category" >
      		<option value="lifestyle">Lifestyle</option>
      		<option value="politics">Politics</option>
      		<option value="technology">Technology</option>
      		<option value="education">Education</option>
	  		<option value="fashion">Fashion</option>
	  		<option value="food">Food</option>
	  		<option value="entertainment">Entertainment</option>
	  		<option value="global">Global News</option>
	  	 	<option value="health">Health Care</option>
    		<option value="travel">Travel</option>
			<option value="sports">Sports</option>
	</div>
 	<div class="form-group">
  		<label for="comments">Enter the Summary</label>
  		<textarea class="form-control" name="summary"  rows="15" value="Write Summary here"id="comments"></textarea>
	</div>
	<br/>
	<div class="form-group">
  		<label for="comment">Enter the description</label>
  		<textarea class="form-control"name="description"  rows="35" id="comment"></textarea>
	</div>
<input type=hidden " name="username" value="${update_blog1.blogId}">
<br/>
<p > <center> <button type="submit" value="approve_req">send for approval</button>&nbsp &nbsp
 
</div>


    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2017</p>
      </div>
      <!-- /.container -->
    </footer>

   

  </body>
 
</html>
