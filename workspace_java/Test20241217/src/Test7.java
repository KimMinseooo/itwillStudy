
public class Test7 {
	public static void main(String[] args) {
//		1. 변수(자료형), 자료형의 형변환
//		2. 연산자
//		3. 제어문(조건문, 반복문)
//		3-2. 배열
//		4. 객체(멤버변수, 멤버함수(메서드))
//		5. 객체 지향 개념 

//		1) 변수 선언(변수명 만드는 규칙)  
		int a= 10;
		double b =3.4;
		char c= 'A';
		boolean d= true;
		String asd = "sdfsdf";
		
//		2) 연산자 
//		+ -  * / % 		산술연산자
//		== != > >= < <= 관계연산자 
//		&& || !  		논리연산자
		
//		3) 제어문 if , switch , 반복문 for while
		
//		버스 탑승 요금 계산
//		8세 작으면 (미취학 아동) 1000원
//		8세 이상~ 14세 작으면 2000원
//		14세 이상~ 20세 작으면 2500원
//		나머지 3000원
		
//		출력 "~~세 요금은 ~~~~원입니다"
		int age = 5 ;
		int charge= 0;
		if ( age < 8) {
			charge=1000;
		} else if (age < 14) {
			charge=2000;
		} else if (age < 20) {
			charge=2500;
		} else {
			charge=3000;
		}
		System.out.println(age+"세 요금은 "+charge+"원입니다");
		
//		4) 배열
		
		int arr[] = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		int arr2[]= new int[] {10,20,30,40,50};
		int arr3[] = {10,20,30,40,50};
		
//		문자열 3개 배열 선언 => 3개 값을 저장 
		String str[] = new String[3];
		str[0]="홍";
		str[1]="길";
		str[2]="동";
		for(String s : str) {
			System.out.println(s);
		}
		
		String str2[] = new String[] {"홍길동","고길동","이길동"};
		for(String s : str2) {
			System.out.println(s);
		}
		
		String str3[] = {"홍길동2","고길동2","이길동2"};
		for(String s : str3) {
			System.out.println(s);
		}
		
		
//		5) 객체 지향 프로그래밍 특징
//		 - 캡슐화(은닉) => 접근지정자로 접근이 불가능하도록 정보를 은닉후 setter ,getter 메서드를 통해서 접근 가능하도록 함 
//		 - 상속(상속성) => 코드의 재사용화를 위해서 부모클래스를 상속해서 메서드를 재사용함
//		 - 다형성 => 하나의 객체가 여러가지 타입을 가질수 있는것을 의미함  
//			=> 오버라이딩 (overriding) : 부모 클래스로부터 상속받은 메서드를  내부 구현만 재정의하여 사용 !! 
//			   오버로딩(overloading) : 하나의 클래스에 같은 이름의 함수(메서드)를 여러 개 정의 하고 , 매개변수 개수와 유형만 달리하여 사용하는것 ex) 생성자!!
//				 사용 이유 :  같은 기능을 하는 메서드를 하나의 이름으로 사용 가능 ! 
//		 - 추상화 :  추상 클래스와 인터페이스에 대한 개념 / 보통 공통으로 사용할것같은 기능들을 
//					부모클래스에서 추상화한 틀을 만들고 자식 클래스들은 상속을 받아서 구체화하여서 사용한다 
		
//		6) 클래스 정의 , 멤버변수 , 생성자 정의( 기본생성자 ,파라미터를 전달받는 생성자) , 메서드 정의
//			객체생성, 메서드 호출
		Person person = new Person();
		
		Person person1 = new Person("김",13);
		person1.prn();
//		Person 클래스 정의
//		멤버변수 name , age 
//		기본 생성자 , 멤버변수 값을 받는 생성자 , 
//		prn() 메서드
		
		
//		7) 상속 
//		Student 클래스 정의 상속 Person
//		멤버변수 학번 num
//		prn2() 메서드 출력 num: name
		
		Student stu = new Student(202423232);
		stu.setName("홍길동");
		stu.setAge(20);
		
		stu.prn2();
		
//		8) 접근 제어자 public protected 
//					 생략 (default ,package) private
		
//		9) 클래스(정적) 변수 , 인스턴스 변수 , 로컬변수 
		
//		10) 가비지 컬렉터 (Garbage Collector)
		
//		11) final - 변수 ,메서드,클래스에 사용될수 있으며 선언된 대상의 변경을 금지한다!!
		
//		12) 형변환 , instanceof 연산자
		
		//업캐스팅 ( 자식클래스가 부모클래스로 업캐스팅 됨 )
		Person person2 = new Student();
		person2.prn();
		
		//다운캐스팅 ( 부모 클래스가 자식 클래스로 다운캐스팅 ) --> 명시적으로 지정해줘야함
		Student student2 = (Student)person2;
		student2.prn();
		student2.prn2();
		
//		13) 추상클래스 , 인터페이스 => 이해하기
		
//		서술형 15문제   실습형3문제 
	}
}
