package test;

public class SportsCar extends Car{
	private String model;
	
	public SportsCar() {
		super("파란색", 2000);
		System.out.println("SportsCar() 기본생성자");
	}
	public SportsCar(String model) {
		super();
		this.model=model;
		
	}
	
	
	public void sportsPrn() {
		System.out.println(color+":"+cc+":"+model);
	}
}
