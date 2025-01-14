abstract class vehicle {
	private String name;

	abstract public String getName(String val);

	public String getName() {
		return "vehicle name:" + name;
	}

	public void setName(String val) {
		name = val;
	}
}

class Car extends vehicle {
	public Car(String val) {
		setName(val);
	}

	public String getName(String val) {
		return "Car name : " + val;
	}

	public String getName(byte val[]) {
		return "Car name : " + val;
	}
}

public class Test3 {
	public static int r1() {
		return 4;
	}

	public static int r10() {
		return (30 + r1());
	}

	public static int r100() {
		return (200 + r10());
	}

	public static void main(String[] args) {
		// 2020년 3회 정보처리기사 실기 기출 문제
		// 2번
		int i = 0;
		int c = 0;
		while (i < 10) {
			i++;
			c *= i; // c = c * i;
		}
		System.out.printf("%d", c);
		// 0 결과값
		System.out.println();
		System.out.println("----------------");
		// 13번 메서드 호출()
		System.out.printf("%d\n", r100());
//		return 0;
		// 234 결과값
		System.out.println();
		System.out.println("----------------");
		// 15번 추상클래스,추상메서드, 상속 , 생성자, 메서드 오버로딩
		vehicle obj = new Car("Spark");
		System.out.println(obj.getName());
		// vehicle name:Spark 결과
		System.out.println();
		System.out.println("----------------");
		// 17번 while continue % 짝수의 합
		
		
	}

}
