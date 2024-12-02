<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생 정보</h1>
	<%-- StudentDTO 객체 복수개를 관리하는 List 객체를 request 객체에 저장했을 경우 --%>
	<%-- 1) request 객체에 저장된 studentList 객체의 각 StudentDTO 객체에 접근 시  --%>
	<%--    기본적으로 List 객체는 배열과 동일한 인덱스 접근 방법 사용 ${객체명[인덱스].xxx } --%>
	
	<%-- List<StudentDTO studentList = [1번사람, 2번사람, 3번사람 ]; --%>
	<c:forEach var="stu" items="${requestScope.studentList}">
	<h3> 학생 번호 : ${ stu.idx} , 학생 이름 : ${ stu.name}<br> </h3>
	<hr>
	</c:forEach>
</body>
</html>