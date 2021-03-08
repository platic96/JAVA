package treeSet_Home;

public class Member implements Comparable<Member> {
	private String ID;
	private String Name;
	
	public Member() {}
	public Member(String ID,String Name) {
		this.ID = ID;
		this.Name = Name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String toString() {
		return getID()+"\t"+getName();
	}
	@Override
	public int compareTo(Member m1) {
		return this.ID.compareTo(m1.ID);
	}

}