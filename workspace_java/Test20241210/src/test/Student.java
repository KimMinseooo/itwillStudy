package test;

public class Student {
//	멤버변수 name , num
//	생성자 멤버변수 2개의 값을 받는 생성자
	private String name;
	private int num;

	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if (this.num == student.num) {
				return true;
			} else { 
				return false;
			}
		}
		return false;
	}
	
	
	
}
