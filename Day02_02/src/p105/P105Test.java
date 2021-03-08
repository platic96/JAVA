package p105;

import java.util.Scanner;

public class P105Test {
final static int STUDENT = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[STUDENT];
		getValue(scores);
		getAverage(scores);
		Printscores(scores);
	}

	private static void getValue(int[] array) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<array.length;i++)
		{
			System.out.println("성적을 입력하시오 : ");
			array[i] = sc.nextInt();
		}
	}
	
	private static void getAverage(int[] array) {
		int total = 0;
		for(int i=0;i<array.length;++i) {
			total+=array[i];
		}
		System.out.println("평균 : "+total/array.length);
	}
	
	private static void Printscores(int[] array) {
		for(int i : array) {
			System.out.println(i);
		}
		
	}
}
