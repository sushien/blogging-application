<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
			<c:out value="${blogs.blogId}" />
			<c:out value="${blogs.blogTitle}" />
			<a href="open_blogu?id=${blogs.blogId}">${blogs.blogTitle}</a>
			<c:out value="${blogs.category}" />
			<c:out value="${blogs.summary}" />
			<c:out value="${blogs.modifiedDate}" />
			<c:out value="${blogs.author}" />
			<br>
			<br>
		</c:forEach>

	</c:if>

	<form action="/BloggingApplication/send_title" method="post">
		<h1>search title</h1>
		<input type="text" name="title" />
		<button type="submit" value="send_title">GO</button>
		<h1>search by title!!</h1>${list}</form>

	<form action="/BloggingApplication/search_category" method="post">
		<h1>search category</h1>
		<input type="text" name="category" />
		<button type="submit" value="search_category">GO</button>
		<h1>search by category!!</h1>${list1}</form>

	<form action="/BloggingApplication/search_author" method="post">
		<h1>search author</h1>
		<input type="text" name="author" />
		<button type="submit" value="search_author">GO</button>
		<h1>search by author!!</h1>${list2}</form>
	<a href="open_blogu">open a blog</a>

</body>
</html>