
public class A {
	
//	기본 생성자
	public A() {
		System.out.println("A 생성자");
	}
	
	class B {
		int field1;
//		static int field2;
		public B() {
			System.out.println("B 생성자");
		}
		public void method1(){
			System.out.println("B클래스 method1");
		}
		
	}
	
	static class C {
		int field1;
		static int field2;
		
		public void method1() {
			System.out.println("C클래스 method1");
		}
		public static void method2() {
			System.out.println("C클래스 method2");
		}
		public C() {
			System.out.println("C 생성자");
		}
	}
	
	public void method() {
		class D {
			int field1;
//			static int field2;
			public D() {
				System.out.println("D 생성자");
			}
			public void method1() {
				System.out.println("D클래스 method1");
			}
//			public static void method2() {
//				System.out.println("D클래스 method2");
//			}
		} // D 클래스
		D d = new D();
		d.field1= 3;
		d.method1();
		
	} // method()
//	인스턴스 클래스 B 
//	=> B 생성자, 멤버변수 int field1, 메서드 method1
//	정적(static, 클래스) 클래스 C
//	=> C 생성자, 멤버변수 int field1, static 멤버변수 int field2
//	=> 메서드 method1, static 메서드 method2
//	리턴값없음method 메서드(클래스D)
//	=> D 생성자, 멤버변수 int field1, static 멤버변수 int field2
//	=> 메서드 method1, static 메서드 method2
//	=> D객체 생성, field1 =3 , method1() 호출
	
} // A클래스
