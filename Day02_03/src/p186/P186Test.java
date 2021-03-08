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
			System.out.println("원하는 거래 입력 : ");
			System.out.println("[1] 입금(Deposit)");
			System.out.println("[2] 출금(withdraw)");
			System.out.println("[3] 조회(check)");
			System.out.println("[4] 종료(end)");
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
