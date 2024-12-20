
public class Test3 {
	public static void main(String[] args) {
		
		OutClassMethod2 classMethod2 = new OutClassMethod2();
		Runnable runnable = classMethod2.getRunnable(10);
		runnable.run();
		
//		익명 클래스 변수
		classMethod2.runnable.run();
	}
}
