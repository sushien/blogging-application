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
	<a href="logout">logout</a>
	<a href="home">home</a>
</body>
</html>