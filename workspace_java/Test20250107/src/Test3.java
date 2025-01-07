

public class Test3 {

	public static void main(String[] args) {
//		인터페이스 RemoteControl
//		멤버변수 => 무조건 객체생성없이 사용하는 상수변수 
//		       => static final 생략가능
//		MAX_VOLUME = 10 초기값
//		MIN_VOLUME = 0 초기값
//		추상메서드 => 무조건 추상메서드만 있음 
//		         => abstract 생략가능
//		리턴값없음 turnOn()
//		리턴값없음 turnOff()
//		리턴값없음 setVolume(int volume)
		
//		클래스 Television 상속(구현) RemoteControl
//		멤버변수 int volume 정의
//		메서드 강제적으로 재정의
//		turnOn() "TV를 켭니다"
//		turnOff() "TV를 끕니다"
//		setVolume(int volume)
//		if volume > MAX_VOLUME 비교 volume = MAX_VOLUME
//		else if volume < MIN_VOLUME 비교 volume = MIN_VOLUME	
//		else volume = volume
//		출력 "현재 TV 볼륨 : volume"
		
//		클래스 Audio 상속(구현) RemoteControl
//		멤버변수 int volume 정의
//		메서드 강제적으로 재정의
//		turnOn() "TV를 켭니다"
//		turnOff() "TV를 끕니다"
//		setVolume(int volume)
//		if volume > MAX_VOLUME 비교 volume = MAX_VOLUME
//		else if volume < MIN_VOLUME 비교 volume = MIN_VOLUME	
//		else volume = volume
//		출력 "현재 Audio 볼륨 : volume"
		
//		부모 = 자식 객체생성 , 메서드 호출
		
		Television television = new Television();
		television.turnOn();
		television.setVolume(7);
		System.out.println(television.volume);
		television.turnOff();
		System.out.println("==============================");
		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolume(11);
		System.out.println(audio.volume);
		audio.turnOff();
		
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setVolume(20);
		remoteControl.turnOff();
		 
		RemoteControl remoteControl2 = new Audio();
		remoteControl2.turnOn();
		remoteControl2.setVolume(20);
		remoteControl2.turnOff();
	}

}
