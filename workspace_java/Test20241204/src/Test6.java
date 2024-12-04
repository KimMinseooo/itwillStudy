
public class Test6 {
	public static void main(String[] args) {
		
//		접근제어자 public protected default(package) private
//		protected : 같은 클래스, 같은 폴더, 다른 폴더 중에 상속 관계 접근가능
		
//		Point2 클래스 정의 
//		멤버변수 protected int x, int y    set,get 메서드 
//		메서드() prn2() x,y 출력
		
//		Point3 클래스 정의 Point2 상속 
//		멤버변수 int z
		
		Point3 p3 = new Point3();
		
		p3.setX(100);
		p3.setY(50);
		p3.setZ(200);
		
		p3.prn2();
		p3.prn3();
		
//		Test3에서 Point3을 필요(의존)로 해서 객체생성 => 의존관계
		Point3 point3 = new Point3();
//		point3.x = 10; 다른폴더, 상속관계 아님 , protected 변수 접근 못함
		point3.setX(10); //public Point2
		point3.setY(20); //public Point2
		point3.setZ(30); //public Point3
		
		point3.prn2();   // public Point2
		point3.prn3();   // public Point3
	}
}
