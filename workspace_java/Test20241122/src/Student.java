
public class Student {
	public int num;
	public String name;
	public int java;
	public int db;
	public int jsp;
	public int html;
	
	public int sum() {
		return java + db + jsp + html;
	}
	// 기본생성자
	public Student() {
		
	}
	
	// 입력값을 하나라도 받는 생성자를 만들경우에
	public Student(int num ,String name, int java, int db, int jsp, int html) {
		this.num=num;
		this.name=name;
		this.java=java;
		this.db=db;
		this.jsp=jsp;
		this.html=html;
	}
	
	public void intro() {
		System.out.println("번호 : " + num +" 이름 : "+name);
	}
}
