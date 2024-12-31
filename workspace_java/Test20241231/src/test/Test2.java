package test;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
//		열거 타입 : 한정된 값인 열겨상수 중에서 하나의 상수를 저장하는 타입 
//		열거 타입(Enum Type) : Week
		
//		열거타입 변수 = 열거타입.열거상수
		Week today = Week.SUNDAY;
		System.out.println(today);
		
		Week today2= null;
		today2 = Week.MONDAY;
		System.out.println(today2);
		
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		// week 1 SUNDAY , 2 MONDAY
		// switch
//		System.out.println("오늘 요일 : "+today);
		// if today == SUNDAY 같으면 "일요일 축구를 합니다"
		//					  다르면 "열심히 자바 공부합니다"
		System.out.println(week);
		switch(week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WENDSDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일 : "+ today);
		
		if(today ==Week.SUNDAY) {
			System.out.println("일요일 축구를 합니다");
		}
		System.out.println("열심히 자바 공부합니다");
	}
}
