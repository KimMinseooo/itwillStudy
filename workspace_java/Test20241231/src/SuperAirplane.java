
public class SuperAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPER =2;
	public int flyMode =NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPER) {
			System.out.println("초고속 비행합니다");
		} else {
			super.fly();
		}
	}
}
