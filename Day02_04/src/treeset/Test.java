package treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] member = {"park","kim","lee"} ;
		Member m1 = new Member(3,"Park");
		Member m2 = new Member(1,"Kim");
		Member m3 = new Member(2,"Lee");
		TreeSet<Member> ts = new TreeSet<Member>();
		Scanner sc = new Scanner(System.in);
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		
		for(Member s :ts) {
			System.out.println(s);
		}
		
	}	

}
