package login;

public class User {
	private String ID;
	private String Passward;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassward() {
		return Passward;
	}
	public void setPassward(String passward) {
		Passward = passward;
	}
	public User(String iD, String passward) {
		this.ID = iD;
		this.Passward = passward;
	}
	@Override
	public String toString() {
		return getID()+"\t" + getPassward();
	}
}
