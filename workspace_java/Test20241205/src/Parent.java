
public class Parent {
	
	public void parentPrn() {
		System.out.println("부모 메서드");
	}
	
	public Parent() {
		this(5);
		System.out.println("Parent 기본 생성자");
	}

	public Parent(int i) {
//		this();
		System.out.println(i +" 값을 받는 Parent 생성자");
	}
}
