package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
		String tmp;
		for(int i=0;i<5;++i) {
			System.out.println("�̸��� �Է��ϼ���.");
			tmp = sc.next();
			name.add(tmp);
		}
		System.out.println("�˻��� �̸��� �Է��ϼ���.");
		tmp = sc.next();
		if(name.contains(tmp))
			System.out.println(tmp+"�� �ֽ��ϴ�.");
		else
			System.out.println(tmp+"�� �����ϴ�.");
		
	}

}
