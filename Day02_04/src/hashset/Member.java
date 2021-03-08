package hashset;

public class Member implements Comparable<Member>{
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
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member temp = (Member)obj;
			return ID.equals(temp.ID);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return ID.hashCode();
		//return (ID+Name).hashCode();
	}
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
