
public class Test2 {
	public static void main(String[] args) {
		// Person클래스 정의
		// 멤버변수 name, height , weight (float)
		// 메서드() prn() 이름 : , 키 : , 몸무게 :  출력
		
		// 기본생성자 => 생략가능, 다른 생성자가 있으면 만들어줌
		
		
		
		Person p1 = new Person();
		p1.name="홍길동";
		p1.height=188.8F;
		p1.weight=88.8F;
		
		p1.prn();

		Person p2 = new Person("김길동");
		p2.height=177.7F;
		p2.weight=77.7F;
		
		p2.prn();
		
		Person p3= new Person(166.6F,66.6F);
		p3.name="고길동";
		
		p3.prn();
		
		Person p4 = new Person("이길동",155.5F,55.5F);
		p4.prn();
	}
}
