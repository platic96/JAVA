package queue;

import java.util.Scanner;

public class Packagetest {
	
	public static void main(String[] args) {
		Customer cus = new Customer();
		Scanner sc = new Scanner(System.in);
		int input;
		Loop : while(true) {
			try {
				System.out.println("행동을 선택하시오.");
				System.out.println("1. 메뉴\n 2. 영수증보기\n 3. 종료");
				input = sc.nextInt();
				switch(input) {
				case 1: System.out.println("메뉴를 선택하셨습니다.\n 메뉴 항목으로 넘어갑니다.");
				cus.menu();break;
				case 2: System.out.println("영수증보기를 선택하셨습니다. \n 영수증 내역은 다음과 같습니다.");
				cus.receipt();break;
				case 3: System.out.println("구매를 종료합니다");break Loop;
				default:
					break;
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
