
public class Student {
	//멤버변수 : 데이터 은닉 -> 외부에서 접근 못하게 막음
//			private 접근 지정자를 이용
	private int num;
	private String name;
	private int java;
	private int db;
	private int jsp;
	private int html;
	
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

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public void intro() {
		System.out.println("번호 : "+num);	
		System.out.println("이름 : "+name);
	}
	
	public int sum() {
		return java+jsp+db+html;
	}
}
