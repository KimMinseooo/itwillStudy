
public class Person {
	
	private String name;
	private int age;
	
	
	public Person() {
//		자기자신 생성자 호출
		this("이름", 1);
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	
//	메서드 오버로딩 : 클래스내에서 메서드 이름 동일 같은 메서드로 인식
//    : 메서드 매개변수 개수, 형이 틀리면 
//    : 메서드 이름이 같아도 다른 메서드라고 인식

	
	public void prn() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : 만"+age+"세");
	}
	
	public void prn(String name) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : 만"+this.age+"세");
	}
	
	public void prn(int age) {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : 만"+age+"세");
	}	
	
	public void prn(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : 만"+age+"세");
	}

}
