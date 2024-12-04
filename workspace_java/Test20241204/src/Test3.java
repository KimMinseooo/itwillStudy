
public class Test3 {
	public static void main(String[] args) {
		
		Test3 test3 = new Test3();
		try {
			test3.setUserId(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Test3 test4 = new Test3();
		try {
			test4.setUserId("sdfs");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//메서드 호출
	}
	
	public void setUserId(String userId) throws Exception  {
		if(userId == null) {
//			강제로 예외 발생
			throw new IDFormatException("아이디 null");
		} else if (userId.length() < 8 || userId.length() >20) {
//			강제로 예외 발생 "아이디는 8자 이상 20 자 이하로 사용"
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용");
		}
	}
}
