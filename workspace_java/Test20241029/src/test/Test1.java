package test;

public class Test1 {
	public static void main(String[] args) {
		
		// 자바의 연산자
//		연산자 : 연산에 사용하는 기호 + - * / % 
//		항 : 연산에 사용하는 값   3 + 4 
//		단항연산자
//		이항연산자, 삼항연산자
//		연산자 우선순위 : () 괄호 우선순위 높음
//		1. 산술연산자  + - * / % 
//		2. 대입연산자 =
//		3. 비교연산자 == != > >= < <=
//		4. 논리연산자 && || ! 
		
//		1. 산술연산자  : 사칙연산
		// int 형 변수( 지역변수 ) a ,b 선언후 초기화 
		int a = 200 ;
		int b= 3; 
		int c;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println(a + " + " + b + " = " + (c = a + b));
		System.out.println(a + " - " + b + " = " + (c = a - b));
		System.out.println(a + " * " + b + " = " + (c = a * b));
		System.out.println(a + " / " + b + " = " + (c = a / b));
		
		// 정수형 변수 수학 점수 저장  math 초기값 90 
		// 정수형 변수 영어 점수 저장  eng 초기값 70 
		// 정수형 변수 국어 점수 저장  kor 초기값 80 
		
		int math = 97;
		int eng = 75;
		int kor = 82;
		int total = math + eng + kor ; 
		float avg = total / 3.0f ; 
		
		System.out.println("총점 :  " + total + "점입니다.");
		System.out.println("평균 :  " + avg + "점입니다.");
		
		
		
		
		
		
	}
}
