import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("일길동", 85);
		map.put("이길동", 90);
		map.put("삼길동", 80);
		map.put("사길동", 95);
		
		System.out.println("크기 : " +map.size());
		System.out.println("비어있는 경우 확인 :" +map.isEmpty());
		map.remove("이길동");
//		{삼길동=80, 사길동=95, 일길동=85}
		System.out.println(map);
//		전체 삭제
//		map.clear();
//		System.out.println(map); // {}
		
		
//		키값만 받아오기 => Set => Iterator 사용 ! 
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":"+value);
		}
		
//		키 , 값 받아오기 => Set => Iterator 사용 ! 
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
//		[<key,value>,<key,value>,<key,value>]
//		[삼길동=80, 사길동=95, 일길동=85]
		System.out.println(entrySet);
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry= entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}
}
