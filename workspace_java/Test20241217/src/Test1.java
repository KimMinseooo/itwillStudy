import java.util.*;

public class Test1 {
	public static void main(String[] args) {
//		p423
//		Collection 인터페이스 (배열)
//		=> 추상메서드() size() , add() ,clear() .....
//		- List 인터페이스 - 클래스 ARrayList, Vector, linkedList
//		=> 순차적으로 자료를 관리
//		- Set 인터페이스 - 클래스 HashSet , TreeSet
//		=> 집합(순서없음, 중복 허용 안함)
		
//		HashSet 클래스
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("홍길동");
		hashSet.add("이길동");
		hashSet.add("홍길동");
		hashSet.add("삼길동");
		
		System.out.println(hashSet); // [홍길동, 삼길동, 이길동]
		
		for(String s : hashSet) {
			System.out.println(s);
		}
		
		System.out.println("=======================");
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		TreeSet 클래스 : 중복 없는 데이터 , 순서 없는 데이터 
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍박사");
		treeSet.add("이박사");
		treeSet.add("강박사");
		treeSet.add("홍박사");
		treeSet.add("가박사");
		
		System.out.println(treeSet);
		
		for(String tree : treeSet) {
			System.out.println(tree);
		}
		
		Iterator<String> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		TreeSet<Integer> asd = new TreeSet<Integer>();
		asd.add(100);
		asd.add(50);
		asd.add(1);
		asd.add(500);
		
		System.out.println(asd);
	}
}
