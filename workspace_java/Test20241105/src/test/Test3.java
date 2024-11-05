package test;

public class Test3 {
	public static void main(String[] args) {
		// 반복문 for while do~while 
		// 반복문 : 조건이 true 이면 반복하고
		//		  조건이 false이면 반복문 빠져나옴
		// for문 : 처음과 마지막을 알고 있으면 선택
		// while문 : 반복 횟수가 정해져 있지 않은 반복문 
		// ex) 밥을 10번 드세요 -> 횟수가 정해짐 => for문
		// ex) 밥을 그릇이 빌 때까지 드세요 => while문
		
//		반복문 구성요소 => 카운트 변수 정의 초기값, 조건문 , 실행문 ,증가값
//		for(카운트 변수 정의 초기값; 조건문;증가값) {
//			실행문;
//		}
		
		// 1~10 까지 카운트를 하면서 10번 반복 => 카운트 값 출력 
		for (int i=1;i<=10;i++) { 
			System.out.println(i);
		}
		
//		1) 카운트 변수 정의 초기값 int i =1;
//		2) 조건문 i <= 10; => true
//		3) 실행문 System.out.println(i);
//		4) 증가값 i++
//		5) 조건문 i<=10; => true
//		6) 실행문 System.out.println(i);
//		4 ~ 6 반복
//		7) 증가값 i++ => 11
//		8) 조건문 i<=10; => false
//		9) 반복문을 빠져나옴		
		
		for (int i=1;i<=5;i++) {
			System.out.println(i+" : Hello, World!");
		}
		
		// 0 ~ 9 카운트 하면서 카운트값 출력
		int cnt=0;
		for (int i=0;i<10;i++) {
			cnt++;
			System.out.print(i+" ");
		}
		System.out.println(" 카운트값 : "+cnt);
		// 1 3 5 7 9 카운트 하면서 카운트값 출력
		int cnt1 =0;
		for (int i=0;i<10;i++) {
			if(i%2==1) {
				cnt1++;
				System.out.print(i+" ");
			}
		}
		System.out.println(" 카운트값 : "+cnt1);
		
		//10 9 8 ~ 1 카운트 하면서 카운트값 출력
		int cnt2= 0;
		for (int i=10;i>0;i--) {
			cnt2++;
			System.out.print(i+" ");
		}
		System.out.println(" 카운트값 : "+cnt2);
		
		
		// 1~10 출력
		int min =1;
		int max= 15 ;
		for (int i=min;i<=max;i++) {
			System.out.print(i+" ");	
		}
		System.out.println();
		
		//구구단 2단 출력 
		int dan =2;
		
		for(int i=1;i<=9;i++) {
			System.out.println(2+" * "+i+" = "+ 2*i);
		}
		
		// 1~5 까지 카운트 => 1 +2 + 3 + 4 + 5=> 합을 구해서 출력
		int sum=0;
		int cnt4 =0;
		for (int i=1;i<=5;i++) {
			cnt4++;
			sum+=i;
			if(i==1) {
				System.out.print(i);
			} else {
				System.out.print(" + "+i);	
			}
			
		}
		
		System.out.println(" = " +sum);
		System.out.println("카운트값 : "+cnt4);
		
	}
}
