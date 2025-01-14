
import java.util.Arrays;
import java.util.HashSet;

class Parent{
	public void show() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	public void show() {
		System.out.println("Child");
	}
}
class A{
	private int a;
	public A(int a) {
		this.a = a;
	}
	public void display() {
		System.out.println("a=" + a);
	}
}
class B extends A{
	public B(int a) {
		super(a);
		super.display();
	}
}
public class Test2 {

	public static void main(String[] args) {
		// 2020년 2회 정보처리기사 실기 기출 문제
		// 2번 파이썬 set => 자바바 HashSet
		HashSet<String> a = 
		new HashSet<String>(Arrays.asList("일본","중국","한국"));
		a.add("베트남");
		a.add("중국");
		System.out.println(a);
		a.remove("일본");
		System.out.println(a);
		a.addAll(Arrays.asList("홍콩","한국","태국"));
		System.out.println(a);
		//[중국, 홍콩, 태국, 한국, 베트남] 자바 결과
		// {'중국', '한국','베트남','홍콩','태국'} 파이썬 결과
		
		System.out.println();
		System.out.println("----------------");
		// 5번 상속, 업캐스팅 
		Parent pa = new Child();
		pa.show();
		// Child 결과 , 밑줄 new
		System.out.println();
		System.out.println("----------------");
		// 19 상속, 부모 생성자, 부모 메서드 호출
		B obj = new B(10);
		// a=10 출력
	}

}
