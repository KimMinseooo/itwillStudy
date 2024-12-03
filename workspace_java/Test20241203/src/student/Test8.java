package student;

public class Test8 {
	public static void main(String[] args) {
//		p487 예외클래스 : 자바로 만든 내장객체 (API)
//		오류 : 문법오류, 실행오류(시스템적 문제)
//		Int a = 10; //문법오류
//		Exception in thread "main" 
//		 java.lang.Error: Unresolved compilation problem: 
//		 Int cannot be resolved to a type

//		예외 : 예기치 못한 오류 발생(프로그램에서 제어가능)
//		Exception in thread "main"
//		java.lang.ArithmeticException: / by zero
		int a = 10;
		int b = 0;
//		System.out.println("프로그램 시작");
//		System.out.println(a / b); //0으로 나누면 예외발생
//		System.out.println("프로그램 끝");
		
//		예외처리 : 예외발생시 처리하는 구문이용해서 처리
//		System.out.println("프로그램 시작");
//		
		if(b !=0 ) {
			System.out.println(a / b); //예외발생
		} else {
			//예외발생 => 예외처리
			System.out.println("0으로 나눔");
		}
		System.out.println("프로그램 끝");

		System.out.println("프로그램 시작");
		Student student = null;
		if(student != null) {
			System.out.println(student.getName());
//			Exception in thread "main" 
//			java.lang.NullPointerException: 
//			Cannot invoke "student.Student.getName()" 
//			because "student" is null
		}else {
			System.out.println("null 예외발생");
		}
		System.out.println("프로그램 끝");

	}


}
