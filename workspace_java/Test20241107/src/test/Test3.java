package test;

public class Test3 {
	public static void main(String[] args) {
//		1 ~10 합구하기 => 출력
		
		int i=1;
		int total=0;
		while(i<=10) {
			System.out.println(i);
			total+=i;
			i++;
		}
		System.out.println(total);
		
		do {
			System.out.println();
			 i--;
		} while (i<=10);
		System.out.println();
	}
}
