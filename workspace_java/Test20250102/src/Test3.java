
public class Test3 {
	public static void main(String[] args) {
//		Student 클래스 정의
//		멤버변수 int studentID, studentName,
//		int koreaScore, int mathScore;
		
		Student student = new Student();
		student.studentID=1;
		student.studentName="홍길동";
		student.koreaScore=100;
		student.mathScore=100;
		student.prn();
	}
}
