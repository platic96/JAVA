package p172;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P172Test {
	public static void main(String[] args) {
		SimpleDateFormat dayTime = new SimpleDateFormat("[hh:mm:ss]");
		Scanner sc = new Scanner(System.in);
		Now now = new Now();
		
		System.out.println("���� �ð� : " + now.getTime());
		System.out.println("���� �̸� : " + now.getName());
		
		System.out.println("������ �̸��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
		now.setName(str);
		String time1 = dayTime.format(new Date());
		now.settime(time1);
		System.out.println("���� �ð� : " + now.getTime());
		System.out.println("���� �ð� : "+ now.getName());
	}
}
