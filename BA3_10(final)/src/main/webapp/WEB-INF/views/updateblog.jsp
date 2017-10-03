<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update blog</title>
</head>
<body>
	<a href="home2">home</a>
	<a href="logout1">logout</a>


	<form action="/BloggingApplication/approve_req1" method="GET">
		<h1>Enter your blog details</h1>
		<%-- <h2>${list7}</h2> --%>
		<c:if test="${!empty list7}">
			<c:forEach items="${list7}" var="update_blog1">

				<table>

					<tr>
						<td>Blog Title:</td>
						<td><input type="text" name="blogtitle"
							value="<c:out value='${update_blog1.blogTitle}'/>" /></td>
					</tr>
					<tr>
						<td>Blog summary</td>
						<td><input type="text" name="summary"
							value="<c:out value="${update_blog1.summary}" />" /></td>
					</tr>
					<tr>
						<td>Blog description</td>
						<td><input type="text" name="description"
							value="<c:out value="${update_blog1.description}" />" /></td>
					</tr>
					<tr>
						<td>Author</td>
						<td><input type="text" name="author"
							value="<c:out value="${update_blog1.author}" />" /></td>
					</tr>
					<tr>
						<td>Category</td>
						<td><input type="text" name="category"
							value="<c:out value="${update_blog1.summary}" />" /></td>
					</tr>
					<tr>
						<td>upload</td>
						<td><input type="file" name="browse" /></td>
					</tr>
					<input type=hidden " name="id" value="${update_blog1.blogId}">
					</tr>

					<tr>
						<button type="submit" value="approve_req1">send for
							approval</button>
					</tr>
				</table>
			</c:forEach>

		</c:if>
	</form>
</body>
</html>