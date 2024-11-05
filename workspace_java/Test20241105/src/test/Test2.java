package test;

public class Test2 {
	public static void main(String[] args) {
		// 조건문 switch ~ case 문
		// 1) if 유사 , if(조건) => switch 구문에 조건 포함
		// 2) if 달리 조건식 정수값, 문자열 결과값 비교 
//		순위 1이면 "java"
//		순위 2이면 "C"
//		순위 3이면 "html"
//		나머지 "순위 없음"
		
		int rank =1; 
		
		if (rank == 1) { 
			System.out.println("java");
		} else if (rank ==2 ) {
			System.out.println("C");
		} else if (rank ==3 ) {
			System.out.println("html");
		} else { 
			System.out.println("순위 없음");
		}
		
		switch(rank) {
		case 1: System.out.println("java");
			break;
		case 2: System.out.println("C");
			break;
		case 3: System.out.println("html");
			break;
		default: System.out.println("순위 없음");
			break;
	
		}
		
		
		//1 "월요일", 2 "화요일", 3 "수요일" , ... 7 "일요일"
		// 나머지 "요일아님"
		
		int num = 5; 
		switch(num) {
		case 1 : System.out.println("월요일");
			break;
		case 2 : System.out.println("화요일");
			break;
		case 3 : System.out.println("수요일");
			break;
		case 4 : System.out.println("목요일");
			break;
		case 5 : System.out.println("금요일");
			break;
		case 6 : System.out.println("토요일");
			break;
		case 7 : System.out.println("일요일");
			break;
		default : System.out.println("요일 아님");
			break;
		}
		
		// ch 'K' "KOREA" 출력 , 'U' "USA" 출력 , 'C' "CANADA" 출력
		// default 생략가능
		char ch ='C';
		
		switch(ch) {
		case 'K' : System.out.println("KOREA");
			break;
		case 'U' : System.out.println("USA");
			break;
		case 'C' : System.out.println("CANADA");
			break;
		default : break;
		
		}
		
		// medal "Gold" "금메달" 출력 , "Silver" "은메달" cnffur
		// "Bronze" "동메달" 출력, 나머지 "메달없음" 출력
		String medal ="Bronze";
		
		switch(medal) {
		case "Gold" : System.out.println("금메달");
			break;
		case "Silver" : System.out.println("은메달");
			break;
		case "Bronze" : System.out.println("동메달");
			break;
		default : System.out.println("메달없음");
			break;
		}
		
		int jumsu = 90 ; 
		// 100 ,99~90 'A' 출력, 89~80 'B' 출력, 79~70 'C' 출력 
		// 69~ 60 'D' 출력 나머지 'F' 출력
		
		
		switch(jumsu/10) {
		case 9 : System.out.println('A'); break;
		case 8 : System.out.println('B'); break;
		case 7 : System.out.println('C'); break;
		case 6 : System.out.println('D'); break;
		default : System.out.println('F'); 
		}
		
		
		
	}
}
