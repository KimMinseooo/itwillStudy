
class Parent{}
class Child1 extends Parent{}
class Child2 extends Parent{}
class InstanceofTest {
	public void method(Parent parent) {
		if(parent instanceof Child1) {
			Child1 ch =(Child1)parent;
			System.out.println("Child1변환성공");
		}
		else if(parent instanceof Child2) {
			Child2 ch =(Child2)parent;
			System.out.println("Child2변환성공");
		} else {
			System.out.println("Child로 변환되지 않음");
		}
		
	}
}

public class Test4 {
	public static void main(String[] args) {
//		Paren 클래스 정의
		
//		Child1 클래스 정의 Parent 상속
//		Child2 클래스 정의 Parent 상속
		
//		Child1 자식객체생성
//		Child2 자식객체생성				
//		Parent 객체생성
		Parent child1 = new Child1();
		Parent child2 = new Child2();
		Parent parent = new Parent();
//		InstanceofTest 클래스 객체생성
		InstanceofTest instanceofTest = new InstanceofTest();
//		method(Child1) 호출
		instanceofTest.method(child1);
//		method(Child2) 호출
		instanceofTest.method(child2);
//		method(parent) 호출
		instanceofTest.method(parent);
//		InstanceofTest 클래스 정의
//		if Child1 다운캐스팅 가능한지 판별 다운캐스팅, "Child1변환성공"
//		if Child2 다운캐스팅 가능한지 판별 다운캐스팅, "Child2변환성공"
	}
}
