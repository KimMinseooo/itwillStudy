
public class Cal {
	
	public int plus(int x , int y) {
		return x+y;
	}
	
	public double plus(double x , double y) {
		return x+y;
	}
	
	public int divide(int x, int y) {
		return x/y;
	}
	public double divide(double x, double y) {
		return x/y;
	}
	
//	원의 면적 구하기
	public double areaCircle(double r){
		System.out.println("Cal 객체의 areaCircle() 실행");
		return 3.14 * r * r;
	}
}
