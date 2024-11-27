
public class Test2 {
	public static void main(String[] args) {
		
//		클래스 MyDate 정의
//		멤버변수 name, int year, month , day
//		private 멤버변수 데이터 은닉
//		public set메서드, get메서드 정의
		
		MyDate date =new MyDate();
		date.setName("오늘은~~~~~");
		date.setYear(2024);
		date.setMonth(11);
		date.setDay(27);
		
		System.out.println(date.getName());
		System.out.println(date.getYear()+"년");
		System.out.println(date.getMonth()+"월");
		System.out.println(date.getDay()+"일");
		
	}
}
