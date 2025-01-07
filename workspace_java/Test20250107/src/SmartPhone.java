
public class SmartPhone extends Phone{

	
	public SmartPhone(String owner) {
		super(owner);
	}
	@Override
	public void sound() {
		System.out.println("벨 소리가 울린다");
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
	
}
