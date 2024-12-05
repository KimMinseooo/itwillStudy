
public class Student extends Person{
	
	public Student() {
		super("홍길동");
		System.out.println("Student 자식 기본생성자");
	}

	
	
	public void studentPrn() {
//		부모의 메서드 호출()
		super.personPrn();
		System.out.println("학생이 공부한다");
	}
	
}
