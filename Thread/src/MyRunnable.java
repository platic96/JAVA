
public class MyRunnable implements Runnable {
	private String myName;
	public MyRunnable(String name) {
		this.myName = name;
	}
	public void run() {
		for(int i =10;i>=0;--i) {
			System.out.println(myName+i+" ");
		}
	}

}
