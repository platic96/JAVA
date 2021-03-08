
public class MyThread extends Thread {
	Counter sharedCounter;
	
	MyThread(Counter c){
		this.sharedCounter = c;
	}
	
	public void run() {
		int i = 0;
		while(i<20000) {
			sharedCounter.increment();
			sharedCounter.decrement();
			if(i % 40 == 0) {
				sharedCounter.printCounter();
				try {
					sleep((int)(Math.random()*2));
				}catch (Exception e) {
					// TODO: handle exception
					i++;
				}
			}
		}
	}
}