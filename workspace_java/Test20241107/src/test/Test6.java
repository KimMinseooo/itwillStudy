package test;

public class Test6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i==5) continue;
			System.out.println(i);
		}
		
		int sum=0;
		
		for (int i=1;i<=10;i++) {
			if(i%2==0) continue;
			sum+=i;
			System.out.println(i);
		}
		System.out.println(sum);
		
		System.out.println("===========================");
		
		for(int i=1;i<=100;i++) {
			if(i%10!=0) continue;
			
			System.out.println(i);
		}
		
	}
}
