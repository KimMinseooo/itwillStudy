
public class Student {

	// 멤버변수
//	 num id name grade address
	public static int num;
	public int id;
	public String name;
	public int grade;
	public String address;
	
	// 메서드()
	// static 메서드(클래스 메서드) => static 변수만 사용가능
	public  void prn() {
		System.out.println("번호 : "+num);
		System.out.println("학생의 이름 : " +name);
		System.out.println("학년 : "+grade);
	}
	public static void prn2() {
		System.out.println("번호 : "+num);
//		System.out.println("학생의 이름 : " +name);
//		System.out.println("학년 : "+grade);
	}
}
