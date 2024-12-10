package test;

public class Calculator implements Calc , Calc2{
	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}
	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	@Override
	public int div(int num1, int num2) {
		return num1/num2;
	}
	@Override
	public void prn() {
		System.out.println("다중상속 메서드 오버라이딩");
	}
}
