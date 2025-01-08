
public class Test2 {

	public static void main(String[] args) {
		//클래스 Button
		// 안에 인터페이스 OnClickListener
		
//		클래스 CallListener 상속 Button안에 있는 OnClickListener
//		메서드 오버라이딩 onClick() "전화를 겁니다"

//		클래스 MessageListener 상속 Button안에 있는 OnClickListener
//		메서드 오버라이딩 onClick() "메시지를 보냅니다"	
		
//		Button객체생성
		Button button = new Button();
//		setListener(new CallListener) 메서드 호출
		button.setListener(new CallListener());
//		touch()메서드 호출
		button.touch();
//		setListener(new MessageListener) 메서드 호출
		button.setListener(new MessageListener());
//		touch()메서드 호출
		button.touch();
	}

}
