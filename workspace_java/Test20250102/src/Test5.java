import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		Student3 student3 = new Student3();
		student3.studentID=3;
		student3.studentName="고길동";
		student3.subjectList= new ArrayList<Subject>();
		Subject subject = new Subject("수학",96);
		student3.subjectList.add(subject);
		Subject subject2 = new Subject("국어",100);
		student3.subjectList.add(subject2);
		student3.prn();
	}
}
