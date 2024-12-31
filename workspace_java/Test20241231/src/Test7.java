
public class Test7 {
	public static void main(String[] args) {
		Computer computer= new Computer();
		
		System.out.println("원면적 : "+computer.areaCircle(10));
		
//		Airplane 클래스 정의
//		fly() 메서드 정의 "일반 비행합니다"
		
//		SuperAirplane 클래스 정의 Airplane 상속
//		상수변수 정의 NORMAL = 1
//		상수변수 정의 SUPER = 2
//		멤버변수 정수형 flyMode = NORMAL
//		fly() 메서드 재정의 
//		flyMode SUPER 같으면 "초고속 비행합니다"
//					  틀리면 부모 fly() 메서드 호출
		
//		SuperAirplane 객체생성
//		flyMode 에 값 저장
//		fly() 메서드 호출
		
		SuperAirplane superAirplane = new SuperAirplane();
		superAirplane.flyMode= SuperAirplane.NORMAL;
		superAirplane.fly();
	}
}
