
public class Test1 {
	public static void main(String[] args) {
//		final 1) 클래스 : 상속 못 하게 막아줌
//			  2) 메서드() : 메서드 오버라이딩(재정의) 못하게 막아줌
//		      3) 멤버변수 : 변수 값을 변경 못하게 막아줌(초기값 할당)
//				 상수변수 : static final 변수
		
//		Car 클래스 정의
//		멤버변수 정수형 speed
//		메서드() speedUp() 멤버변수 speed 1씩 증가
//		메서드() stop() "차를 멈춤" speed = 0 변경
//		=> stop 메서드 메서드 오버라이딩(재정의) 못하게 정의 
		
//		SportCar 클래스 정의 상속 Car
//		메서드 오버라이딩 speedUp() 10증가
//						stop() "스포츠카 멈춤", speed = 0
		
		SportCar sportCar = new SportCar();
		sportCar.speedUp();
		System.out.println("speed = " +sportCar.speed);
		sportCar.speedUp();
		sportCar.speedUp();
		System.out.println("speed = " +sportCar.speed);
		sportCar.stop();
		System.out.println("speed = " +sportCar.speed);
	}
}
