package vector_;

import java.util.Random;
import java.util.Vector;

public class Test_Vector {
	public static void main(String[] args) {
		Random r= new Random();
		
		Vector<Integer> num = new Vector<Integer>();
		for(int i=0;i<5;++i) {
			num.add(r.nextInt(100));
		}
		int max = -1;
		int min = 101;
		for(int v : num) {
			if(v <min)
				min = v;
			if(v>max)
				max = v;
		}
		System.out.println("������ ���� ���� ���� ���� : "+ min+"���� ū ���� :"+max + "���� �� ���� ���� :"+(max+min));
	}
}
