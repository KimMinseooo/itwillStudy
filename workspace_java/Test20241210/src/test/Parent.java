package test;

public /* final */ class Parent {
	// final 클래스는 자식 클래스 상속 못 받게 막아줌
	
	public /* final */ void parentPrn() {
		// final 메서드 자식 클래스 메서드 오버라이딩 못하게 막아줌
		System.out.println("Parent parentPrn()");
	}
}
