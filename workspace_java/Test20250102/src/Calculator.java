
public class Calculator {
	String color; // 인스턴스 멤버변수
	static double pi; // 스태틱(클래스 , 정적) 멤버변수
//	1) 객체생성하지 않고 클래스.멤버변수 접근 바로해서 사용
//	2)클래스 단에 기억장소 만들어짐 => 공용 기억장소 사용

	public void prn() {
		System.out.println(color +":" + pi);
	}
	
	public static int plus(int x, int y) {
		return x+y;
	}
	
	public static int minus(int x, int y ) {
		return x-y;
	}
}
