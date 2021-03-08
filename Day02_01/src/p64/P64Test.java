package p64;

public class P64Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[] = {'A','B','C','D'};
		System.out.println(str1);
		System.out.println(str1.length);
		
		String a = "hellow";
		String b = "Hellow";
		String ssn = "950201-1124444";
		
		//b에서 ll을 추출
		System.out.println(a.substring(2,4));
		
		System.out.println(b.toLowerCase());
		
		System.out.println(b.toUpperCase());
		
		System.out.println(ssn.charAt(7)== '1' ? "man" : "woman");
		
	}

}
