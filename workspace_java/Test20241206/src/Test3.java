
public class Test3 {
	public static void main(String[] args) {
//		부모 = 자식 객체생성(업캐스팅 : 부모형으로 자동형변환)
//		메서드오버라이딩 된 메서드호출() => 다형성 적용
//		: 부모의 참조변수, 오버라이딩메서드 동일
//		: 자식이 재정의한 메서드 구현 내용 다양함
		
//		Tiger 업캐스팅 객체생성
//		메서드호출()
		
//		Eagle 업캐스팅 객체생성
//		메서드 호출
		
		Animal tiger = new Tiger();  //업캐스팅
		tiger.move();
		
		Animal eagle = new Eagle();
		eagle.move();
		System.out.println("~~~~~~~~~~");
		
		Tiger t1 = new Tiger();
		Eagle e1 = new Eagle();
//		Zoo동물원 클래스 정의
		
		Zoo zoo = new Zoo();
		zoo.setTiger(t1);
		zoo.setEagle(e1);
		
		System.out.println("==================");
		zoo.setAnimal(tiger);
		zoo.setAnimal(eagle);
	}
}
