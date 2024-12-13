import java.sql.*;

public class Test1 {
	public static void main(String[] args) throws ClassNotFoundException{
		// p378 Class 클래스
//		클래스 선언 , 클래스 정보를 가져오는 방법
//		1) Object 클래스 getClass() 메서드 사용
		String string =new String();
		Class c = string.getClass();
		System.out.println(c.getName());
		System.out.println(c);
		
//		2) 클래스 파일 이름을 Class 변수에 직접 대입
		Class c2 = String.class;
		System.out.println(c2.getName());
		
//		3) Class.forName("클래스이름") 메서드 사용
		Class c3 = Class.forName("java.lang.String");
		System.out.println(c3);
//		p384 Class.forName()
//		클래스 정보를 프로그램에서 로딩될 때 메모리에 가져옴
//		JDBC 프로그램 안에 
//		=> com 폴더 mysql 폴더 cj폴더 jdbc 폴더 Driver.class 파일 
//		실행 이후에 클래스 로딩이 필요할 경우
//		동적 로딩(dynamic loading) => 오라클, Mysql , MS-SQL 연결 
//		모든 데이터베이스 드라이버를 컴파일 할 필요 없음
//		=> 시스템이 구동할 때 => 데이터베이스드라이버 결정되면 
//		=> 해당 드라이버만 로딩
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		=> 유의점 문자열로 되어있어 문자열이 틀리면 에러 발생
//		=> 실행할때 오류 발생
		
//		Integer - 개념, parseInt(), 오토박싱,언박싱
//		Class - forName() 동적바인딩
		
	}
}
