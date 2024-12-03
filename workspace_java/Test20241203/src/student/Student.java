package student;


public class Student {

	private int num;
	private String name;
	
	// 학생의 점수를 저장할 Subject클래스 정의
	// 멤버변수 정의
	private Subject subject;
	
	
	
	
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", subject ==> " + subject + "]";
	}


	
	
}
