package test;

public class Test2 {

	public static void main(String[] args) {
		
		// 형변환 , 타입변환 
		// => 자바의 기본 데이터 타입을 변환 
		// => boolean 타입 ( true , false ) 를 제외한 기본 데이터 타입 간의 변환
		// 정수와 실수 연산 => 연산 수행 안됨 
		
		int a= 3 ;
		double b= 4.5 ; 
		System.out.println( a + b );
		
		
		int n = 10 ; 
		double d =n; // 자동으로 형변환 
		
		System.out.println(d);
		
		
		byte a1 = 10 ; 
		short a2 = 256;
		
		a2= a1;
		
		System.out.println(a2);
		
		double d2= 3.7; 
		int n2 =(int)d2;
		System.out.println(d2);
		System.out.println((int)d2);
		System.out.println(n2);
		
		byte b1 = 10 ;  // 	 0000 0000 0000 1010 
		short b2 = 256 ;  // 0000 0001 0000 0000
		// 기억장소 범위가 초과 => overflow 
		b1 =(byte)b2;
		System.out.println(b2);
		System.out.println("overflow 발생하여 ->  "+(byte)b2);
		System.out.println(b1);
		
		int i = 100 ;
		float f= i; 
		System.out.println(f); // 자동으로 형변환 
		
		long l  = 83983L;
		float f2 = l; // 실수float 형 = 정수long형
		System.out.println(f2);
		
		//byte(1) , short(2) <-> char(2) 형변환 
		
		char ch = 65;  // A
		short sh = 66; // B
		byte by = 70;  // F 
		
		// byte 타입의 음수 범위가 char 타입보다 크므로 => 자동 형변환 불가능 
//		ch = (char)by;
//		System.out.println(ch);
		
		
//		char(2) = short(2) 
		
//		ch= (char)sh;
//		System.out.println(ch);
		
//		byte = char 
		by = (byte)ch;
		System.out.println(by);
		
//		short = char 
		sh  =(short)ch ;
		System.out.println(sh);
		
		int i1 = ch ;
		System.out.println(i1);
		
		ch =(char)i1;
		System.out.println(ch);
		
		// long(큰) = int(작은) => 자동으로 형변환
		int i2 = 1234;
		long l22 = i2;
		System.out.println(l22);
		
		// int(작은) = long(큰) => 명시적으로 형변환
		l22=1231;
		i2 =(int)l22;
		System.out.println(i2);
		
//		범위가 넘어가면 overflow 발생 
		
		long l3 =10000000000L;
		int i3 =(int)l3;
		System.out.println(i3);
		
		// 주의사항
		
//		double = float 자동 형변환
		float f5= 1.1f; 
//		근사치 표현에 의해 정상적인 데이터가 아닌 데이터 전달 
//		=> 부족한 자릿수를 채울 때 근사치 표현에 의해서 이상한 값을 추가 
		double d5= f5; 
		System.out.println(d5);
		
		f5 =(float)1.1;
		System.out.println(f5);
		
		int i5 = 1;
		d5 =i5;
		System.out.println(d5);
		
		
		
	}
}
