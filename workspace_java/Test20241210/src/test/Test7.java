package test;



public class Test7 {
	public static void main(String[] args) {
//		p351 Object클래스  : 자바의 내장객체(API)
//						  : 모든 클래스의 부모
//						  : java.lang 패키지(폴더) 기본폴더 (자동 스캔)
		
//		java.lang.Object 클래스
//		: 모든 클래스의 최상위 클래스
//		.toString() : 객체 문자열 표현 반환 (test.Test7@4361bd48)
//		.equals() : 기억장소(인스턴스) 동일 여부 반환
//		.getClass() : 클래스 정보
//		.hashCode() : 객체 해시 코드 반환(기억장소 주소)
		
		Test7 test = new Test7();
		System.out.println(test);
		// ======================================================
//		Book 객체생성
//		참조변수 출력
		Book b= new Book(2323232,"제에에에에에에목");
		System.out.println(b.bookNumber);
		System.out.println(b.bookTitle);
		System.out.println(b);
		System.out.println(b.toString());
		System.out.println(b.getClass());
		System.out.println(b.equals(b));
		System.out.println(b.hashCode());
		
		String s1 = "안녕하세요";
		System.out.println(s1);
		
		String s2= new String("반갑습니다");
		System.out.println(s2);

//		Integer 클래스
		
	}
}
