package p113;

public class P113Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[][] score = {{60,70,80},{70,80,90},{80,90,100}};
		int[] student = new int[3];
		int[] subject = new int[3];
		
		for(int i=0;i<score.length;++i) {
			for(int j =0;j<score[i].length;++j)
				student[i] += score[i][j];
			System.out.println("รัมก : " + student[i]);
		}*/
		
		int[][] score = {
				{10,10,10},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		//System.arraycopy(score, 0, result, 0, score.length);
		for(int i=0;i<score.length;++i) {
			for(int j=0;j<score[i].length;++j) {
				result[i][score[i].length] += score[i][j];
				result[score.length][j] += score[i][j];
				result[score.length][score[i].length] += score[i][j];
			}
		}
	}
}