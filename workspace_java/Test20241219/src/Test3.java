import java.sql.*;
import java.text.*;

public class Test3 {
	public static void main(String[] args) {
		
		//문제 3번 
//		Account account = new Account("123-45-6789", "홍길동", 10000);
//		account.deposit(3000);
//		System.out.println(account.withdraw(13100));
		
		Timestamp a= new Timestamp(System.currentTimeMillis());
		System.out.println(a);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		String str = dateFormat.format(a);
		System.out.println(str);  // 2024/12/19 16:24:40
		
//		String => Date => Timestamp 변환
		
		try {
			java.util.Date date = dateFormat.parse(str);  // 먼저 Date 타입으로 변환
			Timestamp timestamp = new Timestamp(date.getTime());
			System.out.println(timestamp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
}
