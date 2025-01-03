
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class Test3 {
	public static void main(String[] args) {
//		A
//	  B  C
//	  D  E
		
//	  B클래스 객체생성
//	  C클래스 객체생성
//	  D클래스 객체생성
//	  E클래스 객체생성
	  B b= new B();
	  C c = new C();
	  D d= new D();
	  E e = new E();
//		A = B C D E 자식 업캐스팅
//		B = D, C = E 업캐스팅
//		B= E, C= D 업캐스팅
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		System.out.println(a1 instanceof B);
		System.out.println(a2 instanceof C);
		System.out.println(a3 instanceof D);
		System.out.println(a4 instanceof E);
		
		B b1 = d;
		C c1 = e;
//		B b2 = e; 에러
//		C c2 = d; 에러
		
		
		
		
		
	}
}
