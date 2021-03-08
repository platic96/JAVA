package p186;

public class Account {
	private long balance = 0L;
	
	public void deposit(long mo) {
		balance += mo;
		System.out.println("balance : " + balance);
	}
	
	public void withdraw(long mo) {
		balance -= mo;
		System.out.println("balance : " + balance);
	}
	public void check() {
		System.out.println("balance : " + balance);
	}
	
}
