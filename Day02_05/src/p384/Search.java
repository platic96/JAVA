package p384;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random r = new Random();
			int number = r.nextInt(50);
			List<Integer> list= new ArrayList<>();
			for(int i =0;i<50;i++) {
				list.add(r.nextInt(50));
			}
			
			Collections.sort(list);
			System.out.println(list);
			
			int index = Collections.binarySearch(list, number);
			System.out.println("ã�������ϴ� ���ڴ� : "+number + "�Դϴ�.");
			System.out.println("��ġ�� "+index + "�Դϴ�.");
		}

}
