
public class Test3 {
	public static void main(String[] args) {
		
		Book b1 = new Book("책1","저자1");   
		Book b2 = new Book("책2","저자2");
		Book b3 = new Book("책3","저자3");
		
		Book[] bookList = new Book[3];
		
		bookList[0]=b1;
		bookList[1]=b2;
		bookList[2]=b3;
		
		for(Book book : bookList) {
			book.prn();
		}
	}
}
