import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		
		Member m1 = new Member("id1", "pass1", "홍길동");
		Member m2 = new Member("id2", "pass2", "고길동");
		Member m3 = new Member("id3", "pass3", "김길동");
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);
		
		MemberDAO dao = new MemberDAO();
		dao.insertMember2(memberList);
		
	}
}
