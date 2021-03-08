package callname;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CallnameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> member = new HashMap<String,String>();
		
		Scanner sc = new Scanner(System.in);
		int input;
		String name;
		String number;
		while(true) {
			System.out.println("1. 이름저장\n2.이름검색\n3.끝내기");
			input = sc.nextInt();
			switch(input) {
			case 1: 
				System.out.println("저장할 이름을 쓰시오.");
				name = sc.next();
				System.out.println("저장할 번호를 쓰시오");
				number = sc.next(); 
				member.put(name, number);
				System.out.println("저장되었습니다.");
				break;
			case 2: 
				System.out.println("찾을 이름을 검색하세요");
				name = sc.next();
				if(member.containsKey(name))
					for(String keys : member.keySet())
						System.out.println("찾으시는 전화번호는 :" + member.get(keys));
				else{
					System.out.println("해당 이름는 없습니다.");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}

	static void menu() {
		System.out.println("1. 이름저장\n2.이름검색\n3.끝내기");
	}
}
