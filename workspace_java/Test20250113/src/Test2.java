
public class Test2 {
	public static void main(String[] args) {
//		Myfunction5<T> 함수형인터페이스
//		T형 하나를 받아서 리턴없음 println(T x) 추상메서드 정의
		
//		람다함수 f1 = x-> 출력
		Myfunction5<String> f1 =x -> System.out.println("출력 : "+x);
		f1.println("안녕하세요!");
		Myfunction5<Integer> f2 = x-> System.out.println("출력 : "+x);
		f2.println(200);
	}
}
