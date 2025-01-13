import java.util.*;
import java.util.stream.*;

public class Test4 {
	public static void main(String[] args) {
//		TravelCustomer 클래스
//		멤버변수 name, age, price 
//		생성자 3개의 멤버변수 값을 받는 생성자
//		getName() , getAge() getPrice() 메서드 정의
//		toString() 메서드 멤버변수 내용 출력
		
		TravelCustomer travelCustomer1 = new TravelCustomer("홍길동", 40, 10000);
		TravelCustomer travelCustomer2 = new TravelCustomer("고길동", 30, 23000);
		TravelCustomer travelCustomer3 = new TravelCustomer("김길동", 26, 54000);
		
		List<TravelCustomer> list = new ArrayList<TravelCustomer>();
		list.add(travelCustomer1);
		list.add(travelCustomer2);
		list.add(travelCustomer3);
		list.stream().map(c -> c.getName())
	     .forEach(s -> System.out.println(s));
		System.out.println("----------------------");
		//20세 이상 고객명단 정렬하여 출력 filter() sorted() forEach()
		//map()  name, age, price 지정
		list.stream().filter(c -> c.getAge() >= 20)
				 .map(c -> c.getName())
				 .sorted()
				 .forEach(s -> System.out.println(s));
		System.out.println("----------------------");
		
		list.stream().filter(c -> c.getAge() >= 20)
				.map(c -> c.getAge())
				.sorted()
				.forEach(s -> System.out.println(s));
		System.out.println("----------------------");
		//총 여행 비용
		int total = list.stream()
			    .mapToInt(c -> c.getPrice())
			    .sum();
		System.out.println("총 여행 비용 : " + total);
	}
}
