
public class Test3 {
	public static void main(String[] args) {
		
		// Member 클래스 정의
		// 멤버변수 id, pass, name, ing age 정의
//		메서드() prn() 아이디 : , 비밀번호 : , 이름 : , 나이 : 출력
		Member m = new Member("admin","1234","관리자",36);
		m.prn();
		
		Member m1= new Member();
//		m1.id="aaaa";
//		m1.pass="1111";
//		m1.name= "홍길동";
//		m1.age= 19;
		m1.prn();
		
		// 생성자 => 기억장소 할당, 초기값 할당
		// 기본생성자
		
//		프로그램에서 사용하는 메모리 : 스택, 힙 , 데이터 세 영역 사용
//		힙(heap)메모리 : 프로그램에서 사용하는 동적 메모리 
//		힙은 동적으로 할당되어 사용이 끝나면 동적메모리 해제
//		=> 가비지 컬렉터(garbage collector) 자동으로 메모리를 해제 
		
//		id, pass,name,age값을 받아서 멤버변수에 초기값 할당하는 생성자
	}
}
