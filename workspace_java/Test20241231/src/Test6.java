
public class Test6 {
	public static void main(String[] args) {
//		메서드 오버로딩
//		Cal 클래스
//		plus(int x, int y) 메서드 리턴 두수 합을 리턴
//		plus(double x, double y) 메서드 리턴 두수 합을 리턴
//		divide(int x, int y)메서드 리턴 두수 나눈값을 리턴
//		divide(double x ,double y)메서드 리턴 두수 나눈값을 리턴
		
		Cal cal = new Cal();
		System.out.println(cal.plus(3, 5));
		System.out.println(cal.plus(3.5, 2.3));
		
		System.out.println(cal.divide(5, 3));
		System.out.println(cal.divide(5.0, 3));
	}
}
