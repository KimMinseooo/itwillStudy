
public class Anonymous {
	Person field = new Person() {
		public void work() {
			System.out.println("출근합니다");
		}
		
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	};
	
	
	public void method1() {
		Person localVar = new Person() {
			public void walk() {
				System.out.println("산책합니다");
			}
			@Override
			public void wake() {
				System.out.println("7시에 일어납니다");
				walk();
			}
		};
		localVar.wake();
	}
	
}
