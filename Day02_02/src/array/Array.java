package array;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] arr1[]; int[] arr2 = {1,2,3}; int[] arr3 = new int[5]; int[] arr4 = new
		 * int[] {1,2,3,4,5}; int arr5[]; int[] arr6[] = new int[3][];
		 */  
		  
		  
		/*
		 * int[] source = new int[] { 5, 4, 6, 9, 7, 9 }; int[] target = { 100, 200,
		 * 300, 400, 500, 600, 700 }; // 부분 배열 복사의 예 System.arraycopy(source, 2, target,
		 * 3, 4); 
		 for (int i : target) {
		  System.out.println(i); }*/
		 
		 Scanner input = new Scanner(System.in);
		int[][] b= new int[3][4];
		
		for(int i=0;i<b.length;++i) {
			for(int j=0;j<b[i].length;++j) {
				b[i][j] = input.nextInt();
			}
		}
		
		for(int i=0;i<b.length;++i) {
			for(int j=0;j<b[i].length;++j) {
				System.out.println(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
