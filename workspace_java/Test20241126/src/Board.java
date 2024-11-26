
public class Board {
	public int num;
	public String name;
	public String subject;
	public String content;
	public int readcount;
	
	
	public Board(){
		this(10,"홍길동","자바 프로그래밍 입문","기초 튼튼 코딩 밥상",200);
	}


	public Board(int num, String name, String subject, String content, int readcount) {
		this.num = num;
		this.name = name;
		this.subject = subject;
		this.content = content;
		this.readcount = readcount;
	}

	public void prn() {
		System.out.println("번호 : "+num+", 글쓴이 : "+name+", 제목 : "+subject+", 내용 : "+content+", 조회수 : "+readcount);
	}
	
}
