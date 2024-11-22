
public class Test4 {
	public static void main(String[] args) {
//		기본 생성자(Constructor) => 기본 생성자 생략가능
//		1)기본 생성자 : 클래스이름() => 클래스형의 기억장소 할당, 
//		                       초기값 할당(0,0.0,false,null)
//		2)값을 받는 생성자 : 클래스이름(초기값을 전달받아서 저장 변수선언) 
//		기억장소에 전달받은 값을 저장해서 초기값 할당
		
//		기본생성자 호출
//		(생략가능, 생성자가 없으면 기본으로 기본생성자를 만들어줌,
//		생성자가 있으면 기본생성자 만들지 않음)
//		Car c = null;
//		System.out.println(c);
		
		Car c = new Car();
		System.out.println(c.company); //null
		System.out.println(c.model); //null
		System.out.println(c.price); //0
		
//		Student 객체생성
//		멤버변수 출력
		Student s = new Student();
		System.out.println(s.db);
		System.err.println(s.html);
		
//		Person 객체생성
//		멤버변수 출력
		Person p = new Person();
		System.out.println(p.age);

	}
}
