package linkedlist;

import java.util.*;

public class Test8 {

	public static void main(String[] args) {
		List<String> list =  new LinkedList<String>();
		list.add("ȫ�浿");
		list.add("�ֱ浿");
		list.add("��浿");
		
		list.set(0, "���浿");
		String s = list.get(0);
		int size = list.size();
		
		for(int i=0;i<size;++i) {
			System.out.println(list.get(i));
		}
	}
}
