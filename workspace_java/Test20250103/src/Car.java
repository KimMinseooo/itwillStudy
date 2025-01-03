
public /* final */ class Car {
	/* final */ int speed =0;
	
	public void speedUp() {
		speed++;
	}
	
	public /* final */ void stop() {
		System.out.println("차를 멈춤");
		speed=0;
	}
}
