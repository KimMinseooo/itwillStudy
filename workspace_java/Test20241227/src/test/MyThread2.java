package test;

public class MyThread2 implements Runnable{

//	멤버변수 => 정수형 count, 문자열 data
	private int count;
	private String data;
//	생성자 => count, data 받는 생성자
	public MyThread2(int count,String data) {
		this.count = count;
		this.data = data;
	}
	@Override
	public void run() {
		// 멀티 쓰레드 처리할 코드
		for(int i = 1; i <= count; i++) {
//			출력문을 0.5초마다 실행
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + ":" + data);
		}
	}
}
