import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		TV tv = new TV(input);
		Computer com = new Computer(input);
		int select;
		
		while(true) {
			System.out.println("구매할 물품을 선택하세요.\n 1. TV\n2. Computer");
			select = sc.nextInt();
			switch(select) {
			case 1:
				input = tv.Buy();
				tv.exprive();
				System.out.println(tv.toString());
				if(input<100) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("더이상 추가 구매가 불가능하므로 종료합니다.");
					System.exit(0);
				}
				else {
					System.out.println("물품 추가 구매가 가능합니다.");
				}
				
				break;
			case 2:
				input = com.Buy();
				com.exprive();
				System.out.println(com.toString());
				if(input<200) {
					System.out.println("잔액이 부족합니다.");
					break;
				}
				else if(input >100){
					System.out.println("물품 추가 구매가 가능합니다.");
				}
				else {
					System.out.println("더이상 추가 구매가 불가능하므로 종료합니다.");
					System.exit(0);
				}
				
				break;
			default:
					break;
			}
		}
	}

}
