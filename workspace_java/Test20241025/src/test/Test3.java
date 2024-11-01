package test;

public class Test3 {

	public static void main(String[] args) { 
		// 기억장소 크기(4byte) 로 지정하고 기억장소 이름을 a로 부여하고 초기값을 10 저장 
		int a = 10 ;
		
		// 기본 자료형 (기억장소에 저장될 데이터 형 )
//		1. 정수형 : 소수점 없는 수 (양수, 0 ,음수 )
//			-> byte(1byte), short (2byte)
//			-> 기본형 int(4byte) 00000000 00000000 00000000 00001010
//			-> long (8byte) 

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("short의 크기는 " + Short.BYTES + "byte이고 범위는 " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		
		
		int d =1000 ; 
		
//		d= 1000L   저장 불가 . why ?  -> int형(4)에 long형(8) 자료형 데이터 저장 불가 
		
		long e = 1000L ;
		System.out.println(d);    // int형 데이터 1000 ( 4byte) 
		System.out.println(e);	  // long형 데이터 1000L (8byte)
		
		//기본 숫자 double 
		float f = 2.5f;
		double h= 2.5; 
		
		System.out.println(f);
		System.out.println(h);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
