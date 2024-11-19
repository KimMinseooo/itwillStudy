//폴더(패키지) 폴더이름 test;


//접근제어자 calss 클래이스이름{
//	멤버변수;
//	메서드();
//}

//접근제어자 public : 모든 외부에서 접근할 수 있는 클래스
public class Student {
	// 클래스 : 학생 객체(주제) 정의 
	// 클래스 이름 작성 규칙 
	// - 대문자 시작 (소문자 오류아님, 개발자들 사이의 규칙)
	// - 영문자
	
	//	멤버변수 (학생의 특징을 저장하는 변수)
	// 학생번호 ,학생이름name, 국어점수kor ,영어점수eng , 수학점수math 
	// 접근제어자 자료형 변수명, 선언( 초기값을 자동으로 저장 0, null)
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	// 멤버함수(메서드) => 학생 관련 기능을 정의하는 함수 
//	public 리턴할형 또는 void 함수이름(전달받은 값을 저장하는 변수) {
	
//	}
	
	public void prn() {
		System.out.println("학생 정보 출력");
		return;
	}
	
	// 학생 점수의 합 구해서 리턴 
	public int sum() {
		int s = kor+eng+math;
		return s;
	}
	
}
