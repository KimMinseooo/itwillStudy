
public class Member {

	private String id;
	private String pass;
	private String name;
	private int age ;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}

	public void prn() {
		System.out.println("아이디 : "+id+", 비밀번호 : "+pass+", 이름 : "+name+", 나이 : "+age);
	}
}
