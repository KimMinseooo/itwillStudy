import java.text.*;
import java.util.*;

public class Test6 {
	public static void main(String[] args) {
//		Math 클래스 
//		: java.lang.Math
//		: 수학계산 사용
//		: static 멤버변수, static 메서드()
		System.out.println(Math.PI);
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		System.out.println(Math.abs(-20));
		System.out.println(Math.random());
//		반올림
		System.out.println(Math.round(5.3));//5
		System.out.println(Math.round(5.7));//6
		
		System.out.println("---------------------");
		
//		Date 클래스
		Date date = new Date();
		String str = date.toString();
		System.out.println(str);
		System.out.println("~~~~~~~~~~~~~~~");
		SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str2 = sdf.format(date);
		System.out.println(str2);
		
//		Calendar 클래스 
		Date date2 = Calendar.getInstance().getTime();
		System.out.println(date2);
		
		Calendar calendar= Calendar.getInstance();
		System.out.println(calendar);
		
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		int month = calendar.get(Calendar.MONTH) + 1;
		System.out.println(month);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(week); // 1일요일 2 월 3 화 ~ 
		
		// week 이용해서 요일 출력 switch case 구문 이용
		
		switch (week) {
		case 1 : System.out.println("일요일"); break;
		case 2 : System.out.println("월요일"); break;
		case 3 : System.out.println("화요일"); break;
		case 4 : System.out.println("수요일"); break;
		case 5 : System.out.println("목요일"); break;
		case 6 : System.out.println("금요일"); break;
		case 7 : System.out.println("토요일"); break;
		default : System.out.println("요일 아님!!!");
		}
		

	}
}
