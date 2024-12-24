
public class Member {
	private String id;
	private String pass;
	private String name;
	private int age;
	
//	생성자
	public Member(String id, String pass, String name, int age) {
		this.id=id;
		this.pass=pass;
		this.name=name;
		this.age=age;
	}

//	Builder 받는 생성자
	public Member(Builder builder) {
		this.id=builder.id;
		this.pass=builder.pass;
		this.name=builder.name;
		this.age=builder.age;
	}

//	정적 메서드 패턴
//	리턴할형 Member 함수이름of(id,pass,name) Member 객체 생성 리턴
	public static Member of(String id, String pass, String name ) {
		return new Member(id,pass,name,0);
	}
	
//	빌더 패턴 사용 => 정적 내부 클래스 Builder
	public static class Builder {
//		매개변수 (기본값 설정) 
		private String id ="";
		private String pass ="";
		private String name ="";
		private int age= 0;

//		Builder 생성자 : 필수 매개변수를 초기화
		public Builder(String id) {
			this.id = id;
		}
		
//		Builder set메서드(리턴 Builder) 
//		public Builder id(String id) {
//			this.id = id;
//			return this;
//		}
		
		public Builder pass(String pass) {
			this.pass = pass;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Member build() {
			return new Member(this);
		}
		
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
