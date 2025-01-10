
public class Button {
//	멤버변수
	OnClickListener listener;
//	set메서드
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
//	touch() 메서드
	public void touch() {
		listener.onClick();
	}
//	내부 인터페이스
	static interface OnClickListener{
		void onClick();
	}
	
}
