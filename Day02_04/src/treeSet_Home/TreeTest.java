package treeSet_Home;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class TreeTest {
	public static void print_menu() {
		System.out.println("1. ȸ������");
		System.out.println("2. ȸ��Ż��");
		System.out.println("3. ȸ����ȸ");
		System.out.println("4. ����");
		
	}

	public static void main(String[] args) {
	TreeSet<Member> mem = new TreeSet<Member>();
	Scanner sc = new Scanner(System.in);
	int num;
	String ID=new String();
	String Name=new String();
	
	
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
