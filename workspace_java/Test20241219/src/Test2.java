import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		
		// 문제2
		
//		char ch ='0';
//		
//		if(ch >='A' && ch<='Z') {
//			System.out.println(ch+" : 대문자");
//		} else if (ch >='a' && ch<='z' ) {
//			System.out.println(ch+" : 소문자");
//		} else if (ch >='0' && ch<='9') {
//			System.out.println(ch+" : 숫자");
//		} else {
//			System.out.println(ch+" : 기타 문자");
//		}
		
//		String -> Date
		String dateStr = "2024년 12월 19일 16시 07초 05초";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm초 ss초");
		Date date =null;
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
		
//		String -> LocalDateTime
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm초 ss초");
		
		LocalDateTime localDateTime = LocalDateTime.parse(dateStr,formatter);
		
		System.out.println(localDateTime);
	}
}
