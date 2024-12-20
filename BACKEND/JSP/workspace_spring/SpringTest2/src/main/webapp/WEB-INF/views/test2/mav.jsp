<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/views/inc/top.jsp"></jsp:include>
	</header>
	
	
	<article>
		<h1>mav.jsp</h1>
		<h3>
			PersonVO 객체의 name : ${person.name}<br>
			PersonVO 객체의 age : ${person.age}<br>
			PersonVO 객체의 gender : ${person.gender}<br>
		</h3>
		<h3>
			TestVO 객체의 subject : ${test.subject}<br>
			TestVO 객체의 content : ${test.content}<br>
		</h3>
		
		
		<!-- ModelAndView mav = new ModelAndView("test2/mav","map",map) 방식으로 보냈을 경우 -->
<!-- 		<h3> -->
<%-- 			PersonVO 객체의 name : ${map.person.name}<br> --%>
<%-- 			PersonVO 객체의 age : ${map.person.age}<br> --%>
<%-- 			PersonVO 객체의 gender : ${map.person.gender}<br> --%>
<!-- 		</h3> -->
<!-- 		<h3> -->
<%-- 			TestVO 객체의 subject : ${map.test.subject}<br> --%>
<%-- 			TestVO 객체의 content : ${map.test.content}<br> --%>
<!-- 		</h3> -->
	</article>
	
	
	
	<footer>
		<jsp:include page="/WEB-INF/views/inc/bottom.jsp"></jsp:include>
	</footer>
</body>
</html>