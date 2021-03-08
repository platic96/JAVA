package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
	public static void print_menu() {
		System.out.println("1. ȸ������");
		System.out.println("2. ȸ��Ż��");
		System.out.println("3. ȸ����ȸ");
		System.out.println("4. ����");
		
	}

	public static void main(String[] args) {
		HashSet<Member> mem = new HashSet<Member>();
		Scanner sc = new Scanner(System.in);
		int num;
		String ID=new String();
		String Name=new String();
		Member tmp = new Member();
		
		
		Loop : while(true) {
			print_menu();
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("���̵� �Է��Ͻÿ�.");
				ID = sc.next();
				System.out.println("�̸��� �Է��Ͻÿ�.");
				Name = sc.next();
				mem.add(new Member(ID,Name));
				break;
			case 2:
				System.out.println("ȸ�� Ż���� ���̵� �Է��Ͻÿ�.");
				ID = sc.next();
				System.out.println("ȸ�� Ż���� �̸��� �Է��Ͻÿ�.");
				Name = sc.next();
				
				Iterator<Member> i =mem.iterator();
				while(i.hasNext()) {
					Member st = i.next();
					if(ID.equals(st.getID()))
					{
						mem.remove(st);
						System.out.println("�ش� ���̵� ���������� �����Ǿ����ϴ�.");
						break;
					}
					if(i.hasNext())
						System.out.println("�ش� ���̵� �� �̸��� �߸��Ǿ����ϴ�.");
					
				}
				break;
			case 3:
				System.out.println("ID\tName");
				for(Member m : mem) {
					System.out.println(m);
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break Loop;
			}
		}
	}

}


// TODO Auto-generated method stub

//HashSet<String> set = new HashSet<String>();
//set.add("Milk");
//set.add("Bread");
//set.add("Butter");
//set.add("Chease");
//set.add("Ham");
//set.add("Ham");
//
//if(set.contains("Ham"))
//	System.out.println("Ham�ִ�.");
//HashSet<String> fruit = new HashSet<String>();
//
//Scanner sc = new Scanner(System.in);
//String s = new String();
//int cnt_1=0;
//int cnt_2=0;
//for(int i=0;i<4;i++) {
//	s=sc.next();
//	if(fruit.add(s)) {
//		cnt_1++;
//	}
//	else
//	{
//		System.out.println(s);
//	}
//	
//}
//System.out.println(cnt_1);
//for(String st : fruit) {
//	System.out.println(st);
//}