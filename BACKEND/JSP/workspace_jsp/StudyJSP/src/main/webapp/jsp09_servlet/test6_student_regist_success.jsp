<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생 정보 등록 성공!</h1>
	<input type="button" value="홈으로" onclick="location.href='StudentMain.st'">
	<input type="button" value="학생목록조회" onclick="location.href='StudentList.st'"><br>
	${requestScope.id }
	${requestScope.name }
	
</body>
</html>