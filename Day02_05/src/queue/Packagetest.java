package queue;

import java.util.Scanner;

public class Packagetest {
	
	public static void main(String[] args) {
		Customer cus = new Customer();
		Scanner sc = new Scanner(System.in);
		int input;
		Loop : while(true) {
			try {
				System.out.println("�ൿ�� �����Ͻÿ�.");
				System.out.println("1. �޴�\n 2. ����������\n 3. ����");
				input = sc.nextInt();
				switch(input) {
				case 1: System.out.println("�޴��� �����ϼ̽��ϴ�.\n �޴� �׸����� �Ѿ�ϴ�.");
				cus.menu();break;
				case 2: System.out.println("���������⸦ �����ϼ̽��ϴ�. \n ������ ������ ������ �����ϴ�.");
				cus.receipt();break;
				case 3: System.out.println("���Ÿ� �����մϴ�");break Loop;
				default:
					break;
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}
