import java.util.*;

public class Test4 {
	public static void main(String[] args) {
//		String 클래스 => 문자열 주제 => 자바 내장객체
//		ArrayList 클래스 => 배열 주제 => 자바 내장객체 
//		배열의 단점을 보완해서 만들 클래스 ArrayList
//		=> 자동으로 10개씩 기억장소 추가 
		
//		ArrayList 배열 객체 생성
//		참조주소.멤버변수, 참조주소.메서드() 호출
//		ArrayList 배열 크기  참조주소.size();
//		ArrayList 배열 데이터 추가  참조주소.add()
//		순서대로 데이터 입력, 0 1 2 순으로 데이터 입력 
//		ArrayList 배열 데이터 가져오기 참조주소.get(순서)
		
		Book book1 = new Book("토지", "박경리");
		Book book2 = new Book("어린왕자", "생택쥐페리");
		Book book3 = new Book("태백산맥", "조정래");

		
		ArrayList<Book>arr =new ArrayList();
		arr.add(book1);
		arr.add(book2);
		arr.add(book3);
		
		arr.get(0).prn();
		arr.get(1).prn();
		arr.get(2).prn();
		
		System.out.println("===============================");
		for(Book book : arr) {
			book.prn();
		}
	}
}
