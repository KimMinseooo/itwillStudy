package test;

public class Test3 {
	
	public static void main(String[] args) {
		
		for (int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*
//		**
//		***
//		****
//		*****
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int cnt = 4;
		int spaceBar = cnt/ 2 + 1; 
		int printStar =1;
		
		for (int i=0;i<cnt;i++) {
			for (int j=0;j<spaceBar;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<printStar;j++) {
				System.out.print("*");
			}
			for (int j=0;j<spaceBar;j++) {
				System.out.print(" ");
			}
			spaceBar -=1;
			printStar +=2;
			System.out.println();
		}
		System.out.println("================");
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		for (int i=1;i<=5;i++) {
			
			for (int j=5-i;j>=1;j--) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("*");	
			}
			
			System.out.println();
		}
		
//		   *   
//		  ***  
//		 ***** 
//		*******
//		
//		int num =7; 
//		int space = num/2;
//		
//		int star =1; 
//		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<space;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<star;j++) {   // 3   5
//				System.out.print("*");
//			}
//			for(int j=0;j<space;j++) {
//				System.out.print(" ");
//			}
//			space--;
//			star +=2;   // star =star +2;
//			System.out.println();
//		}
		
		
//		*****
//		****
//		***
//		**
//		*
		System.out.println("==========================");
		
		for (int i =0;i<5;i++) {
			for (int j=5-i;j>0;j--) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		 
		for (int i=0;i<5;i++) {   // i 1 2 3 4 5 
			for(int j=0;j<i;j++) { // 0 <0 i=1  for(int j=0;j<1;j++)
				System.out.print(" ");
			}	
			for (int j=5-i;j>i;j--) {     
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("============================================");
		
		// 마름모 구하기 
		int num =11;    // 홀수이면 뭐든지 가능 !  
		int space = num/2;  //5  1 5 
							//4  3 4
		
		int star =1; 
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {   // 3   5
				System.out.print("*");
			}
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			if(i<num/2) {    // 중간을 뜻함. 
				space--;
				star +=2;   // star =star +2;
			} else {
				space++;
				star -=2;  // star = star -2;
			}
			
			System.out.println();
		}
		
		System.out.println("============================================");
		// 2*1=2  3*1=3  4*1=4  5*1=5  6*1=6  7*1=7  8*1=8  9*1=9
		// ...
		// ...
		// 2*9=18  3*9=27  4*9=36  5*9=45  6*9=54  7*9=63  8*9=72  9*9=81  

		for (int i=1;i<=9;i++) { 
			for (int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+j*i +"\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}
