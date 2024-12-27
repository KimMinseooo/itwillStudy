package test;

public class Test6 {
	public static void main(String[] args) {
//		MovieThread 클래스 만들기 Thread 상속 
//		run 메서드 오버라이딩
//		for 1 ~ 3 반복 "동영상을 재생합니다"
//		sleep() 1초 멈춤
		
//		MusicRunnable 클래스 만들기 Runnable 상속
//		run메서드 오버라이딩
//		for 1 ~ 3 반복 "음악을 재생합니다"
//		sleep() 1초 멈춤
		
//		객체생성
		
//		Thread를 상속받는 MovieThread 객체 생성! 
		MovieThread movieThread = new MovieThread();
		
//		Runnable 인터페이스를 상속하기때문에 다시 Thread 객체를 생성해서 거기 안에 넣어야함--> 그렇게 해야 start() 메서드를 사용할수 있음  
//		MusicRunnable musicRunnable = new MusicRunnable();
//		Thread thread = new Thread(musicRunnable);
		Thread thread = new Thread(new MusicRunnable());
		
//		쓰레드 실행
		movieThread.start();
		thread.start();
		
	}
}
