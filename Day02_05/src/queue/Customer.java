package queue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Customer {
	private static Queue q = new LinkedList();
	private int exprice;
	private boolean bool = true;
	
	public void save(String input) {
		if(!"".equals(input))
			this.q.offer(input);
	}
	
	public void exprive(int price) {
		this.exprice += price;
	}
	
	public void menu() {
		
		System.out.println(" ");
		System.out.println("�޴��� �Է��ϼ���.\n 1. ġŲ\n 2.����\n 3.����\n 4.����\n 5. ���ٱ����屹\n 6. ������");
		
		Scanner s2 = new Scanner(System.in);
		int menu;
		System.out.print("�޴� �Է� :\t ");
		Loop : while(true) {
			menu = s2.nextInt();
			switch(menu) {
			case 1: System.out.println("ġŲ�� �����ϼ̽��ϴ�.");
			this.exprive(10000);
			this.save("ġŲ");
			this.print();
			break;
			case 2: System.out.println("������ �����ϼ̽��ϴ�.");
			this.exprive(18000);
			this.save("����");
			this.print();
			break;
			case 3: System.out.println("������ �����ϼ̽��ϴ�.");
			this.exprive(38000);
			this.save("����");
			this.print();
			break;
			case 4: System.out.println("������ �����ϼ̽��ϴ�.");
			this.exprive(38000);
			this.save("����");
			this.print();
			break;
			case 5: System.out.println("���ٱ� ���屹�� �����ϼ̽��ϴ�.");
			this.exprive(5000);
			this.save("���ٱ� ���屹");
			this.print();
			break;
			case 6: System.out.println("������ �� �����ϼ̽��ϴ�.");
			break Loop;
			default:
				break;
			}
		}
	}
	
	public void print() {
		System.out.println("�߰� �޴��� �������ּ���.");
	}
	public void receipt() {
			System.out.println(" ");
			System.out.println("������ ������ �� �ݾ��Դϴ�.");
			int i=0;
			
			LinkedList tmp = (LinkedList) q;
			ListIterator it = tmp.listIterator();
			
			while(it.hasNext()) {
				System.out.println(++i + "." + it.next());
			}
			System.out.println("");
			System.out.println("�� �ݾ� : \t" + this.exprice);
	}
}
