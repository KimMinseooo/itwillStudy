
public class Test2 {
	public static void main(String[] args) {
		
		// 문제2
		
		char ch ='0';
		
		if(ch >='A' && ch<='Z') {
			System.out.println(ch+" : 대문자");
		} else if (ch >='a' && ch<='z' ) {
			System.out.println(ch+" : 소문자");
		} else if (ch >='0' && ch<='9') {
			System.out.println(ch+" : 숫자");
		} else {
			System.out.println(ch+" : 기타 문자");
		}
		
	}
}
