
public class Test2 {
	public static void main(String[] args) {
		
//		배열 : 같은형의 여러개 기억장소를 정의 사용
		
		int a[] = new int[5];
		int a1 = 10;
		a[0] = a1;
		
		String b[] = new String[5];
		String b1 = new String("문자열");
		b[0] = b1;
		
		Board c[] = new Board[5];   // 크기가 5개짜리 배열
		Board c1 = new Board();
		c1.setName("홍길동");
		c1.setSubject("제목1");
		c1.setContent("내용1");
		c[0] = c1;
		
		Board c2= new Board();
		c2.setName("김길동");
		c2.setSubject("제목2");
		c2.setContent("내용2");
		c[1]= c2;
		
		Board c3= new Board();
		c3.setName("박길동");
		c3.setSubject("제목3");
		c3.setContent("내용3");
		c[2]= c3;
		
		Board c4= new Board();
		c4.setName("이길동");
		c4.setSubject("제목4");
		c4.setContent("내용4");
		c[3]= c4;
		
		Board c5= new Board();
		c5.setName("고길동");
		c5.setSubject("제목5");
		c5.setContent("내용5");
		c[4]= c5;
		
		for(Board bo:c) {
			System.out.println("글 번호 : "+bo.getNum() +" 이름: "+bo.getName()+" 제목: "+bo.getSubject()+" 내용: "+bo.getContent());
		}
		
//		c[0] = new Board();

	}
}
