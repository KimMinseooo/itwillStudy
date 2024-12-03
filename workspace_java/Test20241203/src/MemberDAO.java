import java.util.*;

public class MemberDAO {
	
	public void insertMember(Member m) {
		System.out.println("아이디 : " +m.getId());
		System.out.println("비밀번호 : " +m.getPass());
		System.out.println("이름 : " +m.getName());
	}

	public void insertMember2(ArrayList<Member> memberList) {
		
		for(Member mem : memberList) {
			System.out.println(mem);
		}
	}
	
}
