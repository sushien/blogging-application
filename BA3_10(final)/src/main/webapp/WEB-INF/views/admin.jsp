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


	<h1>blogs for approval</h1>

	<c:forEach items="${list4}" var="open_bloga1">
		<c:out value="${open_bloga1.blogTitle}" />
		<c:out value="${open_bloga1.summary}" />
		<c:out value="${open_bloga1.description}" />
		<c:out value="${open_bloga1.modifiedDate}" />
		<c:out value="${open_bloga1.author}" />
		<a href="approved?id=${open_bloga1.blogId}">approve</a>
		<a href="rejected?id=${open_bloga1.blogId}">reject</a>
	</c:forEach>
<a href="logout1">logout</a>


</body>
</html>