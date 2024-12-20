
public class Test1 {
	public static void main(String[] args) {
//		내부 클래스 : 클래스 안에 선언한 클래스 
//				 : 클래스와 클래스 밀접한 관계 
//				 : 인스턴스 내부 클래스, 정적 내부 클래스 
//				 : 지역 내부 클래스 , 익명 내부 클래스
		
//		외부 클래스 객체생성하지 않고 => 내부 클래스 객체 생성
		
		OutClassStatic.InClassStatic inClassStatic = new OutClassStatic.InClassStatic();
	
//		인스턴스 메서드 호출
		inClassStatic.inTest();
		System.out.println("===================================");
//		static 메서드 호출
		OutClassStatic.InClassStatic.sInTest();
	}
}
