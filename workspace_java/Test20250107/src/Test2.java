
public class Test2 {
	public static void main(String[] args) {
//		Animal 추상클래스
//		멤버변수 문자열 kind
//		일반 메서드 breathe() "숨을 쉽니다"
//		추상 메서드 sound() 리턴값 없음
		
//		Dog 클래스 Animal 상속
//		Dog 생성자 kind= "포유류"
//		sound 메서드 오버라이딩 "멍멍" 출력
		
//		Cat 클래스 Animal 상속
//		Cat 생성자 kind= "포유류"
//		sound 메서드 오버라이딩 "야옹" 출력
		
		Dog dog = new Dog();
		System.out.println(dog.kind);
		dog.breathe();
		dog.sound();
		System.out.println("===========================");
		
		Cat cat = new Cat();
		System.out.println(cat.kind);
		cat.breathe();
		cat.sound();
		
//		Dog Cat 부모 = 자식 객체생성 => 메서드 호출
		Animal dog2 =new Dog();
		Animal cat2 =new Cat();
		dog2.sound();
		cat2.sound();
		
//		AnimalSound 클래스 정의
//		리턴값 없음 animalSound(Animal animal) 메서드 정의
//		sound() 메서드 호출
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		AnimalSound 객체생성 => animalSound 메서드 호출
		AnimalSound animalSound = new AnimalSound();
		animalSound.animalSound(dog2);
		animalSound.animalSound(cat2);
		
	}
}
