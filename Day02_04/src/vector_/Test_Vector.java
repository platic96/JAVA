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
		System.out.println("랜덤한 값중 가장 작은 값은 : "+ min+"가장 큰 값은 :"+max + "따라서 두 수의 합은 :"+(max+min));
	}
}
