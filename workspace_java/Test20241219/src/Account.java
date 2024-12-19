
public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void deposit(int amount) {
		balance+=amount;
		System.out.println("입금금액 : "+amount+"원, 현재잔고 : "+balance+"원");
	}
	
	
	public int withdraw(int amount) {
		
		System.out.println("현재잔고 : "+balance+"원, 출금할 금액 : "+amount+"원");
		
		if(balance < amount) {
			System.out.println("잔고가 부족하여 출금할수 없습니다.");
		} else {
			balance-=amount;
			System.out.println(amount+"원이 출금 되었습니다 (현재잔고 : "+balance+"원)");
		}
		
		return amount;
	}
	
}
