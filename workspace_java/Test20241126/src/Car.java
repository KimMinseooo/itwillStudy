
public class Car {
	public String carName; 
	public int speed;
	
	public Car() { 
		carName= "국민차";
		speed = 10;
	}
	
	// 속도 증가 메서드
	public int speedUp (int speed) {
		return this.speed+speed;
	}
	// 속도 감소 메서드 
	public int speedDown (int speed) {
		return this.speed-speed;
	}
}
