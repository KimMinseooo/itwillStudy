
public class Test1 {
	public static void main(String[] args) {
//		빌더패턴(Builder  Pattern)
//		: 객체생성 -> 생성자 패턴, 정적 메서드 패턴 , 빌더 패턴 사용
//		: 장점 -> 필요한 데이터만 설정, 유연성 확보, 가독성 높임,
//		 		 변경 최소화
		
		Member member = new Member("kim","p123","김길동",0);
		System.out.println(member);
		
		Member member2 = Member.of("lee","p456","이길동");
		System.out.println(member2);
		
//		Member member3 = new Member.Builder()
//				.id("park")
//				.pass("p789")
//				.name("박길동")
//				.age(10)
//				.build();
		
		Member member3 = new Member.Builder("park")
				.pass("p789")
				.name("박길동")
				.age(10)
				.build();
		System.out.println(member3);
		
	}
}
