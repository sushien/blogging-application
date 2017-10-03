<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="login_blog">login</a>
  <a href="register_blog">register</a>
  
  <a href="blogs">view Blogs</a>
  <c:if test="${!empty list3}">
  <c:forEach items="${list3}" var="blogs">
   <c:out value="${blogs.blogId}"/>
    <c:out value="${blogs.blogTitle}"/>
    <a href="open_blogu?id=${blogs.blogId}">${blogs.blogTitle}</a>
    <c:out value="${blogs.category}"/>
    <c:out value="${blogs.summary}"/>
    <c:out value="${blogs.modifiedDate}"/>
     <c:out value="${blogs.author}"/>
    <br>
    <br>
  </c:forEach>
    
  </c:if>

  <form action="/BloggingApplication/send_title" method="post">
   <h1>search title</h1>
   <input type="text" name="title"/>
  <button type="submit" value="send_title">GO</button>
     <h1>search by title!!</h1>${list}</form>
     
      <form action="/BloggingApplication/search_category" method="post">
      <h1>search category</h1>
   <input type="text" name="category"/>
  <button type="submit" value="search_category">GO</button>
     <h1>search by category!!</h1>${list1}</form>
   <!--  <a href="search_category">search category</a> -->
   
   <form action="/BloggingApplication/search_author" method="post">
      <h1>search author</h1>
   <input type="text" name="author"/>
  <button type="submit" value="search_author">GO</button>
    <h1>search by author!!</h1>${list2}</form>
    <!--  <a href="search_author">search author</a> -->
      <h1>Blogs here</h1>${list3}</form>
    
   
    
  
  
    
    
      <!-- <a href="view_blog">view</a> -->
      
      
      
      
      <a href="open_blogu">open a blog</a>
     
      <h1>register successfull!!</h1>${mdt2}
     
        <h1>search by category!!</h1>${mdt4}
         <h1>search by author!!</h1>${mdt5}
         <h1>blogs will be viewed here!!</h1>${mdt6}
     
</body>
</html> --%>
<html>

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Blog Post</title>
    <!-- Custom fonts for this template -->
  
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

    



  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/vendor/bootstrap/css/bootstrap.min.css"></link>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/clean-blog.min.css" ></link>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/font-awesome.min.css" ></link>

    <!-- Bootstrap core CSS -->

    <!-- Custom styles for this template -->
<!--     <link href="css/blog-post.css" rel="stylesheet">
    <link href="css/home.css" rel="stylesheet"> -->
 <%--     <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/blog-post.css"></link>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/home.css" ></link> --%>
 
 
 

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
		 
    

	<!-- <!-- Custom styles for Search template -->
<!-- 	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  -->
  

 
  </head>

  <body>

    <!-- Navigation -->
   <nav class="navbar navbar-expand-lg navbar-dark bg-dark navbar-fixed-top" >
      <div class="container">
        <a class="navbar-brand" href="home">Blog Space</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto" style="float:center;">
          <form action="/BloggingApplication/send_title" method="post">
  				   <input type="text" name="title"/>
  					<button type="submit" value="send_title">search</button>
          </ul>
          </div>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto" style="float:right;">
        
            	
  		
            <li class="nav-item active">
              <a class="nav-link" href="login_blog">SignIn</a>
            </li>
          <li class="nav-item active">
              <a class="nav-link" href="register_blog">SignUp</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
<br/><br><br>
<!-- *88888888888888888888888888888888 -->
  
  <%-- 
   <div>
 	  <c:if test="${!empty list}">
  			<c:forEach items="${list}" var="blogs">
  					<div><h2> <a href="open_blogu?id="request.getparameter{blogs.blogId}>
  							<c:out value="${blogs.blogTitle}"/></h2></a></div>
							<div><b>By: </b><c:out value="${blogs.author}"/>
  							 <b> </b><c:out value="${blogs.category}"/>
  							 <b></b><c:out value="${blogs.modifiedDate}"/></div>
  							<div><p><b>Summary: </b> <c:out value="${blogs.summary}"/></p></div>
    						  
    						  
   							 	<br><br>
			</c:forEach> --%>
			
			<div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <div class="post-preview">
            
            	<c:if test="${!empty list}">
  					<c:forEach items="${list}" var="blogs">
  					 <h2><p><a href="open_blogu?id="request.getparameter{blogs.blogId}>
  						<c:out value="${blogs.blogTitle}"/></h2></a></p>
						<P>by : <b><c:out value="${blogs.author}"/></b></P>
 						<i><c:out value="${blogs.category}"/></i> 
 						 <c:out value="${blogs.modifiedDate}"/>
  						<p align="justify"><h5><i><c:out value="${blogs.summary}"/></i></h5></p>
  						
    					<br><hr>
    					
				</c:forEach>
   				</c:if>
   			</div>
		</div>
		</div>
		
	<div>
<h2>To view Blog Click the button :-</h2>
<form action="/BloggingApplication/send_title" method="post">	   
  	<button type="submit" value=""><h3>View Blog</h3></button>
		
	 <c:if test="${!empty list3}">
  <c:forEach items="${list3}" var="blogs">
   <c:out value="${blogs.blogId}"/>
    <c:out value="${blogs.blogTitle}"/>
    <a href="open_blogu?id="${blogs.blogId}>${blogs.blogTitle}</a>
    <c:out value="${blogs.category}"/>
    <c:out value="${blogs.summary}"/>
    <c:out value="${blogs.modifiedDate}"/>
     <c:out value="${blogs.author}"/>
    <br>
    <br>
  </c:forEach>
    
   </c:if> 
		
		
		</div>
   </div>
   </br>
   </br>
  
   </form>
    </body>
   </html>
    <!--  <select name="select" >
     <option >By Title</option>
     <option >By Category</option>
     <option >By Author</option>
     <input type="text" name="input">
     <button type="submit" value="search_author">Search</button>
     </select> -->
     
     <%--  <form action="/BloggingApplication/search_author" method="post">
      <h1>search author</h1>
   <input type="text" name="author"/>
  <button type="submit" value="search_author">GO</button>
  
  
	  <div>
	  <c:if test="${!empty list2}">
  			<c:forEach items="${list2}" var="b">
  					<div><h2> <a href="open_blogu?id="request.getparameter{blogs.blogId}>
  							<c:out value="${b.blogTitle}"/></h2></a></div>
							<div><b>Author: </b><c:out value="${b.author}"/>
  							 <b>Category: </b><c:out value="${b.category}"/>
  							 <b>Modified Date:</b><c:out value="${b.modifiedDate}"/></div>
  							<div><p><b>Summary: </b> <c:out value="${b.summary}"/></p></div>
    					
   							 	<br><br>
			</c:forEach>
			</c:if>
   		 </div>
	 </form> --%>
     
     
      <%-- <form action="/BloggingApplication/search_category" method="post">
      <h1>search category</h1>
   <input type="text" name="category"/>
  <button type="submit" value="search_category">GO</button>
    
    
    
    <div>
 	  <c:if test="${!empty list1}">
  			<c:forEach items="${list1}" var="blogs">
  					<div><h2> <a href="open_blogu?id="request.getparameter{blogs.blogId}>
  							<c:out value="${blogs.blogTitle}"/></h2></a></div>
							<div><b>Author: </b><c:out value="${blogs.author}"/>
  							 <b>Category: </b><c:out value="${blogs.category}"/>
  							 <b>Modified Date:</b><c:out value="${blogs.modifiedDate}"/></div>
  							<div><p><b>Summary: </b> <c:out value="${blogs.summary}"/></p></div>
    						  
    						  
   							 	<br><br>
			</c:forEach>
   
	</c:if>
   </div>
    </form>
     --%>
   <!--  <a href="search_category">search category</a> -->
   





<!-- *88888888888888888888888888888888 -->





	<%-- <c:if test="${!empty list3}">
  <c:forEach items="${list3}" var="blogs">
   <c:out value="${blogs.blogId}"/>
    <c:out value="${blogs.blogTitle}"/>
    <a href="open_blogu?id="${blogs.blogId}>${blogs.blogTitle}</a>
    <c:out value="${blogs.category}"/>
    <c:out value="${blogs.summary}"/>
    <c:out value="${blogs.modifiedDate}"/>
     <c:out value="${blogs.author}"/>
    <br>
    <br>
  </c:forEach>
    
   </c:if> --%>
<%--<div class="container" >


      <div class="row" >

        <!-- Post Content Column -->
        <div class="col-lg-8">

          <!-- Title -->
	<div>  <c:if test="${!empty list3}">
  <c:forEach items="${list3}" var="blogs">
   <h2><p><a href="open_blogu?id="blogId >	
   <c:out value="${blogs.blogTitle}"/>
   </a></p>
<div>  <c:out value="${blogs.category}"/>
    <c:out value="${blogs.summary}"/>
    <c:out value="${blogs.modifiedDate}"/>
    </div>  
  <c:out value="${blogs.description}"/>
    <br>
    <br>
  </c:forEach>
    
  </c:if>
   --%>
  <%-- <c:if test="${!empty list3}">
  <c:forEach items="${list3}" var="blogs">
   <c:out value="${blogs.blogId}"/>
    <c:out value="${blogs.blogTitle}"/>
    <a href="open_blogu?id=${blogs.blogId}">${blogs.blogTitle}</a>
    <c:out value="${blogs.category}"/>
    <c:out value="${blogs.summary}"/>
    <c:out value="${blogs.modifiedDate}"/>
     <c:out value="${blogs.author}"/>
    <br>
    <br>
  </c:forEach>
    
  </c:if> --%>
 
  

  </body>

</html>
