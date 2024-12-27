package test;

public class MyThread extends Thread{

//	멤버변수 => 정수형 count, 문자열 data
	private int count;
	private String data;
//	생성자 => count, data 받는 생성자
	public MyThread(int count,String data) {
		this.count = count;
		this.data = data;
	}
//	메서드 오버라이딩
	@Override
	public void run() {
		// 멀티 쓰레드 처리할 코드
		for(int i = 1; i <= count; i++) {
			System.out.println(i + ":" + data);
		}
	}
	
	
}
