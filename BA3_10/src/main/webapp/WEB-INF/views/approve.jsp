<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>blog approved</h1>
<a href="home1">home</a>
<a href="admin1">main page</a>
<a href="view_approve">view blogs</a>

<c:if test="${!empty arr1}">
  <c:forEach items="${arr1}" var="view_approve">
    <c:out value="${view_approve.blogTitle}"/>
    <a href="open_bloga1?id=${view_approve.blogId}">${view_approve.blogTitle}</a>
    <c:out value="${view_approve.summary}"/>
    <br>
    <br>
  </c:forEach>
    
  </c:if> 


<a href="logout1">logout</a>
</body>
</html>