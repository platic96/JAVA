package p386;

public class Grade implements Comparable<Grade> {
	private String grade;
	private int number;
	
	public Grade(int number,String grade) {
		this.grade = grade;
		this.number	=number;
	}
	@Override
	public String toString() {
		return grade;
	}
	@Override
	public int compareTo(Grade g) {
//		return number - g.number;
		return grade.compareTo(g.grade);
	}
}
