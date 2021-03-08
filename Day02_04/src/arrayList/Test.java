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
			System.out.println("이름을 입력하세요.");
			tmp = sc.next();
			name.add(tmp);
		}
		System.out.println("검색할 이름을 입력하세요.");
		tmp = sc.next();
		if(name.contains(tmp))
			System.out.println(tmp+"가 있습니다.");
		else
			System.out.println(tmp+"가 없습니다.");
		
	}

}
