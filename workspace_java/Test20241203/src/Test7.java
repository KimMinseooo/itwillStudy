import java.util.*;

import student.*;

public class Test7 {
	public static void main(String[] args) {
//		패키지 student 파일 Student 클래스 정의
//		멤버변수 int num, name 데이터 은닉
//		메서드 set, get 정의

//		패키지 student 파일 StudentDAO 클래스 정의
//		insertStudent(Student를 저장한 배열ArrayList변수 정의) 메서드 정의
//		for 출력
		Student stu1 = new Student(1, "홍길동");
		Subject subject1= new Subject();
		subject1.setName("국어");
		subject1.setScore(90);
		stu1.setSubject(subject1);

		Student stu2 = new Student(2, "김길동");
		Subject subject2 = new Subject();
		subject2.setName("국어");
		subject2.setScore(100);
		stu2.setSubject(subject2);
		
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(stu1);
		studentList.add(stu2);
		
		
		StudentDAO dao = new StudentDAO();
		dao.insertStudent(studentList);
		
		
//		1명 Student 객체생성 set메서드 호출 값 저장 
//		2명 Student 객체생성 set메서드 호출 값 저장
		
//		StudentDAO 객체생성
//		insertStudent() 메서드 호출
	}
}
