
public class Test3 {
//	멤버변수 변수
	public int a = 100;
	public static int b = 200;
	
	public static void main(String[] args) {
//		p191 ~ 192
//		변수
//		1) 지역변수(로컬변수, 매개변수, 참조변수)
//		: 메서드 내에서 정의하고 사용
//		: 메서드 밖에서는 사용 못함
//		: 스택 기억장소에 저장되어짐 
//		=> 메서드 호출되면 사용 리턴하면 기억장소 사라짐
		int a = 10;
		System.out.println(a);
//		2) 멤버변수(인스턴스 변수)
//		: 클래스 안에 정의된 변수(인스턴스 변수)
//		: 객체를 생성 해야지만 사용할수 있는 변수
//		: 힙 기억장소(동적 기억장소)에 생성
//		=> 가비지 컬렉터(garbage collector) 메모리 수거(기억장소 해제)
//		: 인스턴스 변수 => new 객체생성해서 사용
		Test3 test3 = new Test3();
		System.out.println(test3.a);
		
//		3) static 변수(클래스 변수)
//		: 사용자가 프로그램을 실행하면 메모리에 상주하여
//		  메모리 데이터 영역에 상수,문자열, static 변수 생성
		System.out.println(Test3.b);
		

	}


}
