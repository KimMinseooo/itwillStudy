
public class MessageListener implements Button.OnClickListener{
//	클래스 MessageListener 상속 Button안에 있는 OnClickListener
//	메서드 오버라이딩 onClick() "메시지를 보냅니다"
	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다");
	}

}
