package array;

import java.util.Scanner;

public class BitGloval {
	static Scanner sc = new Scanner(System.in);

	//�޼���
	public static void Logo() {
		System.out.println("***********************");
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("2021.02.09");
		System.out.println("�迭 �ڷᱸ���� Ȱ���� ȸ�� ���� ���α׷�");
		System.out.println("���ο�");
		System.out.println("***********************");
	}
	
	public static void Ending() {
		System.out.println("***********************");
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println("***********************");
	}
	
	public static char MenuPrint() {

		System.out.println("***********************");
		System.out.println("[0]. ���α׷�����\n");
		System.out.println("[1]. ����\n");
		System.out.println("[2]. �˻�\n");
		System.out.println("[3]. ����\n");
		System.out.println("[4]. ����\n");
		System.out.println("***********************");
		System.out.println(" >> ");
		return sc.nextLine().charAt(0);
	}
	
	//pause ���ߴ� ���
	public static void Pause() {
		System.out.println("����Ű�� ��������.");
		sc.nextLine();
	}
}
