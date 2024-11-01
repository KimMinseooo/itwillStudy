package test;

public class Test3 {

		public static void main(String[] args) { 
			
//			2. 비교 연산자  == != >= <= < > 
//			두 피연산자(항) 간의 대소 관계를 비교 => 결과 true/false 형태 
			
			int a= 10 ;
			int b= 5; 
			
			System.out.println("a == b => " + (a == b ));
			System.out.println("a != b => " +(a != b));
			System.out.println("a > b => " + (a > b) );
			System.out.println("a >= b => " + (a >= b));
			System.out.println("a < b => " +(a < b));
			System.out.println("a <= b => " +(a <= b) );

			boolean c = a ==b;
			System.out.println(c);
			
			char ch = 'A'; // 65 
			System.out.println(ch == 65);
			System.out.println(ch == 'A');
			System.out.println(3 == 3.0);
//			int == double 비교 => int 형이 double 자동변환 후 비교 
			System.out.println(0.1 == 0.1f);
//			double == float 연산 => float 가 double 변환
//			=> 근차시 표현 0.1f => 0.1000004456
//			서로 다른 값으로 인식되어서 false 
			System.out.println((float)0.1 == 0.1f);
			
		}
}
