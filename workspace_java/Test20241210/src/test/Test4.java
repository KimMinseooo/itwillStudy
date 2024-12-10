package test;

public class Test4 {
	public static void main(String[] args) {
		
//		인터페이스 Calc 정의 
//		추상메서드 정의 int add(int num1, int num2)
//		추상메서드 정의 int sub(int num1, int num2)
//		추상메서드 정의 int mul(int num1, int num2)
//		추상메서드 정의 int div(int num1, int num2)
		
//		상속받은 클래스 Calculator
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(10, 30));
		System.out.println(cal.sub(20, 10));
		System.out.println(cal.mul(10, 30));
		System.out.println(cal.div(10, 5));
		
//		인터페이스 Calc2 정의 
//		추상메서드 정의 prn() 
		cal.prn();
	}
}
