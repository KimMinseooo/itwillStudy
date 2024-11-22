
public class Test2 {
	public static void main(String[] args) {
//		Student 클래스 정의
//		멤버변수 num , name, java ,db , jsp ,html 점수
//		메서드 sum() java, db, jsp , html 점수의 합 구해서 리턴 
//		메서드 intro() "번호: " , "이름 : " 출력
		Student stu = new Student();
		
		stu.num=10;
		stu.name="김민서";
		stu.java=90;
		stu.db=80;
		stu.jsp=70;
		stu.html=60;
		
		stu.intro();
		System.out.println("학생의 점수합계: "+stu.sum());
		System.out.println("학생의 점수평균: "+(double)stu.sum()/4);
		
		Student stu2 = new Student();
		stu2.num=10;
		stu2.name="이길동";
		stu2.java=50;
		stu2.db=70;
		stu2.jsp=100;
		stu2.html=80;
		
		stu2.intro();
		System.out.println("학생의 점수합계: "+stu2.sum());
		System.out.println("학생의 점수평균: "+(double)stu2.sum()/4);
		
	}
}
