package test;

public class Test9 {
	public static void main(String[] args) {
//		Object 클래스 hashCode() 
//		hash 해시 : 정보를 저장, 검색 사용하는 자료구조
//				 : 정보를 저장, 정보를 가져올때 사용
//		hash() 함수 : 정보가 저장된 위치를 반환
//		해쉬코드 값( 메모리 위치 값 , 기억장소 주소 값)
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Student stu1 =new Student("홍길동", 1);
		Student stu2 =new Student("홍길동", 1);
		System.out.println(stu1.hashCode());
		System.out.println(stu2.hashCode());
		System.out.println(stu1.getClass().getName());
		
		System.out.println(Integer.toHexString(stu1.hashCode()));
		System.out.println(Integer.toHexString(stu2.hashCode()));
	}
}
