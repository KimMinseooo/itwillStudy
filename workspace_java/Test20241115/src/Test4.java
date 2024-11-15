
public class Test4 {
	public static void main(String[] args) {
		
		// sum(정수형 두수를 저장하는 변수,변수) 함수 정의
		// 두수의 합 구하기 
//		리턴할 값 두수의 합 (리턴할 형 정수형)
		System.out.println("두 수의 합 : " +sum(5,6));
		
		// evenSum(정수형 수를 저장하는 변수) 함수 정의 
//		1 ~ 전달받은 정수 반복 => 짝수의 합 구하기 
//		리턴할 값 짝수의 합(리턴할형 정수형 ) 
		
		System.out.println("짝수의 합 : "+evenSum(11));
	}
	
	public static int sum(int num1 ,int num2 ) { 
		return num1+num2;
	}
	
	public static int evenSum(int num) {
		int evenTotal =0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				evenTotal+=i;
			}
		}
		return evenTotal;
	}
}
