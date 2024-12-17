import java.util.*;

public class MemberDAO {

	public void insertMember(MemberDTO member) {
		System.out.println("MemberDAO insertMember() 메서드입니다");
		System.out.println(member);
	}

	public void memberList(List<MemberDTO> memList) {
		System.out.println(memList);
		System.out.println("MemberDAO memberList() 메서드입니다");
		for(MemberDTO member : memList) {
			System.out.println(member);
		}
	}

	public void insertMap(Map<String, Object> map) {
		System.out.println("MemberDAO insertMap() 메서드입니다");
		System.out.println(map);
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Object value = map.get(key);
			System.out.println(key+":"+value);
		}
	}

	public void mapList(List<Map<String, Object>> list) {
		System.out.println(list);
		
		for(Map<String,Object> map : list) {
			System.out.println(map);
		}
	}
}
