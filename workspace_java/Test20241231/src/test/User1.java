package test;

public class User1 extends Thread{
//	멤버변수 Calculator 정의
	private Calculator calculator;
	
//	set메서드() => 쓰레드 이름 저장 this.setName("User1")	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User1");
	}

	//run() 메서드 오버라이딩 => setMemory(100) 호출
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
	// 쓰레드 이름 User2
	// run() 메서드 오버라이딩 => setMemory(20) 호출
}
