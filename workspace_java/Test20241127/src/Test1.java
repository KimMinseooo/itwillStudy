
public class Test1 {
	
	public static void main(String[] args) {
	
//		데이터 은닉, 캡슐화
//		: 데이터를 저장하는 공간인 멤버변수의 접근을
//		  클래스 내에서만 접근하고 외부에는 접근 못하게 설정
//		: 외부에서 멤버변수 접근할 수 있는 메서드 준비해서 사용
//		
//		p162 접근지정자
//			- public  : 모두접근, 같은 클래스 내 , 같은 폴더, 다른폴더
//			- protected : 같은 클래스 내 , 같은 폴더 , 다른 폴더 (상속관계) 접근
//			- default(생략) : 같은 클래스 내 , 같은 폴더 접근
//			- private : 같은 클래스 내 접근 => 데이터 은닉 
		
		Student student = new Student();
//		student.num =1;
//		student.name = "홍길동";
//		student.java= 100;
//		student.jsp = 95;
//		student.db= 90;
//		student.html = 85; 
		
//		System.out.println(student.num);
//		System.out.println(student.name);
//		System.out.println(student.java);
//		System.out.println(student.jsp);
//		System.out.println(student.db);
//		System.out.println(student.html);
//		
		student.setNum(1);
		student.setName("홍길동");
		student.setJava(100);
		student.setJsp(95);
		student.setDb(90);
		student.setHtml(85);
		
		System.out.println(student.getNum());
		System.out.println(student.getName());
		System.out.println(student.getJava());
		System.out.println(student.getJsp());
		System.out.println(student.getDb());
		System.out.println(student.getHtml());
		
		
		
		student.intro();
		System.out.println(student.sum());
		
	}
}
