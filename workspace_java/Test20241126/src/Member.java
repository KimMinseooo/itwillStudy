
public class Member {
	public String id;
	public String pass;
	public String name;
	public int age ;
	
	
	public Member() {
		this("kim","111","김",20);
	}
	
//	생성자 오버로드(생성자 이름은 동일하고, 받는 변수 다름 ) 
//	받는 변수 다름 => 형이 틀림 , 개수 틀림 , 개수 같을때 형이 틀림.	
	
	public Member(String id, String pass, String name, int age) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
	}
	
	public void prn() {
		System.out.println("아이디 : "+id+", 비밀번호 : "+pass+", 이름 : "+name+", 나이 : "+age);
	}
}
