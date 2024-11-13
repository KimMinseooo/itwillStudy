
public class Test3 {
	public static void main(String[] args) {
//		자바 프로그램 단위 class(주제, 객체)
//		=>요소 : class의 멤버변수, class의 멤버함수(), 메서드()
		
//		변수 : 변하는 수, 기억장소 이름을 부여 값을 저장
//		변수사용 : 이름을 불러서 기억장소에 저장된 값을 사용
		
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
//		p134 함수 : 자주 사용하는 기능을 한 번만 정의 => 이름부여 정의
//		     함수사용 : 정의된 기능의 이름을 불러서(호출) 사용
//		     클래스 멤버가되는 함수 => 멤버함수 => 메서드(메소드)
		System.out.println("함수호출1");
		
		cal(a,b);
		System.out.println("함수1끝 되돌아옴");
		System.out.println("===============================");
		System.out.println("함수호출2");
		cal(100,200);
		System.out.println("함수2끝 되돌아옴");
	}
	
	// 개발자가 개발한 메서드(함수) 정의
	public static void cal(int a , int b) {
		System.out.println(a+" + "+b+" = "+(a + b));
		System.out.println(a+" - "+b+" = "+(a - b));
		System.out.println(a+" * "+b+" = "+(a * b));
		System.out.println(a+" / "+b+" = "+(a / b));
//		함수 이름 부른곳으로(호출한곳) 으로 되돌아감 (생략가능)
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
