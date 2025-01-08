
public class Test1 {
	public static void main(String[] args) {
//		내부클래스, 중첩클래스, 중첩인터페이스
//		멤버클래스(인스턴스 멤버클래스 , 정적 클래스)
//		로컬클래스 (메서드 실행 할때 동작하는 클래스)
//		A클래스 객체 생성
		A a = new A();
		
//		B 클래스 객체생성, 멤버변수 field1 = 3 , method1() 호출
		A.B b = a.new B();
		b.field1 =3;
		System.out.println(b.field1);
		b.method1();
//		C 클래스 객체생성, 멤버변수 field1 = 3, method1() 호출
//					   멤버변수 field2 = 3, method2() 호출
		A.C c= new A.C();
		c.field1=3;
		System.out.println(c.field1);
		c.method1();
		A.C.field2=3;
		System.out.println(A.C.field2);
		A.C.method2();
		
		a.method();
	}
}
