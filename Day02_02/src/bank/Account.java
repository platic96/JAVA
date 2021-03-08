package bank;

public class Account {
	static int cnt=0;
	private String accountNO;
	private String Owner_Name;
	private int balance= 0;
	public Account(String accountNO,String Owner_Name) {
		this.accountNO = accountNO;
		this.Owner_Name = Owner_Name;
		cnt++;
	}
	void deposit(int input_Money) {
		balance += input_Money;
	}
	void Witdraw(int output_Money) {
		
		if(this.balance < output_Money)
		{
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");			
		}
			
		else
			balance -=output_Money;
	}
	void transper(int money, Account throw_NO) {
		if(this.balance<money) {
			System.out.println("ÀÜ¾×ÀÌ ºÎÁ·ÇÕ´Ï´Ù.");
		}
		else {
			this.balance-=money;
			throw_NO.balance+=money;
		}
	}
	public String toString() {
		return "°èÁÂ " + this.accountNO+"ÀÜ¾× :" + this.balance;
	}
}
