
public class Test1 {
	public static void main(String[] args) {
		
	
//		static : 객체생성없이 멤버변수, 메서드() 호출
//      :  static 변수(클래스변수)를  클래스 객체생성 
//	          에서 따로 기억장소 만들지 않고 공통으로 사용
	
//		static 있으면 객체생성없이 멤버변수, 메서드() 호출

		Student.num= 10 ;
		
		Student stu = new Student();
		stu.num++;
		stu.name = "홍길동";
		stu.grade = 1;
		System.out.println(stu.num);
		System.out.println(stu.name);
		System.out.println(stu.grade);
		stu.prn();
		System.out.println("=============");
		Student.prn2();
		Student stu2 = new Student();
		stu2.num++;
		stu2.name="이길동";
		stu2.grade++;
		System.out.println(stu2.num);
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		stu2.prn();
		
//		Math클래스 static 멤머변수
		System.out.println(Math.PI);
//		Math클래스  static 메서드()
		System.out.println(Math.max(10, 20));

	}
}
