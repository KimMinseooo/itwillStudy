
public class Test1 {
	public static void main(String[] args) {
		// 2020년 4회
		// 5번  n = 10, 10을 2진수 변환
//		2 | 10 
//		  ----
//		    5  -> 0  a[0]
//		  ----  
//		    2  -> 1   a[1]
//		 -----
//		    1  -> 0   a[2]
//		 -----
//		    0   -> 1  a[3]
		int []a = new int[8] ; // 0 0 0 0 0 0 0 0
		int i = 0;
		int n = 10;
		while(n > 0) {
//			a[0] = n % 2  (10%2) (5%2)  (2%2) (1%2)
			a[i++] = n % 2; //0   1       0     1
			n /= 2; //    n = 5	, n = 2, n = 1 , n = 0
		}
		for(i = 7; i >= 0; i--) {
			System.out.print(a[i]);
		}
		// 0101 0000 
		// => 뒤부터 출력 0000 1010
		System.out.println();
		System.out.println("----------------");
		int [][] b = new int[3][5];
		for(i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				b[i][j] = j * 3 + (i + 1) ;
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------");
		// 18 번
		char []p = {'K','O','R','E','A'};
		System.out.println(p); //p //KOREA
		System.out.println(p[3]+""+p[4]);// p+3  //EA
		System.out.println(p[0]);// *p  // K
		System.out.println(p[3]);// *(p+3)  //E
		System.out.println((char)(p[0]+2));// *p+2  //77 M
		System.out.println("----------------");
		String s = "KOREA";
		System.out.println(s);
		System.out.println(s.substring(3));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		System.out.println((char)s.charAt(0)+2);
		System.out.println();
		System.out.println("----------------");
		//9 번   2차원 배열
		int [][] lol = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		for(i = 0; i < lol[0].length; i++) {
			System.out.print(lol[0][i] + " ");
		}
		System.out.println();
		System.out.println(lol[2][1]);
		for(int []sub : lol) {
			for(int item : sub) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
//		1 2 3 
//		7
//		1 2 3 
//		4 5 
//		6 7 8 9 
		// 19 자바 
		System.out.println();
		System.out.println("----------------");
		Parent obj = new Child();
		System.out.println("결과 " + obj.compute(4));
	}
}

class Parent{
	public int compute(int num) {
		System.out.println("Parent compute(num)" + num);
		if(num <= 1) return num;
		return compute(num - 1) + compute(num - 2);
	}
}
class Child extends Parent{
	@Override
	public int compute(int num) {
		System.out.println("Child compute(num)" + num);
		if(num <= 1) return num;
		return compute(num - 1) + compute(num - 3);
	}
}
