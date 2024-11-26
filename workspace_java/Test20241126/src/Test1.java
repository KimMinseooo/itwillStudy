
public class Test1 {
	public static void main(String[] args) {
		// Car 클래스 정의
		// 멤버변수 carName , 정수형 speed
		// 기본생성자 => 자동으로 만들어짐 
		// 		   => 정의해서 carName = "국민차"
		// 		   => speed = 10 ; 
		
		// myCar 라는 차를 만들고
		Car myCar = new Car();
		
		System.out.println("차 이름: "+myCar.carName);
		System.out.println("차의 기본 속도: "+myCar.speed);
		//myCar에 7정도 속도 증가 메서드 호출
		System.out.println("속도가 증가해서 "+myCar.speedUp(7)+"입니다.");
		//myCar에 8속도 감소 메서드 호출
		System.out.println("속도가 감소해서 "+myCar.speedDown(8)+"입니다.");
	}
}
