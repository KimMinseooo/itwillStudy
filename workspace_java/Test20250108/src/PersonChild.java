
public class PersonChild extends Person{

	public void work() {
		System.out.println("출근합니다");
	}
	@Override
	public void wake() {
		System.out.println("6시에 일어납니다");
		work();
	}
}
