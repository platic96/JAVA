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
			System.out.println("������ ��ǰ�� �����ϼ���.\n 1. TV\n2. Computer");
			select = sc.nextInt();
			switch(select) {
			case 1:
				input = tv.Buy();
				tv.exprive();
				System.out.println(tv.toString());
				if(input<100) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("���̻� �߰� ���Ű� �Ұ����ϹǷ� �����մϴ�.");
					System.exit(0);
				}
				else {
					System.out.println("��ǰ �߰� ���Ű� �����մϴ�.");
				}
				
				break;
			case 2:
				input = com.Buy();
				com.exprive();
				System.out.println(com.toString());
				if(input<200) {
					System.out.println("�ܾ��� �����մϴ�.");
					break;
				}
				else if(input >100){
					System.out.println("��ǰ �߰� ���Ű� �����մϴ�.");
				}
				else {
					System.out.println("���̻� �߰� ���Ű� �Ұ����ϹǷ� �����մϴ�.");
					System.exit(0);
				}
				
				break;
			default:
					break;
			}
		}
	}

}
