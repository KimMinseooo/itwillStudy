import java.awt.*;
import java.util.*;

public class OutClassMethod2 {
//	클래스 이름을 사용하지 않는 클래스 정의 사용 
//	익명 내부 클래스 정의
	private int outNum =10;
	private static int sNum = 20 ;
	
	Runnable getRunnable(int i) {
		// 지역변수
		int num = 100;	
//		지역 내부 클래스
		
//		return new MyRunnable();
		return new Runnable() {
			int localNum = 10;    // 멤버변수
//			Runnable 인터페이스를 재정의한 메서드 
			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
//				System.out.println("OutClassMethod.sNum = " + sNum);
			}
			
		};
	} // 메서드 끝 
	
	// 익명 내부 클래스 => 변수에 대입 
//	자바 UI 이벤트 , 안드로이드 위젯 (UI) 이벤트 활용
	
	Runnable runnable = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable 구현된 익명 클래스 ");
		}
	};
			
	Button btn = new Button();
	
	
	
	
}
