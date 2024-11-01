
public class Test2 {
	public static void main(String[] args) {
		
//		if else if else 다중 if 구문
		int num =0 ;
//		num 0 보다 작으면 "음수", 아니면 num 0보다 크면 "양수" ,나머지 "영" 
		
		if (num<0) {
			System.out.println(num + ": 음수");
		} else if (num>0) {
			System.out.println(num + ": 양수");
		} else {
			System.out.println(num);
		}
	}
}
