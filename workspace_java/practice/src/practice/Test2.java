package practice;

public class Test2 {
	public static void main(String[] args) {
		
		// 1 ~ 10 까지 합 (sum) 계산 후 출력
		// 출력형식 "sum : XX"
		
		int sum =0 ;
		for(int i=1;i<+10;i++) {
			sum+=i;
		}
		System.out.println("sum: "+sum);
		
		
//		int sum =0;
//		int i=0;
//		while (i<10) {
//			sum+=i+1;
//			i++;
//		}
//		System.out.println("sum: "+sum);
//		
		
		
		//1 ~ 100 짝수의합(even), 홀수의 합(odd) 계산 후 출력
		//출력형식 : "1 ~100까지 짝수의 합: XX"
		//         "1 ~100까지 짝수의 합: XX"
		
		int even =0;
		int odd = 0;
		
		for (int i1=1;i1<=100;i1++) {
			if (i1%2==0) {
				even +=i1;
			} else {
				odd +=i1;
			}
		}
		System.out.println("1 ~100까지 짝수의 합: "+even);
		System.out.println("1 ~100까지 홀수의 합: "+odd);
		
		
//		int even =0 ;
//		int odd = 0;
//		int i=1;
//		
//		while (i<=100) {
//			if (i%2==0) {
//				even +=i;
//			} else {
//				odd +=i;
//			}
//			i++;
//		}
//		System.out.println("1 ~100까지 짝수의 합: "+even);
//		System.out.println("1 ~100까지 홀수의 합: "+odd);
		
		
//		7의 갯수 출력
//		ex) int n = 247427723;
//				출력결과 : 3 
//==================<반복문>===========================
		int n = 247427723; 
		int count =0;
		
		while (n !=0) {
			
//			int a=n % 10 ;
			n /= 10;
			
			if ((n%10) == 7) {
				count++;
			}
			
			
		}
		System.out.println("7의 개수 = " +count);
		
//===================<String으로 변환후 cnt>=============================
		int m =247427723;
		int cnt=0 ;
		
		String str=String.valueOf(m);
		
		for (int i2=0;i2<str.length();i2++) {
			if(str.charAt(i2)=='7') {
				cnt++;
			}
		}
		System.out.println("7의 개수 = "+cnt);
		
//		System.out.println(count);
		
		
		
		
		
		
		
		
		
	}
}
