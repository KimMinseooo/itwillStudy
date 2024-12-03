
public class BoardDAO {
	
	public void insertBoard(Board board) { 
		System.out.println("글 번호 : "+board.getNum() +" 이름: "+board.getName()+" 제목: "+board.getSubject()+" 내용: "+board.getContent());
	}
}
