
public class Test1 {
	public static void main(String[] args) {
		// Board 클래스 정의 
		// static 멤버변수 int num
		// 멤버변수 private name, subject, contnet
		// 기본 생성자 num 1씩 증가 . 
		// 메서드 setter getter
		
		//BoardDAO 클래스 정의 
		// 리턴할 형 없음 insertBoard 
//		(Board 기억장소 주소 전달 받은 값을 저장하는 변수 )
//		전달받은 값을 글번호 : 이름 : 제목 : 내용 : 출력
		
		Board b1 = new Board("홍길동","홍길동전","재밌음");
//		Board b1 =new Board();
//		b1.setName("홍길동");
//		b1.setSubject("홍길동전");
//		b1.setContent("재밌음");
		
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(b1);
	}
}
