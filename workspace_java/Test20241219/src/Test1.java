import java.time.*;
import java.time.format.*;

public class Test1 {
	public static void main(String[] args) {
		
		
		// 문제 1
//		int fee =50000;
//		int age =4;
//		
//		if(age < 5 || age >= 65) {
//			fee *=0.5;
//		} else if (age >= 5 && age<=19) {
//			fee *=0.7;
//		}
//		
//		System.out.println("나이가 " +age+"세이므로 입장료는 "+fee+"원입니다.");
		
		// ===================================================================
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.now(ZoneId.of("Europe/Paris"));
		System.out.println(localDate2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = localDate.format(formatter);
		System.out.println(formatedNow);
		
		int year = localDate.getYear();
		String month = localDate.getMonth().toString();
		int mon = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		String week = localDate.getDayOfWeek().toString();
		int wee = localDate.getDayOfWeek().getValue();
		System.out.println(year);
		System.out.println(month);
		System.out.println(mon);
		System.out.println(day);
		System.out.println(week);
		System.out.println(wee);  // 월(1) ~ 일(7)
		
		System.out.println("=================================");
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		String str = localTime.format(formatter2);
		System.out.println(str);
		
		int hour = localTime.getHour();
		int minute = localTime.getMinute();
		int second = localTime.getSecond();
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		System.out.println("=====================================");
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		String str2 =dateTime.format(formatter3);
		System.out.println(str2);
		
		
	}
}
