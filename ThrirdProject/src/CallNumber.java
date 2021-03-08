import java.util.HashMap;
import java.util.Map;

public class CallNumber {	
	private String name;
	private String number;
	Map<String, String> member;
	
	public CallNumber() {
		member = new HashMap<String,String>();
	}
	
	public void Add(String name,String number) {
		member.put(name, number);
	}
	
}
