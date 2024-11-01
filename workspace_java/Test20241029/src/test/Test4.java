package test;

public class Test4 {

	public static void main(String[] args) {
		
//		3. 논리연산자 && (&) and (논리곱), ||(|) or (논리합) , !not(부정)
//		=> 결과 true / false
//		관계연산자 논리연산자 관계연산자 
//		두 피연산자(항) 간의 논리적으로 판별 
		
//		&& (&) and (논리곱)
//		두 피연산자가 모두 true 일 경우 => true
//		=> 			하나라도 false 이면 => false
//		=>	T && T = T
//		=>	T && F = F
//		=>	F && T = F		
//		=>	F && F = F
		
		boolean a = true; 
		boolean b = false ; 
		System.out.println(a && a);
		System.out.println(a && b);
		System.out.println(b && a);
		System.out.println(b && b);
		
//		|| (|) or (논리합)
//		두 피연산자가 모두 false 일 경우 => false
//		=> 			하나라도 true 이면 => true
//		=>	T && T = T
//		=>	T && F = T
//		=>	F && T = T		
//		=>	F && F = F
		
		System.out.println(a || a); //true
		System.out.println(a || b); //true
		System.out.println(b || a); //true
		System.out.println(b || b); //false
		
//		!not(논리부정)
//		=> 단항 연산자(피연산자가 하나뿐인 연산자)
//		!F => T
//		!T => F
		
		System.out.println(!a); // false
		System.out.println(!b); // true 
		
		
		
	}
}
