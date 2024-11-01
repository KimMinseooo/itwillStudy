package test;

public class Test2 {

	public static void main(String[] args) {
		
//		4. 대입연산자(할당연산자)  = , 확장 대입연산자  += -= *= /= %=  
//		변수(기억장소)에 값을 대입(저장) 연산자 
//		변수 = 데이터(변수,리터럴,계산식) 
//		=> 모든 연산자 중에서 우선순위가 가장 낮다 
		
		int x ;
		int y ;
		x = y = 3 ;
		System.out.println(x);
		System.out.println(y);
		
//		확장(복합)대입연산자 ( += -= *= /= %= )
		
		int b= 10 ; 
		b += 20;   // b = b + 20 ; 
		System.out.println(b);
		
		b= 20 ;
		b -= 10 ;
		System.out.println(b);
		
		b= 10 ;
		b *= 10 ;
		System.out.println(b);
		
		b= 100;
		b /= 10;
		System.out.println(b);
		
		b= 100;
		b %= 10;
		System.out.println(b);
		
//		byte 형변수 b1 ,b2 선언하고 10 ,20 초기값 저장
		byte b1 = 10 ;
		byte b2 = 20 ; 
		
		b1 = (byte) (b1 + b2);
		System.out.println(b1);
		
		b1 += b2;
		System.out.println(b1);
		
//		char 형 변수 ch 선언하고 초기값 'A' 대입
		char ch = 'A';
		ch = (char)(ch + 3);        //char + int 이기 때문에 형변환 필요 
		System.out.println(ch);
		ch +=3;
		System.out.println(ch);

		
		
		
		
	}
}
