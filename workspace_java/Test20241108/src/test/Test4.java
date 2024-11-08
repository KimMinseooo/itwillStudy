package test;

public class Test4 {
	public static void main(String[] args) {
//		변수 : 기억장소 하나에 값 하나만 저장
		int a1=10; 
		int a2=20;
		int a3=30;
		int a4=40;
		int a5=50;
//		배열 : 같은형 기억장소를 여러개 만들어서 사용 
//		int a[] = {10,20,30,40,50};
		int a[] = new int[5];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		// 배열선언 할때 : 원하는 초기값 할당 
		int b[] = {10,20,30,40,50};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		
		int c[]= new int[] {10,20,30,40,50};
		System.out.println("배열의 크기 : "+c.length);
		for(int i=0;i<5;i++) {
			System.out.print(c[i]+" ");
		}
		
		
	}
}
