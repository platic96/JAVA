package linkedlist;

import java.util.*;

public class Test8 {

	public static void main(String[] args) {
		List<String> list =  new LinkedList<String>();
		list.add("홍길동");
		list.add("최길동");
		list.add("김길동");
		
		list.set(0, "남길동");
		String s = list.get(0);
		int size = list.size();
		
		for(int i=0;i<size;++i) {
			System.out.println(list.get(i));
		}
	}
}
