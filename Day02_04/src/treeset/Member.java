package treeset;

public class Member implements Comparable<Member> {
	private String name;
	private int cnt;

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Member(String name) {
		this.name = name;
	}
	
	public Member(int cnt,String name) {
		this.cnt = cnt;
		this.name = name;
	}
//	@Override
//	public int compareTo(Member m1) {
//		return (this.name.compareTo(m1.name));
//	}
	@Override
	public int compareTo(Member m1) {
		return (this.cnt - m1.cnt);
	}
	@Override
	public String toString() {
		return getCnt() + " " + getName();
	}
	
}
