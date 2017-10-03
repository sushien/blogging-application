<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="create_blog">create blog here</a>
	<a href="my_blogs">my blogs</a>
	<c:if test="${!empty list3}">
		<c:forEach items="${list3}" var="blogs">
			<c:out value="${blogs.blogId}" />
			<c:out value="${blogs.blogTitle}" />
			<a href="open_blogaut?id=${blogs.blogId}">${blogs.blogTitle}</a>
			<c:out value="${blogs.category}" />
			<c:out value="${blogs.summary}" />
			<c:out value="${blogs.modifiedDate}" />
			<c:out value="${blogs.author}" />
			<c:out value="${blogs.status}" />
			<a href="update_blog?id=${blogs.blogId}">update blog</a>
			<a href="delete_blog?id=${blogs.blogId}">delete blog</a>
			<br>
			<br>
		</c:forEach>

	</c:if>

	<a href="search_title2">search title</a>
	<a href="open_bloga">blogs</a>
	<a href="logout2">logout</a>
	<a href="home1">home</a>
</body>
</html> --%>

<html>

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Blog Post</title>
     <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/signin.css"></link>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/home.css" ></link>
 
 
 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	
<!-- 
    Bootstrap core CSS
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    Custom styles for this template
    <link href="css/blog-post.css" rel="stylesheet">

	Custom styles for Search template
	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
  <style>
  body {
   /* padding-top: 50px;*/
}
.dropdown.dropdown-lg .dropdown-menu {
    margin-top: -1px;
    padding: 6px 20px;
}
.input-group-btn .btn-group {
    display: flex !important;
}
.btn-group .btn {
    border-radius: 0;
    margin-left: -1px;
}
.btn-group .btn:last-child {
    border-top-right-radius: 4px;
    border-bottom-right-radius: 4px;
}
.btn-group .form-horizontal .btn[type="submit"] {
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
}
.form-horizontal .form-group {
    margin-left: 0;
    margin-right: 0;
}
.form-group .form-control:last-child {
    border-top-left-radius: 4px;
    border-bottom-left-radius: 4px;
}

@media screen and (min-width: 768px) {
    #adv-search {
        width: 500px;
        margin: 0 auto;
    }
    .dropdown.dropdown-lg {
        position: static !important;
    }
    .dropdown.dropdown-lg .dropdown-menu {
        min-width: 500px;
    }
	
	select.form-control:not([size]):not([multiple]) {
    height: calc(3.75rem + 2px);
}
.button {
    background-color: #555555; /* Black */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
	border-radius:4px;
	position:relative;
	left:7%;
	right:10%;
	bottom:10%;
	top:10%;
}
.button1 {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
    margin: 4px 2px;
    cursor: pointer;
	border-radius:4px;
	position:relative;
	left:60%;
	right:10%;
	bottom:10%;
	top:10%;
}
.button2 {
    background-color: #f44336; /* Red */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
    margin: 4px 2px;
    cursor: pointer;
	border-radius:4px;
	position:relative;
	left:60%;
	right:10%;
	bottom:10%;
	top:10%;
}
}
  </style>
  </head>

  <body>

    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark navbar-fixed-top" >
      <div class="container">
        <a class="navbar-brand" href="#">Blog Space</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
           <span class="navbar-toggler-icon"></span>
            </button>
          <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto" style="float:center;">
               <form action="/BloggingApplication/send_title" method="post">
  				   <input type="text" name="title"/><button type="submit" value="send_title">search</button>
           				 </ul>
       						 <div class="collapse navbar-collapse" id="navbarResponsive">
          						<ul class="navbar-nav ml-auto" style="float:right;">
         						   <li class="nav-item active">
     						         <a class="nav-link" href="home1.html">Home
       						         <span class="sr-only">(current)</span>
    						          </a>
 						          </li>
            						<li class="nav-item active">
         							     <a class="nav-link" >Registered Username</a>
        							</li>
         							<li class="nav-item active">
              							<a class="nav-link" href="signin.html">SignOut</a>
            						</li>
         						 </ul>
           					</div>
       					</div>
      			</div>
   		 </nav>
<br/>
<br/>
<br/>

                
            </div>
			</div>
<br/>

    <!-- Page Content -->
<div class="container" style="padding:1px">

      <div class="row" style="float:left;">

        <!-- Post Content Column -->
        <div class="col-lg-8">
		
		<p><h3> Blogs created by you:</h3></p>
		
		
          <!-- Title -->
		  
         
		  <h2><p><a href="blog1.html" >	
                     Political Science Now - American Political Science Association</a></p> </h2>
					 <!-- Date/Time -->
          <p>by <b>Charles Tailor</b> &nbsp;&nbsp;  Political Science &nbsp;&nbsp; Posted on January 1, 2017 at 12:00 PM </p>
					 <p><h5><i>A site from the American Political Science Association covering people, research and 
					 news in political science. APSA supports political scientists from all fields of inquiry, regions, and 
					 occupational endeavors within and outside academe in order to expand awareness and understanding of politics.</i></p></h5>
					 		<p><a href="updateblog.html" class="button1" role="Approve">Update</a>
<a href="yourblogs.html" class="button2" role="Approve">delete</a></p>


			<hr>	 
           <h2><p><a href="#" >	
                    Quantum quartet is on the cards</a></p> </h2>
					<p>by <b>Rohan Vadera</b> &nbsp;&nbsp;   Science-Physics &nbsp;&nbsp; Posted on January 1, 2017 at 12:00 PM </p>
					<p><h5>Theoretical physicist and blogger Sabine Hossenfelder has created a lovely set
					of cards featuring pioneering quantum physicists. You can see my two favourites above.
						Resembling football or baseball cards, they each feature a portrait plus a fact or two about the physicist
						</p></h5>
								<p><a href="updateblog.html" class="button1" role="Approve">Update</a>
<a href="yourblogs.html" class="button2" role="Approve">delete</a></p>

						
			<hr>	 
           <h2><p><a href="#" >	
                   Up in smoke (and clouds) over the southeast Atlantic</a></p> </h2>
					<p>by <b>Michael Diamond</b> &nbsp;&nbsp;  Global Affairs &nbsp;&nbsp; Posted on January 1, 2017 at 12:00 PM </p>
					<p><h5>In August, dozens of scientists from across the United States descended on the small island nation of 
					                     São Tomé and Príncipe. Nestled on the equator off the coast of western central Africa, São Tomé was an ideal location to 
										 study the phenomenon we had all gathered to 
							
						</p></h5>
					
							<p><a href="/update_blog" class="button1" role="Approve">Update</a>
<a href="your_blogs" class="button2" role="Approve">delete</a></p>

					
			
              

        </div>

        <!-- Sidebar Widgets Column -->
        <div class="col-md-4">

       <p><a href="BloggingApplication/create_blog" class="button" role="Approve">Create Blog</a></p>

          

      </div>
   

    </div>
   
</div>
    
  </body>

</html>
