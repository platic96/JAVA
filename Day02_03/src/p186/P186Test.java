package p186;

import java.util.Scanner;

public class P186Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int select;
			long balance;
			Scanner c = new Scanner(System.in);
			Account a = new Account();
			Loop : while(true) {
			System.out.println("���ϴ� �ŷ� �Է� : ");
			System.out.println("[1] �Ա�(Deposit)");
			System.out.println("[2] ���(withdraw)");
			System.out.println("[3] ��ȸ(check)");
			System.out.println("[4] ����(end)");
			select=  c.nextInt();
			balance = c.nextLong();
			switch (select) {
			case 1: a.deposit(balance);break;
			case 2 : a.withdraw(balance);break;
			case 3 : a.check();break;
			case 4 : break Loop;
			default:
				throw new IllegalArgumentException("Unexpected value: " + select);
			}
			}
	}

}
