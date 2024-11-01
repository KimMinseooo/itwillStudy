
public class Test1 {
	public static void main(String[] args) {
		
//		1. 나이 age 변수 정의 ,초기값 저장
//		관계식 => 나이가 20세 이상(크거나 같다)이면 T/F
		
//		System.out.println(관계식);
		
//		2. 정수형 변수 num 정의 ,초기값 저장
//		관계식 -> 양수() 이면 T/F
		int age= 20 ;
		
		System.out.println(age>=20);
		
		int num =-1 ;
		System.out.println(num<0);
		
		System.out.println(num ==0);
		System.out.println(num >0);
		
		//논리연산자 
//		1. 정수형 변수 num2 정의 초기값 저장
//		관계연산자 논리연산자 관계연산자
//		num2가 4보다 큰 경우(관계) num2가 7보다 작은 경우 (관계)
//		두 경우를 모두 만족하면 (논리연산자 연결) => true 
		
		int num2 = 3;
		System.out.println(num>4 && num<7);
		
		int num3 = 3;
		System.out.println(num3 <= 4 || num3 >= 7);
		
//		3. char ch 변수 정의 , 초기값 저장 
//		관계식 논리연산자 관계식 
//		대문자 A(65) ~ Z(90) 이면 => true/false
		
		char ch = 'A';
		System.out.println(ch>=65 && ch<=90);
		
		
		
//		4. 성별 정수형 변수 gender 정의 => 1, 2, 3, 4 중에 초기값 저장
//		1, 3 중에 하나라도 있으면 남 , true
//		2, 4 중에 하나라도 있으면 여, false
		
		int gender =3 ;
		System.out.println(gender==1 || gender == 3 );
		
		
		
	}
}
