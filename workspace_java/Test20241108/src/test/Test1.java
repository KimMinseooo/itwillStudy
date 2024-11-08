package test;

public class Test1 {

	public static void main(String[] args) {
		
//		1) if else if 구문, switch case 구문
//		조건 operator '=' , '-' , '*', '/' => 사칙연산 출력
				
		int num1 =10;
		int num2 =5;
		char operator = '+';
		
		switch (operator) {
		case '+' : System.out.println(num1+" + "+num2+" = "+( num1 + num2 )); break;
		
		case '-' : System.out.println(num1+" - "+num2+" = " + (num1 - num2) ); break;
		
		case '*' : System.out.println(num1+" * "+num2+" = "+ (num1 * num2 )); break;
		
		case '/' : System.out.println(num1+" / "+num2+" = "+ (num1 / num2 )); break;
		default : System.out.println("연산자 아님 !!!"); break;
		}
		
		System.out.println("========================================");
		
		if (operator =='+') { 
			System.out.println(num1+" + "+num2+" = "+ (num1 + num2) );
		} else if (operator =='-') {
			System.out.println(num1+" - "+num2+" = "+ (num1 - num2) );
		} else if (operator =='*') {
			System.out.println(num1+" * "+num2+" = "+ (num1 * num2) );
		} else if (operator =='/') {
			System.out.println(num1+" / "+num2+" = "+ (num1 / num2 ));
		} else {
			System.out.println("연산자 아님");
		}
		
		
		
// 		1 ~ 100 반복
//		if 3의 배수의 개수 구하기 => 마지막에 출력
//		if 5의 배수의 개수 구하기 => 마지막에 출력
		int CntThree = 0; 
		int CntFive = 0;
		for (int i=1;i<=100;i++) {
				
				if (i%3==0) {
					CntThree ++;
				}
				if( i%5==0) {
					CntFive++;
				}
		}
		System.out.println("3의 배수의 개수 : " + CntThree);
		System.out.println("5의 배수의 개수 : " + CntFive);
	
		// for (char i = 'A'; ; ) A~ Z 출력
		// if 'G' 이면 반복문 빠져나오기 
		
		for (char i = 'A'; ; ) {
			if(i =='G') break;
			System.out.print(i+" ");
			i++;
		}
	
	
	
	
	}
}
