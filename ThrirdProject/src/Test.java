import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> member = new HashMap<String,String>();
		
		Scanner sc = new Scanner(System.in);
		int input;
		String name;
		String number;
		while(true) {
			menu();
			input = sc.nextInt();
			switch(input) {
			case 1: 
				System.out.println("������ �̸��� ���ÿ�.");
				name = sc.next();
				System.out.println("������ ��ȣ�� ���ÿ�");
				number = sc.next(); 
				member.put(number, name);
				System.out.println("����Ǿ����ϴ�.");
				break;
			case 2: 
				System.out.println("ã�� ��ȣ�� �˻��ϼ���");
				name = sc.next();
				if(member.containsKey(name))
//					for(String keys : member.keySet())
//						System.out.println("ã���ô� ��ȭ��ȣ�� :" + member.get(keys));
					System.out.println("ã���ô� ��ȣ�� �̸��� :" + member.get(name));
				else{
					System.out.println("�ش� ��ȣ�� �����ϴ�.");
				}
				break;
			case 3:
				System.out.println("������ ��ȣ�� ���ÿ�");
				name = sc.next();
				if(member.containsKey(name))
					member.remove(name);
				else{
					System.out.println("�ش� ��ȣ�� �����ϴ�.");
				}				
				
			case 4:
				System.out.println("�̸�\t��ȣ");
				for(String keys : member.keySet()) {
					System.out.println(member.get(keys)+"\t"+keys);
				}break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			
			}
		}
	}

	static void menu() {
		System.out.println("1. �̸�����\n2.�̸��˻�\n3.��ȣ����\n4.��ȣ ��ü���\n5. ����");
	}
}
