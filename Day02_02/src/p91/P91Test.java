package p91;

public class P91Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		System.out.println("구구단 출력");
		
		while (a<=9) {
			int j=1;
			while(j<=9) {
				System.out.println(a+"*"+j+"="+a*j);
				j++;
			}
			a++;
		}
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		int b=1;
		do {
			System.out.printf("b의 값 : %d\n",b);
			b++;
		}while(b<=10);
	}

}
