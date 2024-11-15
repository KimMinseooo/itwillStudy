
public class Test2 {
	public static void main(String[] args) {
		
		//절대값 구하는 함수 abs(전달받은 값이 정수형 변수 정의 ) 정의
		// 절대값 구해서 리턴(리턴할형 정수형) 
		System.out.println(abs(-3));

		// 합을 구하는 함수 total(전달받은값이 정수형 변수정의) 정의
		// 1~부터 전달받은 값까지 합 리턴
		System.out.println(total(10));
		
		
		
	}
	
	
	public static int abs(int num) {
		if(num<0) return -num;
		else return num; 
	}
	
	public static int total(int num) {
		int total=0;
		for(int i=1;i<=num;i++) {
			total+=i; 
		}
		return total;
	}
	
}
