package test;
	
public class Test3 {
	public static void main(String[] args) {
//		2) java.lang.Runnable 인터페이스 상속 받아서 사용
//		  - run() 메서드 오버라이딩
//		  - Thread 생성자
//		    (인터페이스 상속 받은 클래스 객체생성) 객체생성
//		  - start() 멀티 쓰레드 실행
		
//		MyThread2 클래스 만들기
//		객체생성
//		MyThread2 myThread1 = new MyThread2(10, "A작업");
//		MyThread2 myThread2 = new MyThread2(5, "B작업");
//		MyThread2 myThread3 = new MyThread2(10, "C작업");
//		멀티 쓰레드 시작 => start() 메서드 없음(Runnable start() 메서드 없음)
//		myThread1.start();
//		myThread2.start();
//		myThread3.start();
		
		Thread thread1 = new Thread(new MyThread2(10, "A작업"));
		Thread thread2 = new Thread(new MyThread2(5, "B작업"));
		Thread thread3 = new Thread(new MyThread2(10, "C작업"));
		
		//멀티 쓰레드 시작
		thread1.start();
		thread2.start();
		thread3.start();
		

	}
}
