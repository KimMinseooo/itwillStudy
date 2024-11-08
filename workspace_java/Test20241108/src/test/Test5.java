package test;

public class Test5 {
	
	public static void main(String[] args) {
//			int형 num 배열변수 선언 
//			원하는 초기값 1,2,3,4,5,6,7,8,9,10
			
			int[] num = {1,2,3,4,5,6,7,8,9,10};
			
			for (int i=0; i<num.length; i++) {
				System.out.print(num[i]+" ");
			}
			System.out.println();
			
//			double형 data 배열변수 5개 기억장소 선언
//			변수 0번째 10.0 1번째 20.0 2번째 30.0 저장
//			for 출력
			double[] data =new double[5];
			data[0]=10.0;
			data[1]=20.0;
			data[2]=30.0;
			
			for(int i=0;i<data.length;i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
//			char형 ch 배열변수 5개 기억장소 선언
//			초기값 'A' , 'B', 'C', 'D', 'E'
//			for 출력
			
			char[] ch =new char[] {'A' , 'B', 'C', 'D', 'E'};
			
			for(int i=0;i<ch.length;i++) {
				System.out.print(ch[i]+" ");
			}
			System.out.println();
//			String형 str 배열변수 3개 기억장소 선언
//			초기값 "java", "html", "db"
//			for 출력
			
			String[] str = {"java", "html", "db"};
			for(int i=0;i<str.length;i++) {
				System.out.print(str[i]+" ");
			}
			System.out.println();
			
			System.out.println("=================================");
			
//			향상된 for문 배열
//			for(변수 선언(배열의 자료형 맞춰서) : 배열 ) {
//				실행문;
//			}
			
			//배열만 가능 ! 
			// num[] 배열 출력
			for (int n : num) {
				System.out.print(n+" ");
			}
			System.out.println();
			// data[] 배열 출력
			for (double ddd : data) {
				System.out.print(ddd+" ");
			}
			System.out.println();
			// ch[] 배열 출력
			for(char gggg : ch) {
				System.out.print(gggg+" ");
			}
			System.out.println();
			// str[] 배열 출력
			for(String zzzzzzzz : str) {
				System.out.print(zzzzzzzz+" ");
			}
			
			
			
			
			
			
			
			
			
			
			
	}
}
