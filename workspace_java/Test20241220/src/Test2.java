
public class Test2 {
	public static void main(String[] args) {
//		외부 클래스 객체생성
		OutClassMethod outClassMethod  =new OutClassMethod();
//		메서드 호출 => 지역클래스 객체생성 리턴
		Runnable runnable = outClassMethod.getRunnable(10);
		
//		객체생성 리턴 받은 메서드 호출 
		runnable.run();
	}
}


