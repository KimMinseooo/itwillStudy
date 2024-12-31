package test;

import p1.*;
import p2.*;

public class Test5 {
	public static void main(String[] args) {
		//패키지 p1 Person 클래스 정의
//		멤버변수 privateVar , packageVar, 
//		protectedVar , publicVar
//		메서드 personPrn() 출력 
		
		//패키지 p2 Student 클래스 정의 Person 클래스 상속
//		멤버변수 privateVar2 , packageVar2, 
//		protectedVar2 , publicVar2
//		메서드 studentPrn()
		
//		Person객체 생성자
//		멤버변수 접근 값을 저장
//		멤버변수 접근 값을 출력
//		메서드 personPrn() 호출
		Person person = new Person();
//		person.privateVar="private변수"; // 같은 클래스 => 에러
//		person.packageVar="package변수"; // 같은 폴더 => 에러
//		person.protectedVar="protected변수"; // 다른 폴더 상속관계 아님 => 에러
		person.publicVar="public변수"; // 모두 접근
		person.personPrn();
//		Student 객체생성
//		멤버변수, 부모 멤버변수 접근 값을 저장
//		멤버변수, 부모 멤버변수 접근 값을 출력
//		메서드 personPrn() 호출
//		메서드 studentPrn() 호출
		Student student = new Student();
		student.publicVar="부모 public변수";
		student.publicVar2="자식 public변수";
		student.personPrn();
		student.studentPrn();
		
	
		
	}
}
