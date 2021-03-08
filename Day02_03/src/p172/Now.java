package p172;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Now {

	SimpleDateFormat dayTime = new SimpleDateFormat("[hh:mm:ss]");
	private String time = dayTime.format(new Date());
	
	private String name = "";
	public String getTime() {
		return time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void settime(String time) {
		this.time = time;
	}
	
}
