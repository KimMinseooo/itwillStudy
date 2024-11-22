
public class Test3 {
	public static void main(String[] args) {
//		p152
//		클래스 Person
//		나이, 이름, 성별, 결혼여부, 자녀수
		Person p = new Person();
		p.age=30;
		p.name="홍길동";
		p.gender="Male";
		p.isMarried=false;
		p.child=0;
		
		p.prn();
		System.out.println("=======================================");
		Person p1 = new Person(40,"이미정","Female",true,2);
		p1.prn();
		
		
		System.out.println("=======================================");
		
		Shop s= new Shop();
		s.orderNum=201803120001L;
		s.orderId ="abc123";
		s.orderDate="2018년 3월 12일";
		s.orderName="홍길순";
		s.productNum="PD0345-12";
		s.address="서울시 영등포구 여의도동 20번지";
		
		s.prn();
		
	}
}
