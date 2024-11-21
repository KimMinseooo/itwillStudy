<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// JSP 내장객체 중 response 객체는 HTTP 응답 정보를 관리하는 객체이며 
	// response 객체의 sendRedirect() 메서드를 호출하여 
	// 메서드 파리미터로 전달된 페이지(URL)로 이동 가능
	// => 리다이렉트는 일반적인 페이지 이동과 개념이 조금 다르지만 일단 동하는 점에서 동일
	// => 기본문법 response.sendRedirect("이동할 URL 또는 파일명");
	
	
	response.sendRedirect("responseTest2.jsp");
	
	/* 
	클라이언트의 요청에 대해 서버가 응답하는 데이터에 리다이렉트가 포함될 경우
	응답 데이터에 HTTP 상태 코드로 "302"를 포함하여 전송한다!
	다만, response.sendRedirect() 메서드 호출 시점에 즉시 응답을 수행하는 것이 아니라 
	다른 데이터까지 모두 HTTP 응답메세지 형태로 포함시킨 후 전체를 응답으로 전송함
	*/
	
	System.out.print("리다이렉트 완료!");
%>    
    
    
    
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>