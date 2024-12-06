
public class Test4 {
	public static void main(String[] args) {
		
		int a= (int)3.5; // 3
		double b= 3; // 3.0
//		부모 = 자식 객체생성 => 자동으로 형변환(업캐스팅)
//		자식 = 부모 객체생성 => 명시적으로 형변환(다운캐스팅)
//			=> 자기자신인 자식으로 되돌아감
		
//		session.setAttribute("이름",모든형을 받는 변수(모든형의 부모Object))
//		다운캐스팅 : String 변수 
//        = (String)session.getAttribute("이름")

		//부모 = 부모
		Animal ani = new Animal();
		System.out.println(ani);
		ani.move();
		
		//자식 = 부모 (명시적 형변환 다운캐스팅)
		//Eagle eagle = (Eagle)ani;  => 예외발생
		//eagle.move();
		//java.lang.ClassCastException: 
		//class test.Animal cannot be cast to	class test.Eagle 
		System.out.println("-----------------------");
		
		//부모 = 자식(업캐스팅)
		Animal animal = new Eagle();
		System.out.println(animal);
		animal.move(); // 부모 접근, 재정의 접근
		//animal.moveEagle(); //자식 접근 못함
		
		System.out.println("-----------------------");
		//자식 = 부모(부모 = 자식 업캐스팅) (명시적 형변환 다운캐스팅)
		Eagle eagle = (Eagle)animal;
		eagle.move();
//		eagle.moveEagle();
		
		System.out.println("-----------------------");
		//부모 = 자식 객체생성(업캐스팅)
		
		//Tiger tiger = (다운캐스팅 형변환)(부모 = 자식)
		//move 메서드 호출		
		//moveTiger 메서드 호출
		animal = new Tiger();
		animal.move();
		
		Tiger tiger = (Tiger)animal;
		tiger.move();
		
		System.out.println("-----------------------");
//		Zoo객체생성
//		setAnimal(new Tiger()); 메서드 호출 (업캐스팅)
//		setAnimal(new Eagle()); 메서드 호출 (업캐스팅)
		
		Zoo zoo = new Zoo();
		zoo.setAnimal(new Tiger());
		zoo.setAnimal(new Eagle());
		System.out.println("======================");
//		p.273 다운캐스팅 instanceof연산자
//		instanceof :다운캐스팅 하기전에 원래 자료형 확인
		Animal animal3 = new Animal();
		
		System.out.println(animal3 instanceof Animal);
		System.out.println(animal3 instanceof Eagle);
		System.out.println(animal3 instanceof Tiger);
		
		System.out.println("==================");
		
		Animal animal4 =new Eagle();
		System.out.println(animal4 instanceof Animal);
		System.out.println(animal4 instanceof Eagle);
		System.out.println(animal4 instanceof Tiger);

		System.out.println("==================");
		
		Animal animal5=new Tiger();
		System.out.println(animal5 instanceof Animal);
		System.out.println(animal5 instanceof Eagle);
		System.out.println(animal5 instanceof Tiger);
	}
}
