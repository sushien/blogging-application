<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Comments</title>
</head>
<body>
<form modelAttribute="comment" action="createComment" method="post">
<div>
<textarea name="comments" id="comments" style="font-family:sans-serif;font-size:1.2em;">

</textarea>
</div>
<input type="submit" value="Submit" onclick="createComment(comment)">
</form> 
</body>
</html>