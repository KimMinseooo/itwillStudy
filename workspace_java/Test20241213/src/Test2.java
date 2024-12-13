
public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
//		Test20241122 test.Person 복사해오기
		Person person = new Person(20, "홍길동", "남", false, 0);
		
//		1) Object 클래스 getClass 메서드 사용 
		Class c = person.getClass();
		
		System.out.println(c.getName());
		System.out.println(c);
//		2) 클래스 파일 이름을 Class 변수에 직접 대입
		Class c2 = Person.class;
		System.out.println(c2.getName());
//		3) Class.forName("클래스이름") 메서드 사용
		Class c3 = Class.forName("Person");
		System.out.println(c3.getName());
		System.out.println(c3.getConstructor());
		System.out.println(c3.getMethods());
		System.out.println(c3.getFields());
		// Class 객체생성 메서드 (기본생성자)
//		Person person2 = (Person)c3.newInstance();
		
	}
}
