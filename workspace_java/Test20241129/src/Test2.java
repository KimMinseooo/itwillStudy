
public class Test2 {
	public static void main(String[] args) {
		// 클래스 Car 정의 
		// 멤버변수 kind static 차 종류
		// 인스턴스 멤버변수 price 차 가격
		// static 메서드() prn() static 멤버변수 출력
		// 인스턴스 메서드() prn2()  kind , price 출력 
		
		//static  kind 멤버변수에 값 저장
		Car.kind="SUV";
		// Car 객체생성
		// price 인스턴스 멤버변수 값 저장
		// prn() , prn2() 메서드 호출
		
		Car car =new Car();
		car.price =654231000;
		car.prn();
		car.prn2();
		System.out.println("=======================");
		// Car 객체생성
		// price 인스턴스 멤버변수 값 저장
		// prn() , prn2() 메서드 호출 
		Car car2= new Car();
		car2.price=34921000;
		car2.prn();
		car2.prn2();
	}
}
