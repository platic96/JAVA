import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Product {
	public String Name;
	static int allPrice;
	static int finaly_Pirce;
	static Queue<String> list = new LinkedList<String>();
	
	public Product(String Name) {
		this.Name = Name;
	}

	public int Buy() {return this.allPrice;}
	
	public void save() {
		if(!"".equals(Name))
			this.list.offer(Name);
	}
	@Override
	public String toString() {
		return "TV"+" "+ allPrice+" "+finaly_Pirce+" "+list;
	}
}
