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
	<a href="logout">logout</a>
	<c:if test="${!empty list3}">
		<c:forEach items="${list3}" var="view_blog1">
			<c:out value="${view_blog1.blogId}" />
			<c:out value="${view_blog1.blogTitle}" />
			<a href="open_blogu1?id=${view_blog1.blogId}">${view_blog1.blogTitle}</a>
			<c:out value="${view_blog1.category}" />
			<c:out value="${view_blog1.summary}" />
			<c:out value="${view_blog1.modifiedDate}" />
			<c:out value="${view_blog1.author}" />
			<br>
			<br>
		</c:forEach>

	</c:if>
	<a href="view_blog1">view</a>
	<a href="open_blogu1">open a blog</a>
	<a href="your_blog">my blogs</a>

	<form action="/BloggingApplication/search_title1" method="post">
		<h1>search title</h1>
		<input type="text" name="title" />
		<button type="submit" value="search_title1">GO</button>
		<h1>search by title!!</h1>${list}</form>

	<form action="/BloggingApplication/search_category1" method="post">
		<h1>search category</h1>
		<input type="text" name="category" />
		<button type="submit" value="search_category1">GO</button>
		<h1>search by category!!</h1>${list1}</form>
	<!--  <a href="search_category">search category</a> -->

	<form action="/BloggingApplication/search_author1" method="post">
		<h1>search author</h1>
		<input type="text" name="author" />
		<button type="submit" value="search_author1">GO</button>
		<h1>search by author!!</h1>${list2}</form>
</body>
</html>