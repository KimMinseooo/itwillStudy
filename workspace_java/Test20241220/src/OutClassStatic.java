
public class OutClassStatic {
	
//	내부 클래스가 외부 클래스 생성과 무관하게 사용
//	정적 내부 클래스 정의
	
	private int num = 10;
	private static int sNum= 20;
	
	static class InClassStatic {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// 외부 클래스 private 멤버변수 접근 가능
			System.out.println("내부클래스 inNum : " +inNum);
			System.out.println("내부클래스 sInNum :" +sInNum);
//			System.out.println("외부클래스 num : " +num);   // 인스턴스 변수
			System.out.println("외부클래스 sNum : " +sNum);  // static 변수 
						
		}
		
		// 인스턴스 변수를 사용하기 위해선 객체를 생성해야하니 때문에 오류가 뜬다 !! 
		// 나머지 변수들은 static 변수이기 때문에 사용 가능 
		static void sInTest() {
			// 외부 클래스 private 멤버변수 접근 가능
//			System.out.println("내부클래스 inNum : " +inNum);
			System.out.println("내부클래스 sInNum :" +sInNum);
//			System.out.println("외부클래스 num : " +num);   // 인스턴스 변수
			System.out.println("외부클래스 sNum : " +sNum);  // static 변수 
						
		}
	}
}
