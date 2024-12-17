
public class Student extends Person{
	private int num;
	
	
	public Student() {
	}
	
	public Student(int num) {
		super();
		this.num = num;
	}

	


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void prn2() {
		System.out.println(num+" : "+super.getName());
	}
}
