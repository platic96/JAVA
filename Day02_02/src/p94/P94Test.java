package p94;

public class P94Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int n=10,sum =0;
		for(int i=1;i<=n;i++) {
			sum +=i;
		}
		int i=0;
		i = 1;
		while(i <= n) {
			sum +=i;
			i++;
		}
		i = 1;
		do {
			sum+=i;
			i++;
		}while(i<=n);
		System.out.println(sum);
		*/
		int cnt=0;
		for(int i=0;i<=10;i++) {
			if(i%3 == 0) {
				if(i!=0) cnt++;
				continue;
			}
			System.out.println(i);
		}

		System.out.println("3의 배수의 개수는  : "+cnt);
	}

}
