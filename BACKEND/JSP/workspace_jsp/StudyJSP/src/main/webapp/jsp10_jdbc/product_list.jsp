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
	<h1>상품 목록</h1>
	<table border="1">
		<tr>
			<th>상품번호</th>
			<th>상품명</th>
			<th>가격(원)</th>
			<th>수량(개)</th>
			<th>상세정보</th>
		</tr>
		<c:choose>
			<%-- request 객체에 productList 속성값이 "비어있을 경우" 판별(2가지 경우의 수) --%>
			<c:when test="${empty productList}">
				<tr><th colspan="5">상품 목록이 존재하지 않습니다.</th></tr>
			</c:when>
			<c:otherwise>
				<%-- <c:forEach>를 활용하여 상품 목록 출력 --%>
				<%-- 상세정보 버튼 클릭 시 "ProductDetail.pr" 서블릿 주소 요청 --%>
				<c:forEach var ="prod" items="${productList}">
					<tr>
					<td>${prod.product_id }</td>
					<td>${prod.product_name }</td>
					<td>${prod.product_price }</td>
					<td>${prod.product_qty }</td>
					<td>
					<input type="button" value="번호${prod.product_id } 상세정보" onclick="location.href = 'product_detail.pr?product_id=${prod.product_id}'"></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>












