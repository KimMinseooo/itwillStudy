
public class OutClass {
//	다른 외부 클래스에서 사용할 일이 없는 경우
//	내부 인스턴스 클래스 정의
	
	private int num = 10;
	private static int sNum= 20;
//	내부 클래스 사용
	private InClass inClass;
//	생성자 => 내부 클래스 객체생성
	public OutClass() {
		inClass = new InClass();
	}
	
	
	
//	메서드
	public void usingClass() {
		System.out.println("OutClass usingClass()");
//		내부 클래스 메서드 호출
		inClass.inTest();
	}
	
	
	
//	인스턴스 내부 클래스 정의
	class InClass {
		int inNum =100;
		void inTest() {
			// 외부 클래스 private 멤버변수 접근 가능
			System.out.println("내부클래스 inNum : " +inNum);
			System.out.println("외부클래스 num : " +num);
			System.out.println("외부클래스 sNum : " +sNum);
		}
	}
	
}
