package bank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount1 = new Account("aaaaa","ȫ�浿");
		Account myAccount2 = new Account("bbbbb","ȫ��");
		Account myAccount3 = new Account("aaaaa","ȫ�浿");
		Account myAccount4 = new Account("bbbbb","ȫ��");
		myAccount1.deposit(10000);
		System.out.println(myAccount1.toString());
		myAccount2.deposit(30000);
		myAccount2.Witdraw(5000);
		System.out.println(myAccount2.toString());
		myAccount1.transper(5000, myAccount2);
		System.out.println(myAccount2);
		System.out.println(myAccount1.toString());
		System.out.println(myAccount1.cnt);
	}

}
