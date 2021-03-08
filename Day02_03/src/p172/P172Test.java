package p172;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P172Test {
	public static void main(String[] args) {
		SimpleDateFormat dayTime = new SimpleDateFormat("[hh:mm:ss]");
		Scanner sc = new Scanner(System.in);
		Now now = new Now();
		
		System.out.println("현재 시간 : " + now.getTime());
		System.out.println("현재 이름 : " + now.getName());
		
		System.out.println("변경할 이름을 입력하시오 : ");
		String str = sc.nextLine();
		now.setName(str);
		String time1 = dayTime.format(new Date());
		now.settime(time1);
		System.out.println("현재 시간 : " + now.getTime());
		System.out.println("현재 시간 : "+ now.getName());
	}
}
