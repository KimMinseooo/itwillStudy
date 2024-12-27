package test;

public class Test4 {
	public static void main(String[] args) {
		Runnable runnable1 = new MyThread2(10, "A작업");
		Thread thread =new Thread(runnable1);
		thread.start();
		
//		Runnable 익명 구현
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 멀티 쓰레드 처리할 코드
				for(int i=1;i<=5;i++) {
					System.out.println(i+" : "+"B작업");
				}
				
			}
		});
		thread2.start();
		
		Thread thread3= new MyThread(10, "C작업");
		thread3.start();
		
		Thread thread4= new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=5 ;i++) {
					System.out.println(i+" : "+"D작업");
				}
			}
		};
		
		thread4.start();
	}
}
