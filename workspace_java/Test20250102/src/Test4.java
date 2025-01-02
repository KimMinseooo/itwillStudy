
public class Test4 {
	public static void main(String[] args) {
		
		Student2 student2= new Student2();
		student2.studentID=1;
		student2.studentName="홍길동";
		student2.subject= new Subject();
		student2.subject.subjectName="수학";
		student2.subject.subjectScore=100;
		student2.prn();
		
		
	}
}
