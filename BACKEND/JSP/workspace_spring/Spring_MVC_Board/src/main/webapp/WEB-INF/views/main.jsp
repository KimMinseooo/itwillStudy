<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath }/resources/css/default.css" rel="stylesheet" type="text/css">
</head>
<body>

	<header>
		<jsp:include page="/WEB-INF/views/inc/top.jsp" />
	</header>

	<article>
		<h1>MVC 게시판</h1>
		<h3><a href="BoardWrite">글쓰기</a></h3>
		<h3><a href="BoardList">글목록</a></h3>
		<h3><a href="ChatMain">통합 채팅 게시판</a></h3>
	</article>
	
	<footer>
		<jsp:include page="/WEB-INF/views/inc/bottom.jsp" />	
	</footer>
		
	
</body>
</html>