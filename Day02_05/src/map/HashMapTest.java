package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Map<String, String> map = new HashMap<String,String>();
//		Scanner sc = new Scanner(System.in);
//		String input;
//		
//		map.put("java", "자바");
//		map.put("school", "학교");
//		map.put("map", "지도");
//		
//		while(true) {
//			try {
//				input=  sc.next();
//				if(input.equals("quit"))
//					break;
//				if(map.containsKey(input))
//					System.out.println(map.get(input));
//				else
//					System.out.println("해당 단어가 존재하지 않습니다.");
//				while(it.hasNext()) {
//					String key= it.next();
//					if(key.equals(input))
//						System.out.println(map.get(key));
//					
//				//}
//			}catch (Exception e) {
//				// TODO: handle exception
//			}
//		
//		}
//	}
		Map<String, Integer> map = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		int person;
		String contry;
		
		for(int i=0;i<3;i++) {
			contry = sc.next();
			person = sc.nextInt();
			map.put(contry, person);
		}
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		int maxperson = -1;
		while(it.hasNext()) {
			String tmp = it.next();
			if(map.get(tmp)>maxperson)
			{
				maxperson = map.get(tmp);
			}
		}
		System.out.println(maxperson);
	}
}
