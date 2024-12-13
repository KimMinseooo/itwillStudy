
public class Person {
	public int age;
	public String name;
	public String gender;
	public boolean isMarried;
	public int child;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(int age,String name, String gender,boolean isMarried,int child  ) {
		this.age=age;
		this.name=name;
		this.gender=gender;
		this.isMarried=isMarried;
		this.child=child;
	}
	
	
	
	public void prn() {
		System.out.println("이 사람의 나이 : "+age);
		System.out.println("이 사람의 이름 : "+name);
		System.out.println("이 사람의 성별 : "+gender);
		if(isMarried) {
			System.out.println("이 사람의 결혼 여부 : 결혼했음");
		}else {
			System.out.println("이 사람의 결혼 여부 : 결혼안했음");
		}
		System.out.println("이 사람의 자녀 수 : "+child);
	}
}
