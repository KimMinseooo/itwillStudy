
public class Test5 {
	public static void main(String[] args) {
		// 기본생성자 호출
		Car c1 = new Car();
		// 초기값을 받는 생성자 호출
		Car c2 = new Car("기아자동차","K7",2000);
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.price);
		c2.run();
		
		
		Student s1 = new Student(20, "홍길동", 100, 20, 30, 50);
		System.out.println(s1.name);
		System.out.println(s1.db);
		s1.intro();
		
	}
}
