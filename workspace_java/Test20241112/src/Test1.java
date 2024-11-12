
public class Test1 {

	public static void main(String[] args) {
	
		//int형 배열 arr 변수 선언
		// 초기값 3, 6, 9 ,12
		// arr[0] +2 
		// arr[1] +arr[2]
		// arr[4] -3
		
		int[] arr= new int[] {3,6,9,12};
		System.out.println(arr[0]+2);
		System.out.println(arr[1]+arr[2]);
		
//		System.out.println(arr[4]-3); // 에러 발생 
		System.out.println(arr[3] - 3);
		
		
		char[] alpha = new char[26];
		char ch ='A';
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i] =ch;
			ch++;
		}
		
		for(int i=0;i<alpha.length;i++) {
			System.out.println(alpha[i]+","+ (int)alpha[i]);
		}
		System.out.println("--------------------------------");
		for(char c : alpha) {
			System.out.println(c+" , "+(int)c);
		}
		
		// String 형 배열변수 hobby 
		// 초기값 "여행","게임","운동"
		// for 출력 
		
		//향상된 for문 출력
		
		String[] hobby =new String[]{"여행","게임","운동"};
		for(int i=0;i<hobby.length;i++) {
			System.out.println(hobby[i]);
		}
		System.out.println("--------------------------------");
		for(String s : hobby) { 
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
	}

}
