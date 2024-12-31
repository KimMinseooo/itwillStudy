package p1;

public class Person {
	private String privateVar;
	String packageVar;
	protected String protectedVar;
	public String publicVar;
	
	public void personPrn() {
		System.out.println("privateVar = "+privateVar);
		System.out.println("packageVar = "+packageVar);
		System.out.println("protectedVar = "+protectedVar);
		System.out.println("publicVar = "+publicVar);
	}
}
