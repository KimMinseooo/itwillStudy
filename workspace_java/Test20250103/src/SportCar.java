
public class SportCar extends Car{

	@Override
	public void speedUp() {
		speed+=10;
	}
	public void stop() {
		System.out.println("스포츠카 멈춤");
		speed=0;
	}
	
}
