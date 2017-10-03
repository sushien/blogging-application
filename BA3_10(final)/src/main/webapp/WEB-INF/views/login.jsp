<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="home">home</a>

<a href="sign_up">sign up</a> 

<form action="/BloggingApplication/sign_in" method="POST">
<h1>Enter your login details</h1>
	   		<table>
			    <tr>
			        <td>User username:</td>
			        <td><input type="text" name="username" value="email" /></td>
			    </tr>
			    <tr>
			        <td>User Password:</td>
			        <td><input type="password" name="password" value="password"/></td>
			    </tr>

				<tr>
			      <button type="submit" value="signin">signin</button>
		      </tr>
			</table> 
		</form>

</body>
</html>