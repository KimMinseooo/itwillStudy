import student.*;

public class Test9 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		System.out.println("프로그램 시작");
		try {
			// 예기치 못한 오류 발생 가능성이 높은 코드(명령)
			System.out.println(a / b); 
		}catch(Exception e) {
			// 예외가 발생하면 처리 작업
			System.out.println("0으로 나눔");
		}
		System.out.println("프로그램 끝");
		
		System.out.println("프로그램 시작 ");
		Student student = null;
//		예외발생 가능성이 높은 명령 => 자바예외처리 구문
		try {
			
			System.out.println(student.getName());
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("구문 오류");
		}
		
		System.out.println("프로그램 끝");
	}
}
