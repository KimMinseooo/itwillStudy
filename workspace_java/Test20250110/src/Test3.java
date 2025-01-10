
public class Test3 {

	public static void main(String[] args) {
//		함수형 인터페이스 정의 MyFunction2
//		추상메서드 int calc(int x)
		
//		f1 람다함수  {x*x}구현 => 호출 => 출력
		MyFunction2 f1 = x -> {
			return x*x;
		};
		System.out.println("f1결과 : " + f1.calc(20));
//		함수형 인터페이스 정의 MyFunction3
//		추상메서드 void print()
		
//		f2 람다함수  {출력 "Hello,Java"}구현 => 호출
		MyFunction3 f2 = () -> {
			System.out.println("Hello,Java");
		};
		f2.print();
		
	}

}
