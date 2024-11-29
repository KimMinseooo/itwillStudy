<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jdbc_main.jsp</h1>
	<h3><a href="connect1.jdbc">JDBC 연결 1단계</a></h3>
	<h3><a href="connect2.jdbc">JDBC 연결 2단계</a></h3>
	<hr>
	
	<h3>JDBC 연결 3, 4단계 -INSERT</h3>
	<form action="connect3_insert.jdbc" method="post">
		<input type="text" name="idx" placeholder="번호"><br>
		<input type="text" name="name" placeholder="이름"><br>
		<input type="submit" value="INSERT">
	</form>
	
	<h3>JDBC 연결 3, 4단계 -UPDATE</h3>
	<form action="connect3_update.jdbc" method="post">
		<input type="text" name="no" placeholder="수정할 학생 번호"><br>
<!-- 		<input type="text" name="idx" placeholder="번호"><br> -->
		<input type="text" name="name" placeholder="이름"><br>
		<input type="submit" value="UPDATE">
	</form>
	
	<h3>JDBC 연결 3, 4단계 -DELETE</h3>
	<form action="connect3_delete.jdbc" method="post">
		<input type="text" name="no" placeholder="삭제할 학생 번호"><br>
		<input type="submit" value="DELETE">
	</form>
	<hr>
	<h3>JDBC 연결 3, 4단계 -SELECT</h3>
	<form action="connect3_select.jdbc" method="get">
		<input type="text" name="idx" placeholder="검색할 학생 정보"><br>
		<input type="submit" value="SELETE">
	</form>
	
	<form action="connect3_select2.jdbc" method="get">
		<input type="text" name="idx" placeholder="검색할 학생 정보"><br>
		<input type="submit" value="SELETE2">
	</form>
</body>
</html>