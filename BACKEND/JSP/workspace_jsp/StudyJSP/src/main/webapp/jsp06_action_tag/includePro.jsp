<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>includePro.jsp</h1>
<h3>jsp:include 액션태그에 의해 포함되는 페이지 </h3>
<%
	String name = request.getParameter("name");

%>
<h3>전달받은 name 파라미터 값: <%=name %></h3>