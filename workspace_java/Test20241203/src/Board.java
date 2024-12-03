
public class Board {
	private static int num;
	private String name; 
	private String subject;
	private String content;
	
	public Board() {
		num++;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Board.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Board(String name, String subject, String content) {
		this();
		this.name = name;
		this.subject = subject;
		this.content = content;
	}
	public void prn() {
		
	}
	
}
