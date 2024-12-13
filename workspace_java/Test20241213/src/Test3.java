import java.util.*;

public class Test3 {
	public static void main(String[] args) {
//		컬렉션 프레임워크 => ArrayList 배열
//		프로그램에서 실행할때 데이터를 효율적으로 
//		관리하기 위해 자료구조 사용 => 컬렉션 프레임워크
//		p388 제네릭 => 기억장소 선언할때 형을 명시적으로 지정
		ArrayList<String> arr = new ArrayList<String>();
 		arr.add("일");
// 		arr.add(2); // 에러발생
 		arr.add("이");
 		
 		String a =arr.get(0);
 		String b =arr.get(1);
 		
 		System.out.println(a);
 		System.out.println(b);
// 		기억장소 선언할때 형을 명시하지 않으면 모든형 저장
// 		=> 모든 클래스의 부모인 Object형으로 형변환되면서 저장(업캐스팅)
 		ArrayList arr2 = new ArrayList();
 		arr2.add("일");
 		arr2.add(2);
// 		Object형으로 형변환되어진 => 원래대로 형변환 명시(다운캐스팅)
 		String a2 =(String)arr2.get(0); // (String)Object 
 		int b2 = (int)arr2.get(1);
 		
 		System.out.println(a2);
 		System.out.println(b2);
 		System.out.println("=---------------");
 		for(Object o :arr2) {
 			System.out.println(o);
 		}
//		
		
				
	}
}
