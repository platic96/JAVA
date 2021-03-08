import java.util.HashSet;

public class TEst {
	
	
	public static void main(String[] args) {
		
		HashSet<person> set = new HashSet<person>();
		String p1 = new String("abc");
		String p2 = new String("abc");
		
		String p3 = "abc";
		String p4 = "abc";
		
		System.out.println(p1==p2);
		System.out.println(p3==p4);
		
		person p5 = new person("kim", 10);
		person p6 = new person("kim", 10);
		
		System.out.println(p5.equals(p6));
		
		set.add(new person("kim",10));
		set.add(new person("kim",10));
		
		System.out.println(set);
	}
}


class person{
	String name;
	int age;
	
	person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ", " + age;
	}
}