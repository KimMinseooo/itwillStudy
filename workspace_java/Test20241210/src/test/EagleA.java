package test;

public class EagleA extends AbsAnimal{
//	AbsAnimal 추상 클래스 상속 => 에러 발생 
//	추상 메서드(메서드틀)
	
	@Override
	public void move() {
		System.out.println("EagleA클래스 추상메서드 구현~!");
	}
}
