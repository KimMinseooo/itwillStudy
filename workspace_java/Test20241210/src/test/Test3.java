package test;

public class Test3 {
	public static void main(String[] args) {
//		인터페이스 InterAnimal
//		public interface 인터페이스이름{
//			추상메서드() 정의
//		}
		
		
//		인터페이스 상속 받은 클래스 EagleInter
		
//		인터페이스 상속 받은 클래스 TigerInter
		
//		부모 인터페이스 = 틀을 구현한 자식 클래스(업캐스팅, 다형성)
		
		InterAnimal animal = new EagleInter();
		animal.move();

		InterAnimal animal2 = new TigerInter();
		animal2.move();
		
		EagleInter eagle = new EagleInter();
		eagle.move();
	}
}
