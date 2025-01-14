
public class Test1 {

	public static void main(String[] args) {
		// 2020년 1회 정보처리기사 실기 기출 문제
		// 12번 배열 오름차순 정렬 알고리즘 
		int i;
		int j;
		int temp;
		int a[] = {75,95,85,100,50};
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4 - i; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(i = 0; i < 5; i++) {
			System.out.printf("%d",a[i]);
		}
		// 50758595100 결과
		System.out.println();
		System.out.println("----------------");
//		13. 배열 내용 출력
		int[] b = {0, 1, 2, 3};
		for(i = 0; i < 4; i++) {
			System.out.print(b[i] + " ");
		}
//		 0 1 2 3 결과
		System.out.println();
		System.out.println("----------------");
//		14. switch case 문
		i = 3;
		int k = 1;
		switch(i) {
			case 0: ;
			case 1: ;
			case 2: ;
			case 3:k = 0;
			case 4:k += 3;
			case 5:k -= 10;
			default : k--;
		}
		System.out.println(k);
		// -8 결과
		
	}

}
