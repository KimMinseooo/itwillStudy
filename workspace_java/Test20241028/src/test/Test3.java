package test;

public class Test3 {

	public static void main(String[] args) {
		//연산 과정에서 자동 형변환 
		
		byte b1 = 10 , b2= 20 ,b3;
		System.out.println(b1 + b2 ); // int 형
		
		b3 =(byte)(b1+b2);
		
		System.out.println(b3);  //byte 형 
		
		char ch = 'A';
		ch += 3;  
		System.out.println(ch);
//		char + int = int  자동으로 형변환 
		System.out.println(ch + 3);
		
		
		int i1 = 100;
		long l1 = 200L;
//		int + long => long 형으로 저장 
		System.out.println(i1+l1);
		
		int i2 = (int)(i1+l1);
		System.out.println(i2);
		
		float f2= 0.1f;
		double d2= 0.1; 
		System.out.println(f2 +d2);
		
//		double -> float 강제적으로 변환후 연산 
		
		
		System.out.println(f2+(float)d2);
	
		byte b5 = 100 + 20 ;
//		byte b6 = 100 + 30 ; // error 범위 초과  overflow  
		byte b6 = (byte)(100 + 30) ;
		System.out.println(b6);
		
		double d5= 1.2; 
		float f5= 0.9F; 
		
		int i5 = (int)d5 + (int)f5;     // 1 + 0 
		System.out.println(i5);
		
		int i6= (int)(d5+f5);   //   2.1을 int형으로 형변환 
		System.out.println(i6);  //  2 
		
		int i7 =5; 
		int i8 = 2; 
		System.out.println((double)i7 /(double)i8);
	
	}
}
