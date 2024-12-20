
public class OutClassMethod {
//	외부 클래스 메서드 안에 클래스 정의 사용 
//	지역 내부 클래스 정의
	
	private int outNum = 10;
	private static int sNum = 20;
	
//	메서드 
	Runnable getRunnable(int i) {
		// 지역변수
		int num = 100;	
//		지역 내부 클래스
		class MyRunnable implements Runnable{
			int localNum = 10;    // 멤버변수
//			Runnable 인터페이스를 재정의한 메서드 
			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
				System.out.println("OutClassMethod.sNum = " + sNum);
			}
			
		}
		return new MyRunnable();
	}
	
	
}
