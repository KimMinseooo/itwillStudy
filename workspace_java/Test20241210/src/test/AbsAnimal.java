package test;

public abstract class AbsAnimal {
	private String name;
	
	public abstract void move();
	
	public void prn() {
		System.out.println("추상클래스 일반메서드~!");
	}
}
