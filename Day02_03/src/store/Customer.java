package store;

public class Customer {
	private String ID;
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getBonus_Point() {
		return Bonus_Point;
	}

	public void setBonus_Point(int bonus_Point) {
		Bonus_Point = bonus_Point;
	}

	public int getStack_Persent() {
		return Stack_Persent;
	}

	public void setStack_Persent(int stack_Persent) {
		Stack_Persent = stack_Persent;
	}

	private String name;
	private String level;
	private int Bonus_Point;
	private int Stack_Persent;
	
	public class Vip{
		private String Menager;
		private int discount;
	}
	
}
