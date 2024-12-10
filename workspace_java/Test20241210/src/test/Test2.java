package test;

public class Test2 {
	public static void main(String[] args) {
		
//		추상클래스 AbsShape
//		public void prn() 추상메서드
//		일반메서드 method() "AbsShape 추상클래스 일반메서드()"출력
		
//		자식 클래스 CircleA 상속 AbsShape
//		추상메서드 => 추상메서드 구현 (메서드 오버라이딩) 원을 그린다~~~
		
//		자식 클래스 TriA 상속 AbsShape
//		추상메서드 => 추상메서드 구현 (메서드 오버라이딩) 삼각형을 그린다~~~
		
//		자식 클래스 RecA 상속 AbsShape
//		추상메서드 => 추상메서드 구현 (메서드 오버라이딩) 사각형을 그린다~~~
		
		AbsShape absShape1 = new CircleA();
		absShape1.prn();
		absShape1.method();
		
		System.out.println("+++++++++++++++++++++++");
		AbsShape absShape2 = new TriA();
		absShape2.prn();
		absShape2.method();
		System.out.println("+++++++++++++++++++++++");
		AbsShape absShape3 = new RecA();
		absShape3.prn();
		absShape3.method();
		
		
		School school =new School();
		school.draw(absShape1);
		school.draw(absShape2);
		school.draw(absShape3);
	}
}
