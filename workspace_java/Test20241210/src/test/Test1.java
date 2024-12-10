package test;

public class Test1 {
	public static void main(String[] args) {
//		클래스 (클래스)
//		: class (일반 메서드)
//		: 객체 생성 할수 있음
//		: 상속 , 업캐스팅, 다형성, 메서드 오버라이딩
//		: 단일 상속(extends) 
		
//		추상클래스 (클래스 + 추상틀)
//		: abstract class (일반 메서드 + 추상 메서드)
//		: 객체 생성 불가능! (부모추상클래스 = 자식 클래스) 강제적 업캐스팅
//		: 상속, 추상화 ,업캐스팅, 다형성 , 메서드 오버라이딩
//		: 단일 상속(extends, 확장 + 틀 구현)
		
//		인터페이스 (추상틀)
//		: abstract interface (추상메서드(강제적 오버라이딩))
//		: 객체 생성 불가능! (부모추상인터페이스 = 자식클래스 ) 강제적 업캐스팅
//		: 상속, 추상화, 업캐스팅, 다형성, 메서드 오버라이딩
//		: 다중 상속 (implements, 틀 구현)
		
//		final : 수정 못하게 막아줌
		
//		p281 추상클래스
//		public abstract class 클래스이름 {
		
//		추상 클래스 AbsAnimal 
//		멤버변수 String name 
//		메서드() prn() "추상클래스 일반메서드" 출력
//		추상 메서드() => 메서드 틀  public abstract void move();
		
//		부모 추상클래스 = 상속받은 자식클래스 객체생성 (업캐스팅)
		AbsAnimal absAnimal = new EagleA();
		absAnimal.move();
		absAnimal.prn();
		
	}

}
