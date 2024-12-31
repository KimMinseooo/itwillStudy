package test;

public class Test3 {

	public static void main(String[] args) {
		int a; // 변수 선언(지역변수)(기억장소 할당)
//		System.out.println(a); //에러발생
		// 초기값 할당 작업이 없어서 변수 사용할수 없음
		
//		Car 클래스 정의
//		멤버변수 정의 String color, int cc
//		생성자 생략 => 생성자가 없으면 기본생성자 컴파일 할때 자동 만들어짐
//		=> Car 형태의 기억장소 생성, 멤버변수 초기값을 null, 0 할당
//		   메서드() 메모리 할당 사용할 준비
//		메서드 prn() 출력 color : cc
		
//		Car 클래스 객체생성  
//		car 변수 (지역변수, 참조변수)
		Car car = null;
		car = new Car(); // 기본생성자 호출
		System.out.println(car);
//		prn() 메서드 호출
		car.prn();
		
//		Car 클래스 객체생성 color,cc 초기값 전달
		Car car2 = new Car("빨강", 1000);
		System.out.println(car2);
		car2.prn();
		
		int c[] = new int[3];
		System.out.println(c);
		System.out.println(c[0]);//0
		System.out.println(c[1]);//0
		System.out.println(c[2]);//0
		
		int d[] = new int[] {10,20,30};
		System.out.println(d);
		System.out.println(d[0]);//10
		System.out.println(d[1]);//20
		System.out.println(d[2]);//30
		
	}

}
