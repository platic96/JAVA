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
		System.out.println("메뉴를 입력하세요.\n 1. 치킨\n 2.피자\n 3.족발\n 4.보쌈\n 5. 뼈다귀해장국\n 6. 나가기");
		
		Scanner s2 = new Scanner(System.in);
		int menu;
		System.out.print("메뉴 입력 :\t ");
		Loop : while(true) {
			menu = s2.nextInt();
			switch(menu) {
			case 1: System.out.println("치킨을 선택하셨습니다.");
			this.exprive(10000);
			this.save("치킨");
			this.print();
			break;
			case 2: System.out.println("피자을 선택하셨습니다.");
			this.exprive(18000);
			this.save("피자");
			this.print();
			break;
			case 3: System.out.println("족발을 선택하셨습니다.");
			this.exprive(38000);
			this.save("족발");
			this.print();
			break;
			case 4: System.out.println("보쌈을 선택하셨습니다.");
			this.exprive(38000);
			this.save("보쌈");
			this.print();
			break;
			case 5: System.out.println("뼈다귀 해장국을 선택하셨습니다.");
			this.exprive(5000);
			this.save("뼈다귀 해장국");
			this.print();
			break;
			case 6: System.out.println("나가기 를 선택하셨습니다.");
			break Loop;
			default:
				break;
			}
		}
	}
	
	public void print() {
		System.out.println("추가 메뉴를 선택해주세요.");
	}
	public void receipt() {
			System.out.println(" ");
			System.out.println("영수증 내역과 총 금액입니다.");
			int i=0;
			
			LinkedList tmp = (LinkedList) q;
			ListIterator it = tmp.listIterator();
			
			while(it.hasNext()) {
				System.out.println(++i + "." + it.next());
			}
			System.out.println("");
			System.out.println("총 금액 : \t" + this.exprice);
	}
}
