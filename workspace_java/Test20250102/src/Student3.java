import java.util.*;

public class Student3 {
	int studentID;
	String studentName;
	List<Subject> subjectList;
	
	public void prn() {
		System.out.println(studentID +" : "+studentName);
		for(Subject subject:subjectList) {
			System.out.println(subject.subjectName+" : "+subject.subjectScore);
		}
	}
}
