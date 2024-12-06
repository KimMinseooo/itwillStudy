
public class Zoo {
	
//	public void prn(Animal animal) {
//		animal.move();
//	}
	
	public void setTiger(Tiger tiger) {
		tiger.move();
	}
	
	public void setEagle(Eagle eagle) {
		eagle.move();
	}
	
//	모든 동물을 받는 setAnimal(Animal 받는 변수) 메서드 
//	move() 메서드 호출
	public void setAnimal(Animal animal) {
		animal.move();
		
//		instanceof연산자 이용
		if(animal instanceof Tiger) {
//			자식 = animal 업캐스팅된 부모 => 다운캐스팅 Tiger
//			move() 메서드 호출
//			moveTiger() 메서드 호출
			
			Tiger tiger =(Tiger)animal;
			tiger.move();
			tiger.moveTiger();
		} 
		if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.move();
			eagle.moveEagle();
		}
		
		

		
	}
}
