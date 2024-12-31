package test;

public class Test4 {
	public static void main(String[] args) {
		// 클래스 SportsCar 정의 Car 상속 
		// 멤버변수 model
		// 메서드 sportsPrn() 정의 color : cc : model
		
		SportsCar sportsCar = new SportsCar();
		System.out.println(sportsCar);
		sportsCar.prn();
		sportsCar.sportsPrn();
		
		SportsCar sportsCar2 =new SportsCar("스포츠");
		System.out.println(sportsCar2);
		sportsCar2.prn();
		sportsCar2.sportsPrn();
	}
}
