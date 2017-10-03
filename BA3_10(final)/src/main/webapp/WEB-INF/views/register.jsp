<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter your details</h1>
	<a href="home">home</a>
	<a href="go_to_login">sign in</a>
	<form action="/BloggingApplication/go_to_home1" method="POST">
		<h1>Enter your login details</h1>
		<table>
			<tr>
				<td>User username:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Email id:</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>User Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>

			<tr>
				<button type="submit" value="go_to_home1">signup</button>
			</tr>
		</table>
	</form>

	</form>
</body>
</html>