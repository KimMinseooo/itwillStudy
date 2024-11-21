<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request3_pro.jsp</h1>
	<h3>로그인 처리</h3>
	<%-- 폼 파라미터(아이디,패스워드 ,아이디 기억)값 가져와서 변수에 저장 및 출력하기 --%>
	<%
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String rememberId = request.getParameter("rememberId");
	%>
	<h3>아이디: <%= id %></h3> 
	<h3>패스워드: <%= passwd %></h3>
	<h3>아이디 기억: <%= rememberId %></h3>
	
	<%
	/*
	[ 자바 코드를 사용하여 아이디와 패스워드를 판별하여 로그인 성공 여부 판별 ]
	- 데이터베이스에 지정된 아이디를 "admin", 패스워드를 "1234" 라고 가정하고 변수에 미리 저장
	- 폼을 통해 입력받은 아이디와 패스워드를 각각 데이터베이스의 데이터와 비교하여
	둘 다 일치할 경우 "로그인 성공!", 아니면 "로그인 실패" 출력 
	
	*/
	String dbId = "admin";  
	String dbPasswd = "1234";
	
	// 문자열 비교는 무조건 equals()
	if(id.equals(dbId) && passwd.equals(dbPasswd)) {
		out.print("<h2>로그인 성공!</h2>");
	} else {
// 		out.print("<h2>로그인 실패!</h2>");
		// --------------------------------------
		// 자바스크립트를 활용하여 "로그인 실패!" 알림창 출력 후 이전 페이지 돌아가기 처리 
// 		out.print("<script>");
// 		out.print("alert('로그인 실패!');");
// 		out.print("history.back()");
// 		out.print("</script>");
	}
	%>
	<script type="text/javascript">
		alert('로그인 실패!');
		history.back();
	</script>
	
	
	
	
	
	
	
	
</body>
</html>