<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<!-- isELIgnored is true by default which does not take the expression language -->
	<%-- <%
		String name = (String) request.getAttribute("name");
	LocalDateTime time = (LocalDateTime) request.getAttribute("date");
	%> --%>
	<h1>This is help page</h1>
	<%-- <p><%=name%></p>
	<p><%=time%></p> --%>
	<p>${name}</p>
	<p>${date}</p>
	<hr>
	<h1>Marks</h1>
	<c:forEach var="item" items="${marks}">
		<h3>${item }</h3>
	</c:forEach>
</body>
</html>