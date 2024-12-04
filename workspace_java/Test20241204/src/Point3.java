import point.*;

public class Point3 extends Point2{
	private int z ;

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
