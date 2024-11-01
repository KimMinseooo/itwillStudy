
public class Test1 {
	public static void main(String[] args) {
		
		//제어문
		//1. 조건문(if , switch case )
		//2. 반복문(for, while , do while) 
		
		//조건문 if : 조건에 따라 문장(명령)을 선택
//		나이가 8살 이상(크거나 같으면)이면 학교에 다닙니다 
//				그렇지 않다면 학교에 다니지 않습니다 .
//		조건의 결과 => boolean 형  true/false
		
		int age= 10 ;
		
		if (age>=8) {
			System.out.println("나이 : " + age);
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("나이 : " + age);
			System.out.println("학교에 다니지 않습니다.");
		}
		
		char gender= 'F';
		
		if(gender=='F') {
			System.out.println("여성입니다.");
		} else  {
			System.out.println("남성입니다.");
		}
		
		int num =-7; 
		if( num %2 ==1  ) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		
		if(num %3 ==0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의  배수 아님");
		}
		
		
		if (num <0) {
			System.out.println("음수입니다");
			System.out.println(num+"의 절대값 :" +num*-1);
		} else {
			System.out.println("양수입니다.");
			System.out.println(num);
		}
		
		
		int a =10 ;
		int b= 20 ;
		if (a<= b) {
			System.out.println("최대값은 : " +b);
		} else {
			System.out.println("최대값은 : " +a);
		}
		
		
		
		
		int num3 =8;
		if (num3 >=4 && num3 <=7) {
			System.out.println("4 ~ 7 사이의 수");
		} else {
			System.out.println("4 ~ 7 사이 수 아님");
		}
		
		
		int age1 = 5 ;
		if (age1<5 || age1 >=65) {
			System.out.println("무료입장");
		} else {
			System.out.println("입장료 1000원");
		}
		
		// num 변수 3의 배수이면서 5의 배수 인 경우
		
		int num4 = 30 ; 
		if (num4 %3==0 || num%5==0) { 
			System.out.println("3의 배수 이거나 5의 배수");
		} else { 
			System.out.println("3의 배수도 5의 배수도 아님 ");
		}
	
	}
}
