import java.util.*;

public class Test4 {
	public static void main(String[] args) {
//		회원정보 , 게시판 정보 => 조인 => 하나의 공간에 담아서 사용
		Map<String , Object> map1 = new HashMap<String, Object>();
		map1.put("id", "kim");
		map1.put("name", "김길동");
		map1.put("num", 5);
		map1.put("subject", "제목5");
		map1.put("content", "내용5");
		map1.put("readcount", 10);
		
		Map<String , Object> map2 = new HashMap<String, Object>();
		map2.put("id", "kim");
		map2.put("name", "김길동");
		map2.put("num", 10);
		map2.put("subject", "제목10");
		map2.put("content", "내용10");
		map2.put("readcount", 20);
		
		Map<String , Object> map3 = new HashMap<String, Object>();
		map3.put("id", "kim");
		map3.put("name", "김길동");
		map3.put("num", 15);
		map3.put("subject", "제목15");
		map3.put("content", "내용15");
		map3.put("readcount", 25);
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		System.out.println(list);
		// for 문 
		for(int i=0;i<list.size();i++) {
			Map<String,Object> map = list.get(i);
			System.out.println(map);
			System.out.println(map.get("num"));
			System.out.println(map.get("subject"));
			System.out.println(map.get("content"));
			System.out.println(map.get("readcount"));
			System.out.println("============");
		}
		
		// 향상된 for문 
		for(Map<String,Object> map : list) {
			System.out.println(map);
			System.out.println(map.get("id"));
			System.out.println(map.get("name"));
			System.out.println(map.get("content"));
			System.out.println(map.get("readcount"));
			System.out.println("~~~~~~~~~~~~~~~~");
		}
		
//		MapTest 객체생성
		MapTest maptest =new MapTest();
		
//		prn2(list) 메서드 호출 => 내용 출력
		maptest.prn2(list);
		
		
		
	}
}
