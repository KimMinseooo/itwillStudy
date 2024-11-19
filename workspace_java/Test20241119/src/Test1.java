
public class Test1 {
	
	public static void main(String[] args) {
		
//		변수 : 기억장소를 정의하고 이름부여 , 값을 저장 => 이름을 호출 
//		함수 : 자주 사용하는 기능을 이름으로 정의하고 => 이름 호출 
		
//		객체지향 프로그래밍
//		클래스 : 객체(사물, 업무)를 주제로 정의하고
//				주제에 맞는 특징을 저장, 주제에 맞는 기능을 저장
//				객체지향 프로그래밍의 프로그램 단위
//		멤버변수 : 클래스 안에 있는 변수로 주제에 맞는 특징을 저장 
//		멤버함수(method, 메서드,메소드) : 클래스안에 있는 함수로 주제에 맞는 기능을 저장
		
//		호출 사용 : 클래스.멤버변수 , 클래스.메서드()
		
//		객체(Object) => 모든대상(사물, 업무) 파악할 수 있는 주제
//		객체지향 프로그래밍 (OOP => Object Oriented Programming)
//		-현실 객체를 컴퓨터 프로그램으로 표현하기 위한 프로그래밍 기법
//		-객체를 중심으로 객체 간의 관계를 통해 프로그램을 구현하는 것
//		- 상속성, 추상화, 다형성 , 은닉성(캡슐화) 
		
//		객체지향 프로그래밍 3단계
//		1. 분석 -객체 모델링 => 객체 구성요소(속성,특징), 동작(기능)
//							추출하는 과정
//		ex) 학생 :학번, 이름, 학년 ,사는곳 ,국어점수, 점수합계 , 점수평균 
//		2. 설계(클래스 정의) => 모델링을 통해서 클래스 정의 
//			1) 멤버변수 : 객체 구성요소(속성,특징)
//			2) 메서드 :객체 동작 (기능)
		
//		3. 구현(사용) - 클래스 변수 선언, 객체생성 사용 
//			=> 객체생성 : 기억장소 할당(메모리 공간 생성) 
//			=> 사용 : 기억장소 접근해서 멤버변수, 메서드 호출 사용
		
//		지역변수 선언 : 기억장소에 이름을 부여해서(기억장소 할당)
						// 기억장소에 초기값 할당
		int a = 10 ;
		System.out.println(a);
		
		
		
		//배열 변수 선언
		int b[] = new int[] {10,20,30,40,50};
		System.out.println(b);
		System.out.println(b[0]);
		
		//클래스 불러서 사용 (클래스 변수 선언, 클래스 객체 생성)
		String str= new String();
		
		str= "문자열";
		System.out.println(str);
		// 생성자 Student() => Student 형에 맞게 기억장소 할당 , 초기값 할당
		Student s= new Student();   // 학생 class에 대한 정보 s라는 이름으로 
		Student s2 = new Student();  // 새로운 학생을 만들겠다 . s2라는 이름으로 
		// 사용 : s 기억장소를 참조, 참조연산자를 통해서 접근
		System.out.println(s);
		
		System.out.println(s.num);
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		
		s.num =1;
		s.name="홍길동";
		s.kor=100;
		s.eng=90;
		s.math=80;
		
		s2.num =1;
		s2.name="홍길동";
		s2.kor=10;
		s2.eng=20;
		s2.math=30;
		
		System.out.println(s.num);
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		
		s.prn();
		System.out.println("학생 s의 (국,영,수)점수의 합 : "+s.sum());  // 학생 s에 대한 점수의 합
		System.out.println("학생 s2의 (국,영,수)점수의 합 : "+s2.sum());  // 학생 s2에 대한 점수의 합
		
	}
}
