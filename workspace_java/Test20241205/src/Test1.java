
public class Test1 {
	public static void main(String[] args) {
		
//		Parent parent = new Parent();
//		parent.parentPrn();
//		parent.childPrn();
		
		Parent parent2 = new Parent(200);
		
		System.out.println("-------------------------");
		Child a = new Child();   // 생성자를 만드는 순간 부모클래스의 기본생성자를 호출함. 
		a.parentPrn();
		a.childPrn();
//		
		System.out.println("---------------------------");
		Child child2 = new Child(100);    // 값을 받는 생성자를 만들더라도 부모클래스의 기본생성자를 호출함!!!!
		child2.parentPrn();
		child2.childPrn();
	}
}
