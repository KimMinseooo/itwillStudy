package test;

public class Test2 {

	public static void main(String[] args) {
//		멀티 쓰레드(Multi Thread)
//		- 하나의 프로세스 내에 두 가지 이상의 작업 동시에 처리
//		- 실제로 동시에 수행하는 것은 아니고,
//		  CPU가 빠른 속도로 여러 작업을 번갈아가면서 수행
//		- 여러 작업을 번갈아가며 수행하는 방식
//		- 처리 작업 순서는 고정이 아니고 변동됨
		
//		멀티 쓰레드 구현방법
//		1) java.lang.Thread 클래스 상속 받아서 사용
//		  - Thread 상속
//		  - Thread run() 메서드 오버라이딩
//		  - Thread 상속 받은 클래스 객체생성
//		  - run() 호출하지 않고 start() 메서드 호출하면 run() 내용 수행
//		    멀티 스레드 시작
		
//		2) java.lang.Runnable 인터페이스 상속 받아서 사용
		System.out.println("main() 시작");
		
//		MyThread 클래스 만들기
//		객체생성 1,2,3 개
		MyThread myThread1 = new MyThread(10, "A작업");
		MyThread myThread2 = new MyThread(5, "B작업");
		MyThread myThread3 = new MyThread(10, "C작업");
		
//		run() 메서드 호출 => 멀티 쓰레드 동작 안함
//		myThread1.run();
//		myThread2.run();
//		myThread3.run();
		
		for(int i=1 ; i<=10;i++) {
			System.out.println(i+" : "+"main작업");
		}
		
		
		
//		멀티 쓰레드 시작 => start() 호출
		myThread1.start();
		myThread2.start();
		myThread3.start();
		
		System.out.println("main() 끝");

	}

}
