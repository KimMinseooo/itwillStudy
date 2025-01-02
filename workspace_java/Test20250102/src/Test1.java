
public class Test1 {
	public static void main(String[] args) {
//		Calculator 클래스 정의
//		멤버변수 정의 : color 인스턴스 멤버변수 정의
//					: double pi 스태틱 멤버변수 정의 
//		메서드() 정의 : prn() 인스턴스 메서드 출력
//			:plus(int x, int y) 스태틱(클래스, 정적) 메서드 정의
//			=> 두 수를 더한 값 리턴
//			:minus(int x , int y ) 스태틱(클래스 , 정적) 메서드 정의
//			=> 두 수를 뺀 값 리턴
		
//		Calculator 클래스 객체생성
		Calculator calculator= new Calculator();
//		color 변수 값을 저장 , pi 변수 값을 저장
		calculator.color ="파란"; // 인스턴스 멤버변수
		calculator.pi = 3.1; // 스태틱 멤버변수
		Calculator.pi= 3.14; // 스태틱 멤버변수
//		prn() 메서드 호출
		calculator.prn();
//		plus(), minus() 호출
		System.out.println(Calculator.plus(5, 4));
		System.out.println(Calculator.minus(5, 4));
		
		Calculator calculator2 =  new Calculator();
		calculator2.color = "빨간";
//		Calculator.pi = Calculator.pi *100;
		calculator2.prn();
		
		Calculator calculator3 =  new Calculator();
		calculator3.prn();
	}
	
}
