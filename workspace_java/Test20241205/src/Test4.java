
public class Test4 {
	public static void main(String[] args) {
		
//		부모클래스 Animal
//		메서드 move() 출력 "동물이 움직인다"
		
//		자식 클래스 Tiger 상속 Animal
//		메서드 moveTiger() 출력 "호랑이 네 발로 움직인다"
		
//		자식 클래스 Eagle 상속 Animal
//		메서드 moveEagle() 출력 "독수리 날개로 움직인다"
	
//		Tiger 객체생성
//		moveTiger() 메서드 호출
		
//		메서드 오버라이딩(메서드 재정의)
		
		Animal a= new Animal();
		a.move();
		
		Tiger t = new Tiger();
		t.move();
//		t.moveTiger();
//		Eagle 객체생성
//		moveEagle() 메서드 호출
		Eagle e= new Eagle();
		e.move();
//		e.moveEagle();
	}
}
