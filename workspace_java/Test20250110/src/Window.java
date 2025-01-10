
public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener =new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};
	
	
	public Window() {
		button1.setListener(listener);
		button2.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다");
			}
		});
	}
	
}