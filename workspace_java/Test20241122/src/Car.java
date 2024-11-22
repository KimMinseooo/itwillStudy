
public class Car {
	public String company;
	public String model;
	public int price;
	
	//생성자 생략 : 기억장소 할당, 초기값 할당
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	// 값을 전달 받는 생성자
	public Car(String company, String model, int price) {
//		지역변수, 매개변수 company, model, price
//		멤버변수 = 지역변수;
//		멤버변수 c.company , c.model , c.price
//		Car 안에 정의된 멤버변수 Car 속해있는 클래스.company
//		this. 자기자신클래스, Car 속해있는 클래스
//		this.company;
		
		this.company=company;
		this.model=model;
		this.price=price;
	}
	public void run() {
		System.out.println(company+"회사의 "+model+"모델의 "+"차가 달린다.");
		System.out.println("가격은 "+price+"원임......");
	}
}
