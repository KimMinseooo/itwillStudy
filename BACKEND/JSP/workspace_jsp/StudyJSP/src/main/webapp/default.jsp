<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index.jsp</h1>
	
	<form action="myServlet1" method="get">
		<input type="submit" value="GET 방식">
	</form>
	
	<form action="myServlet1" method="POST">
		<input type="submit" value="POST 방식">
	</form>
	<hr>
	
	<%-- Servlet 연습 --%>
	<form action="myServlet2" method="get">
		<input type="submit" value="GET 방식">
	</form>
	
	<form action="myServlet2" method="POST">
		<input type="submit" value="POST 방식">
	</form>
	<hr>
</body>
</html>