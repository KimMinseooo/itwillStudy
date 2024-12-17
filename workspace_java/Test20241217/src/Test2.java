import java.util.*;

public class Test2 {
	public static void main(String[] args) {
//		Map 인터페이스 (키,값) 자료를 쌍 => 이름:홍길동,나이:30,특기:수영
//		- 클래스 Hashtable, HashMap, TreeMap
//		=> put() , get() , isEmpty(), remove()
//		=> 키 : 중복 될 수 없다 
//		=> 값 : 중복 될 수 있음 
//		=> 해시 알고리즘 구현 => 위치계산(해시함수), 자료 추가 , 검색 속도 빠름 
		
//		HashMap 클래스 
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "홍길동");
		hashMap.put(2, "이길동");
		hashMap.put(3, "삼길동");
		hashMap.put(1, "이이이");
//		hashMap.put(0, "영길동");
		System.out.println(hashMap);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
//		hashMap.get(키값) ==> 실행결과 : value값 출력 
		System.out.println(hashMap.get(2));  // 이길동
		System.out.println(hashMap.get(1));  // 홍길동
		System.out.println(hashMap.get(3));  // 삼길동
		
		System.out.println(hashMap);  // {1=홍길동, 2=이길동, 3=삼길동}
		
//		TreeMap 클래스   : Key 값을 기준으로 정렬 !! 
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(5, "오길동");
		treeMap.put(7, "칠길동");
		treeMap.put(6, "육길동");

		System.out.println(treeMap);
		
		System.out.println(treeMap.get(5));
		System.out.println(treeMap.get(7));
		System.out.println(treeMap.get(6));
		
		System.out.println("========================");
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("일길동", 1);
		map.put("삼길동", 3);
		map.put("이길동", 2);
//		{삼길동=3, 이길동=2, 일길동=1}
		System.out.println("여기입니다~~~~~~~~~~~");
		System.out.println(map);
		System.out.println(map.get("삼길동"));
		System.out.println(map.get("일길동"));
		System.out.println(map.get("이길동"));
		
//		이름 : 홍길동 , 나이 : 30세 , 직업 : 회사원 , 취미 : 수영,테니스 
		
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("이름", "홍길동");
		map2.put("나이", "30세");
		map2.put("직업", "회사원");
		map2.put("취미","수영,테니스");
//		{이름=홍길동, 취미=수영,테니스, 나이=30세, 직업=회사원}
		System.out.println(map2);
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("직업"));
		System.out.println(map2.get("취미"));
		
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("이름", "홍길동");
		map3.put("나이", 30);
		map3.put("직업", "회사원");
		map3.put("취미","수영,테니스");
//		
		System.out.println(map3);
		System.out.println(map3.get("이름"));
		System.out.println(map3.get("나이"));
		System.out.println(map3.get("직업"));
		System.out.println(map3.get("취미"));
		
//		회원정보,  게시판 정보 => 조인 => 하나의 공간에 담아서 사용 
		Map<String , Object> map4 = new HashMap<String, Object>();
		map4.put("id", "kim");
		map4.put("name", "김길동");
		map4.put("num", 5);
		map4.put("subject", "제목");
		map4.put("content", "내용");
		map4.put("readcount", 10);
//		
//		System.out.println(map4);
//		System.out.println(map4.get("id"));
//		System.out.println(map4.get("name"));
//		System.out.println(map4.get("num"));
//		System.out.println(map4.get("subject"));
//		System.out.println(map4.get("content"));
//		System.out.println(map4.get("readcount"));
		
		
//		MapTest 객체생성
		MapTest maptest= new MapTest();
//		mapPrn() 메서드 호출
		maptest.mapPrn(map4);
		
	}
}
