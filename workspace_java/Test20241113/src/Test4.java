
public class Test4 {
//	public static 함수이름(전달받은 값을 저장하는 변수) {
//		//자주 사용하는 기능
//		// 함수 이름 부른곳으로(호출한곳) 되돌아감(생략가능)
//		return 결과값;
//	}
	
	public static void hello() {
		System.out.println("안녕하세요!!!!!!!!");
	}
	
	public static void cir(double len) {
		System.out.println(len * len *3.14);
	}
	
	public static void fun1(int num) {
		if(num %2==0) {
			System.out.println(num+"은 짝수입니다");
		}else {
			System.out.println(num+"은 홀수입니다");
		}
	}
	
	public static void main(String[] args) {
		hello(); // 메서드 호출 인사말 출력함수 정의
		
		cir(3.0);
		
		//짝수 홀수 구하는 기능을 fun1(수를 전달받아서 저장하는 변수) 
		// 함수 정의 ,리턴할값
		int num = 3;
		fun1(num);
	} // main()
	
	
	
	
	
	
} // class
