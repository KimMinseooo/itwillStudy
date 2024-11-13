
public class Test5 {
	public static void main(String[] args) {
		
		//두수를 더해서 결과를 받는 fun1(두 수를 받아서 저장하는 변수 ) 함수 정의 
//		System.out.println("리턴받은 결과: "+fun1(10,20));
		int c= fun1(10,20);
		System.out.println("리턴받은 결과: "+ c);
		
		
		//float 두 수를 곱해서 결과를 받은
		// fun2(두 수를 받아서 저장하는 float 변수)
		// 함수 정의 , float 리턴값 있음
		
		System.out.println(fun2(3.5f,2.5f));
	}
	
	
	public static float fun2(float n1, float n2) {
		return n1*n2;
	}
	
	
	public static int fun1(int n1 ,int n2) {
		System.out.println(n1+n2);
		return n1+n2;
	}
}
