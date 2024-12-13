import java.util.*;

public class Test4 {
	public static void main(String[] args) {
//		p404 컬렉션 프레임워크
//		자료구조 : 기억장소(메모리) 구조 
//			   : 프로그램 실행 중 메모리에 자료를 유지 관리하기 위해 사용
		
//		java.util 패키지 : 자바에서 필요한 자료구조 만들어 놓음
//		=> 컬렉션 프레임워크(collection framework)
//		=> 자바 내장 객체 (자료 구조) 
//		Collection 인터페이스 (배열)
//		=> 추상메서드() size(), add() , clear() ,....
//		- List 인터페이스 - 클래스 ArrayList, Vector, linkedList
//		=> 순차적으로 자료를 관리
//		- Set 인터페이스 - 클래스 HashSet, TreeSet
//		=> 집합 (순서없음, 중복 허용 안함)
		
//		Map 인터페이스 (키,값) => 이름:홍길동,나이:30,특기:수영
//		- 클래스 Hashtable, HashMap, TreeMap
//		=> put() , get() , isEmpty(), remove()
		
//		List 부모인터페이스 = ArrayList 자식클래스(추상화,업캐스팅,다형성)
//		처음 기억장소 10개 할당 => 추가되면 10개씩 추가 
		List<String> strList = new ArrayList<String>();
		strList.add("이순신");
		strList.add("유관순");
		strList.add("강감찬");
		strList.add("이성계");
		
		for(int i=0; i<strList.size();i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("=========================");
		for(String str : strList) {
			System.out.println(str);
		}
		System.out.println("-------------------");
		
//		Vector : 처음에는 기억장소 10개 지정 => 추가할떄 크기 지정
		Vector<Integer> vec = new Vector<Integer>();
		List<Integer> list2 =new Vector<Integer>();
		vec.add(120);
		vec.add(130);
		vec.add(140);
		vec.add(150);
		System.out.println("배열크기 : "+vec.size());
		System.out.println(vec.get(0));
		System.out.println(vec.get(1));
		System.out.println(vec.get(2));
		System.out.println(vec.get(3));
		
		for(int a : vec) {
			System.out.println(a+"~~~");
		}
		
//		배열 : 생성할떄 용량 지정, 추가 용량 늘려서 사용 
//		링크드 리스트 : 요소가 추가될때 동적으로 요소의 메모리 생성
		LinkedList<String> linkedList= new LinkedList<String>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		System.out.println(linkedList);
//		중간 삽입
		linkedList.add(1,"D");
		System.out.println(linkedList);
		
//		Iterator : 다양한 자료구조의 내용을 받아서 사용 
		Iterator<Integer> it = vec.iterator();
//		hasNext() 데이터 있으면 true/false
//		next() 다음 데이터 접근
		while(it.hasNext()) {
			int data = it.next();
			System.out.println(data);
		}
		Iterator<Integer> it2 = list2.iterator();
		while(it2.hasNext()) {
			int x= it2.next();
			System.out.println(x);
		}
		
		Iterator<String> linkedIt = linkedList.iterator();
		while(linkedIt.hasNext()) {
			String a = linkedIt.next();
			System.out.println(a);
		}
		
	}
}
