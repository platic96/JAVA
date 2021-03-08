
public class Computer extends Product{
	private int price;
	public Computer(int Money) {
		super("Computer");
		this.allPrice = Money;
		this.price = 200;
		
	}
	@Override
	public int Buy() {
		if(allPrice<this.price)
			return allPrice;
		else {
			this.save();
			return this.allPrice-=this.price;	
		}
	}
	public void exprive() {
		this.finaly_Pirce += this.price;
	}
	
}
