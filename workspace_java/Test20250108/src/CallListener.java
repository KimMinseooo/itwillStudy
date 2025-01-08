

public class CallListener implements Button.OnClickListener{

//	클래스 CallListener 상속 Button안에 있는 OnClickListener
//	메서드 오버라이딩 onClick() "전화를 겁니다"
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}	
}
