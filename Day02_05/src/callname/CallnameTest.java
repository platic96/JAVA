package callname;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CallnameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> member = new HashMap<String,String>();
		
		Scanner sc = new Scanner(System.in);
		int input;
		String name;
		String number;
		while(true) {
			System.out.println("1. �̸�����\n2.�̸��˻�\n3.������");
			input = sc.nextInt();
			switch(input) {
			case 1: 
				System.out.println("������ �̸��� ���ÿ�.");
				name = sc.next();
				System.out.println("������ ��ȣ�� ���ÿ�");
				number = sc.next(); 
				member.put(name, number);
				System.out.println("����Ǿ����ϴ�.");
				break;
			case 2: 
				System.out.println("ã�� �̸��� �˻��ϼ���");
				name = sc.next();
				if(member.containsKey(name))
					for(String keys : member.keySet())
						System.out.println("ã���ô� ��ȭ��ȣ�� :" + member.get(keys));
				else{
					System.out.println("�ش� �̸��� �����ϴ�.");
				}
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}
	}

	static void menu() {
		System.out.println("1. �̸�����\n2.�̸��˻�\n3.������");
	}
}
