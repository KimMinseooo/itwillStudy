package test;

public class Test1 {
	public static void main(String[] args) {
		
		int s =0 ; 
		for (int i=1; i<=100;i++) {
			s+=i;
			if(i%10==0) {
				System.out.println(i);
			}
		}
		System.out.println(s);
		int evenTotal=0;
		int oddTotal=0;
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) evenTotal+=i;
			else oddTotal+=i;
		}
		
		System.out.println(evenTotal);
		System.out.println(oddTotal);
	
	}
}