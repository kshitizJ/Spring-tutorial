<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
	int id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	<h1>This is homepage</h1>
	<h1>
		Name
		<%=name%></h1>
	<h5>
		id =
		<%=id%></h5>

	Friends =
	<%
		for (String s : friends) {
	%>
	<h5><%=s%></h5>
	<%
		}
	%>

	<h2>Url /home</h2>
</body>
</html>