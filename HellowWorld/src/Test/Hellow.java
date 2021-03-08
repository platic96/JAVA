package Test;
import java.util.Scanner;

public class Hellow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x,y;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하시오 : ");
		x = input.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오 : ");
		y = input.nextInt();
		
		sum = x/y;
		System.out.println(sum);
		System.out.println("나눈 값 = " + x/y);
	}
}
