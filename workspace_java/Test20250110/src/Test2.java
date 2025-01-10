
public class Test2 {
	public static void main(String[] args) {
//		자바의 람다식 : 함수형 프로그램 방식
//		자바 람다식 구조 
//		(매개변수) -> {실행문}
//		int calc(int x, int y);
		MyFunction f1 = (x,y) -> { 
			return x + y; 
		};
		System.out.println("f1결과 : " + f1.calc(10, 20));
		
//		MyFunction f2 = 두 수 뺀 결과
		MyFunction f2 = (x, y) -> {return x - y;};
		System.out.println("f2결과 : " + f2.calc(10, 20));
		
	}
}
