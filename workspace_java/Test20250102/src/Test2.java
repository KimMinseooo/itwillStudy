import java.util.*;


public class Test2 {
	public static void main(String[] args) {
// 		p193 싱글톤(하나객체)  : 전체 프로그램에서 단 하나의 객체만 만들기
//			  		  : 단 하나의 객체생성해서 사용
//					  : static 이용해서 객체생성
		// Calendar 객체생성
		Calendar calendar = Calendar.getInstance();
//		Calendar calendar2 = new Calendar();
//		Singleton 클래스 정의
//		private 멤버변수
//		static Singleton 변수선언 = new SIngleton 객체생성
//		private 기본생성자
//		static Singleton 리턴 getInstance() 메서드
		
//		Singleton 2개 객체생성 => new 에러발생
//		Singleton 2개 (s1,s2) 객체생성 => getInstance()
//		s1, s2 두개 비교 같으면 => "같은 Singleton 객체입니다"
//		s1, s2 두개 비교 틀리면 => "다른 Singleton 객체입니다"
		
//		Singleton singleton = new Singleton();
//		Singleton singleton2 = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		if(s1 == s2 ) {
			System.out.println("같은 Singleton 객체입니다");
		} else { 
			System.out.println("다른 Singleton 객체입니다");
		}
	}
}
