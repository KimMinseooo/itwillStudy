
public class Test3 {
	public static void main(String[] args) {
		
		//문제 3번 
		Account account = new Account("123-45-6789", "홍길동", 10000);
		account.deposit(3000);
		System.out.println(account.withdraw(13100));
	}
}
