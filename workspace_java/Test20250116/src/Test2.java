
public class Test2 {

	public static void main(String[] args) {
		//2021년 1회 정보처리기사 실기
		//5 번
		String[] li =
     {"seoul", "kyeonggi","inchon","daejeon","daegu","pusan"};
		String str01 = "";
		for(String i : li) {
			str01 = str01 + i.charAt(0);
		}
		System.out.println(str01);
		System.out.println();
		System.out.println("----------------");
		// 7 자바 결과 출력
		int [][]arr = new int[][] {
			{45,50,75},
			{89}
		};
		System.out.println(arr[0].length);//3
		System.out.println(arr[1].length);//1
		System.out.println(arr[0][0]);//45
		System.out.println(arr[0][1]);//50
		System.out.println(arr[1][0]);//89
		System.out.println();
		System.out.println("----------------");
		// 17 번
		int i, j;
		for(j=0,i=0; i <= 5; i++) {
			j += i;
			System.out.print(i);
			if(i == 5) {
				System.out.print("=");
				System.out.print(j);
			}else {
				System.out.print("+");
			}
		}
		// 0+1+2+3+4+5=15
		
	}

}
