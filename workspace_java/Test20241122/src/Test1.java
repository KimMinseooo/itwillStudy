
public class Test1 {
	public static void main(String[] args) {
		// 클래스 정의 
		// Car 클래스 정의
		// => 멤버변수 company, model , price
		// => 메서드() run() "차가 달린다" 출력
		
//		Car 클래스 변수 선언 = new 객체생성(기억장소 할당, 초기값 할당) 
//							  인스턴스 화
//		Car 정의된 클래스(설계도)에 대한 객체(인스턴스) 생성
//		new Car() 메모리(힙 heap)에 인스턴스 생성 => 주소 부여 
		
		
		// 생성자 : 객체생성을 담당 , 클래스 이름()
		Car myCar = new Car();
		myCar.company="Hyundai";
		myCar.model="GENESIS G90";
		myCar.price = 100000000;
		
		myCar.run();
	}
}
