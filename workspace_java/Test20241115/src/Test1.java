
public class Test1 {
	
	public static void main(String[] args) {
//		fun1(정수형값을 전달받아서 저장하는 변수) 함수정의	
//		받은수가 양수, 음수, 영 => return 결과 리턴(문자열)
		
//		fun2(정수형값을 전달받아서 저장하는 변수) 함수정의
//		3*전달받은값 + 5 => y 결과 리턴 (정수형) 
		
		System.out.println(fun1(1));
		
		System.out.println(fun2(2));
		
		
		
	}
	
	public static String fun1(int num) {
		if(num>0) return "양수"; 
		else if(num==0) return "영";
		else return "음수";
	}
	
	public static int fun2 (int num) {        
		int y=3*num+5;
		return y;
	}
}
