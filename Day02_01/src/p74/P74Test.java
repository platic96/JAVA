package p74;

import java.util.Scanner;

public class P74Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay;
		int hours;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ð��� �Է��ϼ��� : ");
		hours = input.nextInt();
		if(hours> 0)
		{
			pay = hours * 6030;
			System.out.printf("�ӱ��� %d�Դϴ�.", pay);
		}
		else
		{
			System.out.println("�ð��� �� �� �ԷµǾ����ϴ�.");
		}
		input.close();
	}

}
