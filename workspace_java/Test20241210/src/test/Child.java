package test;

public class Child extends Parent{
	
	@Override
	public void parentPrn() {
//		super.parentPrn();
		
		System.out.println("재정의 Child parentPrn()");
	}

	public void childPrn() {
		System.out.println("Child childPrn()");
	}
	
}
