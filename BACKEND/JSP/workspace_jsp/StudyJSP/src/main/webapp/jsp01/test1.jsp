<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! // 선언문 시작 클래스 내부라고 생각하면 쉽다 .
// JSP 선언문(Declaration)으로 JSP 파일 전체(= 전역)에서 접근 가능한 
// 멤버변수 및 메서드를 선언하는 곳입니다. 
// => 자바 클래스 내의 멤버레벨(클래스 내부, 메서드 외부) 위치와 동일하게 취급됨 
// => 실제로 JSP 파일이 컴파일되면 class 파일이 만들어지는데 이 클래스 내에 멤버레벨에 코드들이 위치함 
// ----------------------------------------------------------------------------------
// 1. 멤버변수(필드) 선언
String str1= "멤버변수입니다."; // 접근제한자 생략 시 default 접근제한자

// 2. 메서드 정의 => 접근제한자 리턴타입 메서드명([파라미터....]) {}
// 2-1) 리턴값이 없는 method1() 메서드 정의
public void method1() {
	System.out.println("선언문 내의 method1() 메서드 호출됨!");
}

// 2-2 ) String 타입의 리턴값이 있는 method2() 메서드 정의
public String method2() {
	return "method2() 메서드의 리턴값";
}
%> 

    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>test1.jsp</h1>
	<!-- 주석1 HTML 주석 (사용자에게 보임) -->
	<%-- 서버에 남기는 주석 메시지 JSP주석 (사용자들에게 안보임) --%>
	
	<%--
	
	[ 표현식 <%= %> ]
	- 선언문 또는 스크립틀릿 내에서 선언된 변수에 접근하여 값을 출력하거나
	  메서드 호출 후 리턴되는 값을 전달받아 출력하거나
	  연산에 대한 결과값을 출력하는 등 데이터 출력 용도로 사용
	- 자바의 System.out.print() 메서드와 동일한 문밥 구조 사용 (반드시 출력 데이터를 포함해야함)
	  => 단, System.out.print() 메서드는 이클립스 콘솔에 출력되지만,
	  	 표현식은 웹페이지(브라우저) 내에 출력하므로 JSP의 out.print() 메서드와 동일함
	--%>
	
	<h3>멤벼변수 str1 = <%=str1 %></h3>
	<%-- 위의 <%=str1 %> 부분은 톰캣(컨테이너) 자바코드로 변환 후 실행되어 해당 값이 클라이언트에 전달됨  --%>
	<%-- 따라서, 클라이언트에 전송되는 형태는 "<h3>멤버변수 str1 = 멤버변수입니다.</h3>" 형태이다! --%>
	<h3>리턴값이 있는 method2() 리턴값: <%=method2() %></h3>
	
	<%-- 리턴값이 없으므로 출력 데이터가 없는상태로 출력문에 전달되기 때문( HTTP 500 에러 발생!) --%>
<%-- 	<h3>리턴값이 없는 method1() 리턴값: <%=method1() %></h3> --%>
	
	
	
	
	
	<%--
	[ 스크립틀릿 <% %> ]
	- 자바의 기본적인 문장들을 그대로 표현 가능한 블럭
	- 스크립틀릿 내부는 자바의 메서드 내부와 동일한 위치로 취급됨 
	  (실제로 컴파일된 클래스의 메서드 내에 해당 코드들이 위치함) 
	  => 메서드 내에서 수행 가능한 작업들만 코드로 기술 가능 
	  	(로컬변수 선언, if문 등의 문장 사용, 인스턴스 생성 등...)
	  => 스크립틀릿 내에서 선언된 변수는 로컬 변수로 취급되며 접근제한자 지정이 불가능하고 ,
	  	 메서드를 정의할 수 없다! (= 메서드 내에서 메서드 정의 불가) 
	 --%>
	 
	 
<%-- 	 <h3>로컬변수 str3 = <%=str3 %></h3>  컴파일 에러 발생 --%>


	
	 <%
	 // 이 곳은 스크립틀릿 내부입니다.
	 // 변수 선언도 가능하며, 선언된 변수는 로컬변수로 취급됨
	 String str3 = "로컬변수입니다.";
	 // 다른 메서드를 호출하거나, 객체 생성 등의 다양한 작업 가능함
	 method1();
	 
	 for(int i=0;i<3;i++) {
		 System.out.println("str3 = " + str3);
	 }
	 
	 // 스크립틀릿 내에서 메서드 정의는 불가능 !
// 	 public void method3() {} // 컴파일 에러 발생! 

	System.out.println("이 문장은 이클립스 콘솔창에 출력됨!");
	System.out.println("str3 = " + str3);
	
	// 스크립틀릿 내에서 웹브라우저에 데이터 출력하려면 
	// JSP 에서 제공하는 내장객체 out 객체의 print() 또는 println() 메서드 사용 
	// => JSP의 표현식과 동일한 역할 수행 
// 	out.println("이 문장은 웹브라우저에 출력됨!");
// 	out.println("str3 = " + str3);
	// 주의! println() 메서드를 호출하더라도 줄바꿈 기능이 동작하지 않는다! 
	// => HTML 문서에서 줄바꿈은 <br> 또는 <p> 태그로 수행하여 , 엔터키는 공백 1개로 취급되기 때문
	// => 따라서 , <br> 태그를 문자열에 포함시켜서 줄바꿈을 직접 표현! 
	out.println("이 문장은 웹브라우저에 출력됨!<br>");
	out.println("str3 = " + str3);
	
	 %>
	 
	 <%--
	 스크립틀릿 외부라고 하더라도 실제 클래스 내에서는 선언문을 제외한 나머지는 
	 모두 하나의 메서드 내에 위치하므로 로컬 변수를 스크립틀릿 외부에서도 접근 가능하다! 
	  --%>
	 <h3>로컬변수 str3 = <%=str3 %></h3>
	 
	 <h3>멤버변수 str4 = <%= str4 %></h3>
	 
	 <%! String str4= "멤버변수 str4"; %>
	 
	 
	 
	 
	 
</body>
</html>