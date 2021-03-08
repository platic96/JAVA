package p381;

import java.util.HashMap;
import java.util.Map;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String,Integer>();
		
		String[] st = {"one","two","one","three","a","b"};
		
		for(String a :st) {
			Integer freg = m.get(a);
			m.put(a, (freg == null) ? 1: freg+1);
		}
		
		System.out.println(m.size()+"단어가 있습니다.");
		System.out.println(m.containsKey("a"));
		System.out.println(m.isEmpty());
		System.out.println(m);
	}

}