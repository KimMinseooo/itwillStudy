package p2;

import p1.*;

public class Student extends Person{
	private String privateVar2;
	String packageVar2;
	protected String protectedVar2;
	public String publicVar2;
	
	public void studentPrn() {
		System.out.println("privateVar2 = "+privateVar2);
		System.out.println("packageVar2 = "+packageVar2);
		System.out.println("protectedVar2 = "+protectedVar2);
		System.out.println("publicVar2 = "+publicVar2);
	}
}
