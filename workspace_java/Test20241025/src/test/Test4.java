package test;

public class Test4 {

	public static void main(String [] args) {
		
		char ch1 ='A';
		System.out.println(ch1);
		
		System.out.println((int)ch1);
		
		int ch2 = 97;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		System.out.println('\uD209');
		
		
		int r = 5; 
		
		//final : 마지막 값, 변수를 변경하지 못하게 막아줌, 초기값은 변경 가능 .
		
		
		final  double PI = 3.141592;
		System.out.println(r * r * PI);
		r= 10 ;
		System.out.println(r * r * PI);
		r= 20 ;
		System.out.println(r * r * PI);
		
	}
}
