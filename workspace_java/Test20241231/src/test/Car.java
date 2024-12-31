package test;

public class Car {
//	Car 클래스 정의
//	멤버변수(인스턴스 변수) 정의 String color, int cc
	String color;
	int cc;
//	생성자 생략 => 생성자가 없으면 기본생성자 컴파일 할때 자동 만들어짐
//	=> Car 형태의 기억장소 생성, 멤버변수 초기값을 null, 0 할당
//	   메서드() 메모리 할당 사용할 준비
//	생성자 오버로딩
	public Car() {
//		같은 클래스 안에 있는 값을 받는 생성자를 호출 
		this("검정", 10);
		
		System.out.println("Car() 기본생성자");
//		멤버변수 기억장소에 초기값 할당(참조형null, 기본자료형 0 0.0 false,
//		this.color = "기본";
//		this.cc = 1;
	}
	// color, cc 받는 생성자
	public Car(String color){
		// color 전달받는 값을 저장하는 변수(매개변수), 지역변수
//		this.color = color;
		this(color, 1);
	}
	public Car(int cc){
//		this.cc = cc;
		this("기본", cc);
	}
	public Car(String color, int cc){
		this.color = color;
		this.cc = cc;
	}
	
//	메서드 prn() 출력 color : cc
	public void prn() {
		int a; //지역변수
		a = 10; //초기값
//		System.out.println("지역변수 : " + a);
		System.out.println(this.color + " : " + this.cc);
	}
}
