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
<a href="home1">home</a>
<h1>blog here</h1>${list4}
<c:if test="${!empty list4}">
  <c:forEach items="${list4}" var="blogs">
   <c:out value="${blogs.blogId}"/>
    <c:out value="${blogs.blogTitle}"/>
    <c:out value="${blogs.category}"/>
    <c:out value="${blogs.summary}"/>
    <c:out value="${blogs.modifiedDate}"/>
     <c:out value="${blogs.author}"/>
     <input type="text" name="comment"  />
<a href="add_comment?id=${blogs.blogId}">add comment</a>
    <br>
    <br>
  </c:forEach>
  </c:if>

<a href="del_comment">delete comment</a>
<a href="view_comment">view comment</a>
<a href="add_rating">add rating</a>
<a href="logout3">logout</a>
</body>
</html>