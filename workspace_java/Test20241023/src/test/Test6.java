package test;

public class Test6 {
	public static void main(String[] args) {
		
//		4. 논리형 : true / false 
//		=> boolean(1byte)
		
		boolean b= true;
		
		System.out.println(b);
		
		boolean c = false;
		System.out.println(c);
		
		
//		====================

//		기억장소(변수) => 기억장소 크기 , 자료형 지정 
//		=> 자바버전 10버전 부터 초기값으로 형을 지정
		var num = 10; // int  처음에 입력한 값의 자료형에 따라 결정 
		// 컴파일러가 자료형 추측하고 사용 
		System.out.println(num);   // int 
//		num ="문자"; => 형이 틀려서 에러 발생 

		var dNum = 10.0;  // double 
		System.out.println(dNum);
		dNum= 3;  // double
		System.out.println(dNum);
		
		var str ="hello";    //String
		System.out.println(str);
//		str = 3 ;  // 에러 발생  , 초기값이 문자열이기때문에 int 불가 
		
		var fNum = 3.4f;
		System.out.println(fNum);
	
		
		
		
		
	}
}
