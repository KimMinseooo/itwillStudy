import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		
//		MemberDTO 클래스 정의 
//		멤버변수 id,pass,name,int age,String gender,email,TimeStamp date
//		생성자 멤버변수 모든 값을 받는 생성자
//		메서드 set get , toString()
		
//		MemberDTO 객체 생성
		MemberDTO member1 = new MemberDTO("admin", "1234", "홍길동",22, "남", "abc@naver.com", new Date());
//		MemberDAO 클래스 정의
//		메서드 정의 insertMember(memberDTO) => 출력  
		
//		MemberDAO 객체 생성 
		MemberDAO dao = new MemberDAO();
//		insertMember(memberDTO) 메서드 호출
		dao.insertMember(member1);
		
//		List배열에 MemberDTO 3명을 담기
		
		MemberDTO member2 = new MemberDTO("user2", "5678", "고길동",16, "남", "aasdf@naver.com", new Date());
		MemberDTO member3 = new MemberDTO("user3", "2580", "김길동",33, "남", "asdasgc@naver.com", new Date());
		List<MemberDTO> memList = new ArrayList<MemberDTO>();
		memList.add(member1);
		memList.add(member2);
		memList.add(member3);
		
//		memberList(List배열) 메서드 호출 // 3개의 MemberDTO 각각의 한개씩 출력하시오.
		dao.memberList(memList);   
		
//		map "id:kim" , "num:1", "name:applephone","img:1.jpg"
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("id", "kim");
		map.put("num", 1);
		map.put("name", "applephone");
		map.put("img", "1.jpg");
//		MemberDAO 파일 insertMap(map) 메서드 호출
		dao.insertMap(map);
		
		Map<String,Object> map2 = new HashMap<String, Object>();
		map2.put("id", "kim");
		map2.put("num", 10);
		map2.put("name", "applephone10");
		map2.put("img", "2.jpg");
		
		Map<String,Object> map3 = new HashMap<String, Object>();
		map3.put("id", "kim");
		map3.put("num", 15);
		map3.put("name", "applephone16");
		map3.put("img", "3.jpg");
		
		
//		List배열에 Map 3개 담기 
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(map);
		list.add(map2);
		list.add(map3);
		
//		MemberDAO 에 mapList(List배열) 메서드 호출
		dao.mapList(list);
	}
}
