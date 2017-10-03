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

    <title>Clean Blog - Start Bootstrap Theme</title>

    <!-- Bootstrap core CSS -->
    

    <!-- Custom fonts for this template -->
  
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

    



  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/vendor/bootstrap/css/bootstrap.min.css"></link>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/clean-blog.min.css" ></link>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/font-awesome.min.css" ></link>
 
 

<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
		 -->
    

	<!-- Custom styles for Search template -->
  
  </head>

  <body>


    <!-- Page Header -->
    <header class="masthead" style="background-image: url('./resources/img/home-bg.jpg')">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <div class="site-heading">
              <h1>Blog Space</h1>
              <span class="subheading"><i>Express your meaning of LIFE</i></span>
            </div>
          </div>
        </div>
        <div class="clearfix">
            <a class="btn btn-secondary float-right" href="home">Get Started &rarr;</a>
          </div>
      </div>
    </header>
   
    <!-- 	 <footer>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <p class="copyright text-muted"><b>Copyright &copy; Blog Space 2017</b></p>
          </div>
        </div>
      </div>
    </footer>  -->
<%-- 
    <!-- Main Content -->
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <div class="post-preview">
            <a href="post.html">
            	<c:if test="${!empty list3}">
  					<c:forEach items="${list3}" var="blogs">
  					 <h2><p><a href="open_blogu?id="request.getparameter{blogs.blogId}>
  						<c:out value="${blogs.blogTitle}"/></h2></a></p>
						<P>by: <b><c:out value="${blogs.author}"/></b>&nbps;&nbps;
 						<c:out value="${blogs.category}"/>
 						 <c:out value="${blogs.modifiedDate}"/>
  						<p align="justify"><h5><i><c:out value="${blogs.summary}"/></i></p></h5>
    					<br><br>
				</c:forEach>
   				</c:if>
   				
                     Political Science Now - American Political Science Association </a></p> </h2>
					 <!-- Date/Time -->
          <p>by <b>Charles Tailor</b> &nbsp;&nbsp;  Political Science &nbsp;&nbsp; Posted on March 1, 2016 at 1:00 AM </p>
					 <p align="justify"><h5><i>A site from the American Political Science Association covering people, research and 
					 news in political science. APSA supports political scientists from all fields of inquiry, regions, and 
					 occupational endeavors within and outside academe in order to expand awareness and understanding of politics.</i></p></h5>
					 
			  
              <br>
			  <hr>	 
           <h2><p><a href="homepage-final\blog1.html" >	
                    Quantum quartet is on the cards</a></p> </h2>
					<p>by <b>Rohan Vadera</b> &nbsp;&nbsp;   Science-Physics &nbsp;&nbsp; Posted on January 1, 2017 at 12:00 PM </p>
					<p align="justify"><h5><i>Theoretical physicist and blogger Sabine Hossenfelder has created a lovely set
					of cards featuring pioneering quantum physicists. You can see my two favourites above.
						Resembling football or baseball cards, they each feature a portrait plus a fact or two about the physicist</i>
						</p></h5>
			
         <hr>
          <h2><p><a href="homepage-final\blog1.html" >	
                   Up in smoke (and clouds) over the southeast Atlantic</a></p> </h2>
					<p>by <b>Michael Diamond</b> &nbsp;&nbsp;  Global Affairs &nbsp;&nbsp; Posted on November 12, 2016 at 7:00 PM </p>
					<p align="justify"><h5><i>In August, dozens of scientists from across the United States descended on the small island nation of 
					                     São Tomé and Príncipe. Nestled on the equator off the coast of western central Africa, São Tomé was an ideal location to 
										 study the phenomenon we had all gathered to </i>
							
						</p></h5>
					<br><br>
          <!-- Pager -->
          <div class="clearfix">
            <a class="btn btn-secondary float-right" href="homepage-final\home.html">Get Started &rarr;</a>
          </div>
        </div>
      </div>
    </div>

    <hr>

    <!-- Footer -->
    <footer>
      <div class="container">
        <div class="row">
          <div class="col-lg-8 col-md-10 mx-auto">
            <ul class="list-inline text-center">
              <li class="list-inline-item">
                <a href="#">
                  
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  
                </a>
              </li>
            </ul>
            <p class="copyright text-muted">Copyright &copy; Blog Space 2017</p>
          </div>
        </div>
      </div>
    </footer> --%>

  

  </body>

</html>
