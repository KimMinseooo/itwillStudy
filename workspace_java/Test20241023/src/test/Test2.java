package test;

public class Test2 {

	public static void main(String[] args) {
		// 한줄 삭제 => ctrl + D

		// 10 , 20 => 소수점 없는 숫자 => 정수형 -> 리터럴
		// 프로그램에서 사용하는 모든 숫자 , 문자 , 논리값

		System.out.println(10 + 20);

		System.out.println(10 - 20);

		System.out.println(10 * 20);

		// 정수형 / 정수형 => 정수형 , 결과값 0
		System.out.println(10 / 20);

		// 숫자가 변해서 적용했으면 좋겠다 --> 요구
//		변수 : 값이 변하는 수
//		=> 기억장소에 이름을 부여하고 형을 지정하고 값을 저장
//		=> 변수를 정의(선언)하고 값을 저장(할당)

//		=> = 오른쪽의 값이나 식을 계산해서 결과값을 왼쪽에 있는 기억장소 변수에 저장
		int a = 10;
//		=> 기억장소에 이름(b)을 부여하고 형(정수형)을 지정하고 값(20)을 저장
		int b = 20 ;
		System.out.println("a = " + a);  	// 문자열 +(연결자) 숫자,변수 
		System.out.println(a);
		System.out.println(b);
		System.out.println("b = " + b );
		
		// 변수 선언 후 => 기억장소 재사용(기억장소에 다른값을 저장) 
		a= 100;
		System.out.println("a = "+ a);
		b= 200;
		System.out.println("b = "+ b);
		
		
		// 변하는 수를 이용해서 => 더하기 빼기 곱하기 나누기 명령 => 출력 
		
		int c = 2024;
		int d = 10;
		
		System.out.println("c + d = " + (c + d));
		
		System.out.println("c - d = " + (c - d));
		
		System.out.println("c * d = " + (c * d));
		
		System.out.println("c / d = " + (c / d));
		
		// 나이 : 20 출력 
		// 20 => 변하는 수로 정의 초기값 20 저장, 기억장소 이름 age , 정수형 지정
		// 변수 선언하고 초기값 할당 
		int age = 20 ; 
		System.out.println("나이 : " + age + "세");
		
		age = 30 ;
		System.out.println("나이 : " + age + "세");
		
//		< 변수 이름 정하기 => 규칙적용 > 
//		1. 영문자(대문자,소문자) , 숫자 , 특수문자($, _) 사용
//		 예) Abc, count100 , $won , _level1
		
//		2. 시작문자 중에 숫자 사용 할 수 없음 
//		예) 1a(사용못함)  , $won(사용가능)
		
//		3. 자바 문법에서 사용중인 예약어는 사용 할 수 없음 
//		예) class , for  , if  , int , while ....
		
//		4. $ _ 제외 => 다른 특수 문자 사용 못함 
//		5. 한글 사용 가능 (되도록 영문자 사용 ) 
//		6. 길이 제한 없음 
		
		
		
		// 변수 정의해서 12 값을 저장 

		int number = 12; 
		System.out.println("바구니에 저장된 사과는 " + number +"개 입니다");
		
		
		
		
	}

}
