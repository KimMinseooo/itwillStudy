
public class Test2 {
	public static void main(String[] args) {
		
		// 부효연산자(단항연산자 ) 
//		+ 양수 , - 음수 => +3 , -3 
		
		int num =10 ;
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		num = -num;
		System.out.println(num);
		
		int a= 10 ;
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a++);
		
		System.out.println(a);
		
		a= a+1;
		System.out.println(a);
		
		
		a+= 1;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		
		//1감소 
		
		int b= 10 ;
		System.out.println(b);
		b= b-1;
		System.out.println(b);
		b-=1;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(--b);
		System.out.println(b);
	}
}
