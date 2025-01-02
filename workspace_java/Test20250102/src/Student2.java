
public class Student2 {
	int studentID;
	String studentName;
	Subject subject;
	
	public void prn() {
		System.out.println(studentID+" : "+studentName);
		subject.subjectPrn();
	}
}
