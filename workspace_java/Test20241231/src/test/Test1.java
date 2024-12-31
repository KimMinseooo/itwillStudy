package test;

public class Test1 {
	public static void main(String[] args) {
		//Calculator 계산기 클래스 
		// Calculator 객체 생성
		Calculator calculator = new Calculator();
		// calculator 참조변수 (지역변수)
		// User1 클래스 => 쓰레드
		// User1 객체생성
		User1 user1 = new User1();
		// set메서드 호출
		user1.setCalculator(calculator);
		// User1 쓰레드 시작
		user1.start();
		// User2 클래스 => 쓰레드 
		// User2 객체생성
		User2 user2 = new User2();
		// set메서드 호출
		user2.setCalculator(calculator);
		// User2 쓰레드 시작
		user2.start();
		
//		동기화메서드
//		: 쓰레드가 사용 중인 객체를 다른 쓰레드가 변경할 수 없게 하려면
//		쓰레드가 작업이 끝날 때까지 객체에 잠금을 걸어서 다른 쓰레드 사용
//		할 수 없도록 함 
//		임계 영역
//		: 멀티 쓰레드에서 단 하나의 쓰레드만 실행할 수 있는 코드 영역
//		: 임계영역을 지정하기 위해 동기화메서드 제공
//		public synchronized void method() {
//		}
	}
	
}
