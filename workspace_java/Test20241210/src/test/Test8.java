package test;

public class Test8 {
	public static void main(String[] args) {
//		equals() 메서드
//		주소에 해당하는 실제 기억장소 값이 같다
		
		Book book1 =new Book(1, "삼국지");
		Book book2 =new Book(1, "삼국지");
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book1.equals(book2));
		System.out.println(book1==book2);
		
		
		Book book3 = book1;
		System.out.println(book1==book3);
		System.out.println(book3.equals(book1));
		
		String str1 = new String("문자열");
		String str2 = new String("문자열");
		System.out.println(str1);
		System.out.println(str2);
//		주소비교
		System.out.println(str1==str2); // false
//		주소에 해당하는 인스턴스(기억장소) 비교 
		System.out.println(str1.equals(str2)); // true
		Student student1= new Student("홍길동", 1);
		Student student2= new Student("홍길동", 1);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student1==student2);
		System.out.println(student1.equals(student2));
		
		Integer integer1= new Integer(100);
		Integer integer2= new Integer(100);
		
		System.out.println(integer1==integer2);
		System.out.println(integer1.equals(integer2));
		
	}
}
