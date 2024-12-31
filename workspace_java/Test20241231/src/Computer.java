
public class Computer extends Cal{

	@Override
	public double areaCircle(double r) {
		System.out.println(super.areaCircle(10));
		
		return Math.PI * r * r;
	}
	
	
}
