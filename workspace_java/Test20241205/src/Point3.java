
public class Point3 extends Point2{

	private int z ;
//	Point3 클래스 정의 Point2 상속
//	멤버변수 private int z
//	public set, get메서드
//	메서드() public prn3() x,y,z 출력

	
//	생성자 x,y,z 를 받는 생성자
	public Point3(int x, int y,int z) {
		super(x, y);
		this.z=z;
		
		System.out.println("생성자 "+x+","+y+","+z+"를 받는 Point3 생성자");		
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	// 상속관계 private (클래스 내 ) 접근 못함
	// => public (모두접근) , 생략 package(같은폴더)
	// => protected(상속관계)
	public void prn3() {
		System.out.println(x + " , " + y + " , "+z);
	}
}
