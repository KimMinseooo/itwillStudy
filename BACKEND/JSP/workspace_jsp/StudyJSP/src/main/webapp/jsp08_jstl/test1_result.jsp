

<%@page import="jsp08_jstl.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>test1_result.jsp</h1>
	<%-- 기존 자바 코드를 활용하여 name, age, email 변수에 저장 후 출력 --%>
	<% 
	String name =request.getParameter("name");
	String age =request.getParameter("age");
	String email = request.getParameter("email");
	String score = request.getParameter("score");
	%>
	
	<h3>이름: <%=name %></h3>
	<h3>나이: <%=age %></h3>
	<h3>이메일: <%=email %></h3>
	<h3>점수: <%=score %></h3>
	
	<%
	String testValue = (String)session.getAttribute("testValue");
	
	Person p = (Person)session.getAttribute("person");
	int pIdx = p.getIdx();
	String pName = p.getName();
	
	%>
	
	<h3>testValue : <%= testValue %></h3>
	<h3>Person 객체의 idx: <%= pIdx %></h3>
	<h3>Person 객체의 name : <%= pName %></h3>
	<hr>
	<%-- ======================================================== --%>
	<%-- EL 사용하여 request객체의 파라미터 처리(EL의 내장객체 param활용) --%>
	<%-- 기본문법: ${param.파라미터명} --%>
	
	<h3>
		이름: ${param.name}<br>    	<!-- request.getParameter("name") 을 대체  -->
		나이: ${param.age}<br>	  	<!-- request.getParameter("age") 을 대체  -->
		이메일: ${param.email}<br>	<!-- request.getParameter("email") 을 대체  -->
		점수: ${param.score}<br>
	
	<%-- EL 사용하여 세션 객체의 속성 처리(EL의 내장 객체 sessionScope 활용) --%>
	세션값 testValue : ${sessionScope.testValue} <br>
	<%-- session.getAttribute("testValue")를 대체  --%>
	세션값 testValue2 : ${sessionScope.testValue2} <br>

	<%-- 영역 객체명을 생략하더라도 속성에 접근 가능 (단, 범위가 좁은 영역부터 탐색--%>
	<%-- 영역 범위 : <좁음> page -> request -> session -> application <넓음> --%>
	세션값 testValue: ${testValue} <br>
	
	<% request.setAttribute("testValue", "request꺼!!"); %>
	세션값 testValue: ${testValue} <br>
	
	<br>
		<%-- 세션 객체에 저장된 속성값이 객체일 경우, 해당 객체를 통해 멤버변수에 바로 접근 가능 --%>
		<%-- 기본 문법: ${sessionScope.속성명.멤버변수명} --%>
		<%-- 주의! 멤버변수명을 지정하는 것처럼 보이지만, 내부적으로 Getter 메서드 호출! --%>
		person 객체의 멤버변수 idx값: ${sessionScope.person.idx}<br>
		person 객체의 멤버변수 name값: ${sessionScope.person.name}<br>
		<%-- EL 의 연산자 --%>
		${10 + 20} = ${10 + 20}<br> <%-- 30 = 30 출력 --%>
		\${10 + 20} = ${10 + 20}<br> <%-- ${10 + 20} = 30 출력 --%>
	
		<%-- 관계(비교) 연산자는 기호 또는 기호에 대응하는 이름을 연산자로 사용 --%>
		\${10 >= 20 } = ${10 >= 20}<br> 
		\${10 ge 20} = ${10 ge 20 }<br>
		
		\${10 < 20} = ${10 < 20 }<br>
		\${10 lt 20} = ${10 lt 20 }<br>
		
		\${10 == 20} = ${10 == 20 }<br>
		\${10 eq 20} = ${10 eq 20 }<br>
		
		\${10 != 20} = ${10 != 20 }<br>
		<%-- ne 연산자는 != (같지않다)와 동일함 (단, JSP 파일에서 오류로 표기됨, 실행은 됨)--%>
		<%-- \${10 ne 20} = ${10 ne 20 }<br> --%>
		
		<%-- 
		empty 연산자 (not empty) 사용 시 null 값, 널스트링 값, 배열 또는 컬렉션 사이즈 0 등 
		특정 대상의 "값이 비어있음"을 통합 판별 가능
		이때, empty 연산자는 단항 연산자 이므로 피연산자의 앞에 기술 
		--%>
		\${empty param.name} = ${empty param.name }<br>
		\${not empty param.name} = ${not empty param.name }<br> 
		
		<%-- 논리연산자 활용 --%>
		\${empty param.name and empty param.email} = ${empty param.name and empty param.email }<br>
		\${empty param.name or empty param.email} = ${empty param.name or empty param.email }<br>
	</h3>

	<hr>
	<h3>
	
	</h3>




</body>
</html>