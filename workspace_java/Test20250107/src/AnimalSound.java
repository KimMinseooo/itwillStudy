
public class AnimalSound {
	
	public void animalSound(Animal animal) {
		// 추상클래스에서는 instanceof로 굳이 비교를 안해도 된다 .
		animal.sound();
	}
}
