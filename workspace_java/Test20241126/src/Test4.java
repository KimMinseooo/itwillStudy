
public class Test4 {
	
	public static void main(String[] args) {
//		Board 클래스 정의
//		멤버변수 int num, name, subject, content , int readcount 정의
//		메서드() prn() 번호 : , 글쓴이 : , 제목 : , 내용 : , 조회수 : 출력
//		자기 자신 생성자 호출
		
//		기본 생성자
//		int num, name, subject, content , int readcount 값을 받아서 
//		멤버변수에 초기값 할당하는 생성자
		
		Board b1 = new Board();
		b1.prn();
		
		Board b2 = new Board(13,"박은종","자바 프로그래밍 입문","개발을 위한 코딩개념",2000); 
		b2.prn();
	}
}
