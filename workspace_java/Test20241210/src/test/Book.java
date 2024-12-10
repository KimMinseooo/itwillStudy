package test;

public class Book {
	int bookNumber;
	String bookTitle;
	
	//멤버변수에 저장할 값을 받는 생성자
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}

	
//	extends Object 생략 
//	Object 부모클래스 toString() 메서드 오버라이딩
	
	
}
