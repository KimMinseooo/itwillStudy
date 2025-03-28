<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/resources/css/default.css" rel="stylesheet" type="text/css">
<style type="text/css">
	#chatArea {
		width:400px;
		height : 300px;
		border: 1px solid black;
		/* 지정한 영역 크기보다 컨텐츠 양이 많아지면 스크롤바 추가  */
		overflow :auto;
		margin: auto;
	}
	
	#commandArea {
		width:400px;
		height :300px;
		margin: auto;
	 }
	 
	 #chatMessage {
	 	width: 300px;
	 }
	 #btnSend {
	 	width :80px;
	 }
</style>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/views/inc/top.jsp" />
	</header>
	
	<article>
		<h1>통합 채팅방 메인페이지</h1>
		<div id="chatArea">
			<!-- 채팅 메세지 표시 영역 -->
			<span id="chatMessageArea"></span>
		</div>
		<div id="commandArea">
			<input type="text" id="chatMessage">
			<input type="button" value="전송" id="btnSend">
		</div> 
	</article>
	
	<footer>
		<jsp:include page="/WEB-INF/views/inc/bottom.jsp" />	
	</footer>
	<script src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/chat.js"></script>
</body>
</html>