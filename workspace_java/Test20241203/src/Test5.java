import java.util.*;

public class Test5 {
	public static void main(String[] args) {
//		Board 모든 값을 받는 생성자 추가 
//		Board 모든 내용 출력하는 prn() 메서드 추가
//		Board 객체생성 게시판글 3개 준비
		
		Board b1 = new Board("홍길동", "제목1", "내용1");
		Board b2 = new Board("김길동", "제목2", "내용2");
		Board b3 = new Board("고길동", "제목3", "내용3");
		
		ArrayList<Board> boardList = new ArrayList<Board>();
		
		boardList.add(b1);
		boardList.add(b2);
		boardList.add(b3);
//		Board형을 담은 ArrayList배열 객체생성
//		게시판글 3개 배열에 저장
		
//		for문 출력
		
		for(int i =0; i<boardList.size();i++) {
			boardList.get(i).prn();
		}
		System.out.println("=================================");
		for(Board bo : boardList) {
			bo.prn();
		}
		
		
	}
}
