
public class TV extends Product{
	private int price;
	public TV(int Money) {
		super("TV");
		this.allPrice = Money;
		this.price = 100;
		
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
