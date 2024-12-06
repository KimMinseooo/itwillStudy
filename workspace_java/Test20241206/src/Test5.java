import java.util.*;

public class Test5 {
	public static void main(String[] args) {
//		부모 Shape = 자식 Circle 객체 생성 => 업캐스팅
		Shape shape = new Circle();
		shape.prn();
//		자식 = 업캐스팅된 부모 객체생성 => 다운캐스팅
		Circle circle = (Circle)shape;
//		prn() 메서드 호출
//		tri.prn();
		
//		School school = new School();
//		school.draw(cir);
		
//		배열에 특정한 형을 저장(제네릭타입)
		ArrayList<Circle> arr = new ArrayList<Circle>();
		
		arr.add(circle);
		Circle circle2 = arr.get(0);
		circle2.prn();
		System.out.println("======================");
//		배열에 모든형을 저장
		ArrayList arr2 = new ArrayList();
		arr2.add(1);
		arr2.add("안녕");
		arr2.add(new Circle());
//		자식 = 업캐스팅된 부모 => 다운캐스팅
		Integer integer = (Integer)arr2.get(0);
		String hello = (String)arr2.get(1);
		Circle cir = (Circle)arr2.get(2);
		System.out.println(integer);
		System.out.println(hello);
		cir.prn();
	}
}
