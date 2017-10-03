<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
				<td><input type="text" name="blogtitle" /></td>
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









	<%-- <a href="approve_req">approve request</a>
<h1>create blog successfully!!</h1>${mds} --%>
</body>
</html>