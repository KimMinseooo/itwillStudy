
/**
 * 
 */
public class Member {
	private String id;
	private String pass;
	private String name;
	
	
	
	public Member(String id, String pass, String name) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
	}
	
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
	
	@Override
	public String toString() {
		return "[아이디 : " + id + ", 비밀번호 : " + pass + ", 이름 : " + name + "]";
	}

	
}
