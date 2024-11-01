package test;

public class Test7 {
	
	public static void main(String[] args) {
	
//			 literal (리터럴 , 데이터값 ) : 프로그램에서 사용하는 숫자값 , 문자값, 논리값 
//			 							10 , 3.4 ,  'A' , true/false
		
			char ch = 'A'; 
			int num = 10 ; 
			double d= 3.4; 
			
			//상수 : 변하지 않는 수 , 대문자 
			// 원면적 : 반지름 * 반지름 * 3.14
			
			int r = 10 ; 
			final double PI = 3.14159;		//값을 변경핤수 없게 final 자료형 앞에 선언 
			
			System.out.println(r);
			System.out.println(PI);
			System.out.println("원 면적 : "+ r*r*PI);
			r= 20;
			System.out.println("원 면적 : "+ r*r*PI);
			r= 30;
			System.out.println("원 면적 : "+ r*r*PI);
			r= 40;
			System.out.println("원 면적 : "+ r*r*PI);
			r= 50;
			System.out.println("원 면적 : "+ r*r*PI);
			r= 60;
			System.out.println("원 면적 : "+ r*r*PI);
			
			final int NUM ;
			NUM = 0 ; // 초기값은 수정 가능 
//			NUM = 10; // 중간값 수정 x --> 에러발생 
			
			//나이 MY_AGE 상수 선언 => 출력 
			
			final int MY_AGE = 30;
			
			System.out.println(MY_AGE);
			
	}
}
