

public class Point2 {
	
//	private int x; 
//	private int y;
	
//	int x; 
//	int y;
	
	protected int x; 
	protected int y;
	
	public void prn2() {
		System.out.println(x + " , " + y);
	}
	// 생성자 x,y를 받는 생성자
	// 출력 "생성자 x,y를 받는 생성자"
	// 멤버변수 = 받는 값 저장 
	
	public Point2(int x , int y ) {
		this.x=x;
		this.y=y;
		
		System.out.println("생성자 "+x+","+y+"를 받는 Point2 생성자");
	}
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
