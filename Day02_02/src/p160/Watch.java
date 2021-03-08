package p160;

public class Watch {
	private int min;
	private int hour;
	private int second;
	private String brand;
	
	private static int watch_number = 0;
	
	static final int MAX_NUMBER = 5;
	
	public Watch() {}
	
	public Watch(String brand, int hour, int minute, int second) {
		this.brand = brand;
		this.hour = hour;
		this.min = minute;
		this.second = second;
		watch_number++;
	}
	
	public void ToString() {
		System.out.println(brand + " "+ hour + " " +min + " "+ second);
	}
	public static int getWatch_Number() {
		return watch_number;
	}
}
 