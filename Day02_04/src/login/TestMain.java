package login;

import java.util.ArrayList;
import java.util.Scanner;


public class TestMain {
	public static void Print_Menu() {
		System.out.println("�����Ͻ� ��ȣ�� ������");
		System.out.println("1: ȸ�� ����");
		System.out.println("2: ȸ�� ��� ��ȸ");
		System.out.println("3: ����");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> member = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		int input;
		String[] person = new String[2];
 		Loop : while(true) {
 			Print_Menu();
			input = sc.nextInt();
			switch(input) {
			case 1 :
				System.out.println("ȸ�������� ���̵� �Է��ϼ���.");
				person[0] = sc.next();
				System.out.println("ȸ�������� ��й�ȣ�� �Է��ϼ���.");
				person[1] = sc.next();
				member.add(new User(person[0],person[1]));
				break;
			case 2 : 
				System.out.println("ID\tPassward");
				for(User u : member) {
					System.out.println(u);
				}
				break;
			case 3: break Loop;
			}
 		}

	}
}
