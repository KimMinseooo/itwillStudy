<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div align="right">
	<h4>
		<a href="sessionTest3_main.jsp">HOME</a>
		
		<%-- 
			로그인 성공/실패 에 따른 작업 수행(= 서로 다른 하이퍼링크 표시) 
			=> 미 로그인 시 세션에 로그인 아이디(sId)가 없으므로 (=null)
				[로그인] & [회원가입]
			=> 로그인 시 세션에 로그인 한 아이디가 존재하므로 (sId 속성값이 null이 아님)
			   현재 로그인 한 세션에 저장된 아이디와 [로그아웃] 링크 표시 
		 --%>
		<%
			String id = (String)session.getAttribute("sId");
			if(id==null) {	// 미 로그인 시 
		%>
			<a href="sessionTest3_Login_form.jsp">로그인</a>
			<a href="sessionTest3_join_form.jsp">회원가입</a>
		<%
			} else {
		%>	
				<a href=""><%= id %>님 안녕하세요</a>
<!-- 				<a href="sessionTest3_Logout.jsp">로그아웃</a> -->
				
				<%--
				만약, 하이퍼링크 클릭 시 자바스크립트 함수를 통해 작업을 수행해야할 경우
				href 속성값으로 "javascript:함수명()" 형태로 자바스크립트 호출 가능
				또는, href 속성값을 "javascript:void(0)"로 설정하고 onclick 속성으로 함수 호출도 가능
				 --%>
				 <!-- <a href="javascript:logout()">로그아웃</a> -->
				 <a href="javascript:void(0)" onclick="logout()">로그아웃</a>
		<%
			}
		%>
	</h4>
</div>
<script>
	function logout() {
		if(confirm("로그아웃하시겠습니까?")) {
			location.href = "sessionTest3_Logout.jsp";
		}
	}
</script>








