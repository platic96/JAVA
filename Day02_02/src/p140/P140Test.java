package p140;

class Bank{
	private int balance;
	private int account_id;
	public int account_ps;
	public String Bank_name;
	public void Balance_Chek() {System.out.println(balance);}
	public void Print_ID() {System.out.println(account_id);}
}

public class P140Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank user = new Bank();
		user.Balance_Chek();
		user.Print_ID();
		user.account_ps = 3690;
		user.Bank_name = "아이오페";
	}

}
