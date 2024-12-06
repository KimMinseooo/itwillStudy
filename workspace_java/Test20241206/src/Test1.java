import com.p1.*;
import com.p2.*;
import com.p3.*;

public class Test1 {
	public static void main(String[] args) {
//		조상 클래스 패키지 p1 할아버지.java
//		메서드 노래하기() 출력 "노래를 한다"
		
//		부모 클래스 패키지 p2 아버지.java 상속 할아버지
//		메서드 일하기() 출력 "일를 한다"
		
//		자식 클래스 패키지 p3 자식.java 상속 아버지
//		메서드 게임하기() 출력 "게임를 한다"
//		노래하기() 메서드 오버라이딩(재정의)
//		"노래를 아주 잘한다"
		
//		자식 클래스 객체생성 메서드 호출()
		
		GrandFather gf = new GrandFather();
		gf.sing();
		System.out.println("=================");
		
		Father f = new Father();
		f.work();
		f.sing();
		System.out.println("=================");
		
		Child c = new Child();
		c.play();
		c.work(); // 코딩을 한다로 바뀜
		c.sing();
		
	}
}
