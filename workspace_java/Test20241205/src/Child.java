
public class Child extends Parent{

	public Child() {
		// 부모 Parent 객체생성 => 부모의 기본생성자
		System.out.println("Child 기본 생성자");
	}
	public Child(int num) {
		System.out.println(num+" 값을 받는 Child 생성자~~~~");
	}
	
	
	public void childPrn() {
		System.out.println("자식 메서드");
	}
	
	
}
