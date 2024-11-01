package test;

public class Test1 {

	public static void main(String[] args) {
		 
		//문자열형 String 참조형 
		// 참조형 : 기억장소에 주소를 저장 
		// 문자열형 String 참조형, 문자열 관련 주제 (객체) 를 정해서 만들어 놓은 프로그램
		
		String str = "안녕" ; 
		System.out.println("문자열 출력 : " + 100 + str + "하세요");
		
		//출력 => 특수 출력 문자 
		// => \출력\ "출력"  '출력'  출 력
		// " 문자를 표시하는 특수한 기능을 가지고 있는 문자 
		// => 특수한 기능을 가지고 있는 문자가 아니다 표시 => \"
		System.out.println("\"출력\"");
		System.out.println("\\출력\\");
		System.out.println("'출력'");
		System.out.println("출\t력");
		System.out.println("출\n력");
		
		System.out.println("\'출\'");
	
		String address =  "D:\\workspace_java\\Test20241028\\src\\test";
	
		System.out.println(address);

		System.out.println("Hello\n\"Java\"\t\\programming");
		System.out.println("Hello\n" + "\"Java\"\t" + "\\programming");

	}
}
