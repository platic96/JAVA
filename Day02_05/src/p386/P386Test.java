package p386;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P386Test {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Grade array[] = {new Grade(20130001,"A+"),new Grade(20130002,"C+"),new Grade(20130003, "B+"),new Grade(20130004,"D")};
		List<Grade> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
				
		}
	}

