
public class MyThreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t= new MyThread();
//		t.start();
//		Thread t = new Thread(new MyRunnable());
//		t.start();
//		Thread t = new Thread(new MyRunnable("A"));
//		Thread t1 = new Thread(new MyRunnable("B"));
//		
//		t.start();
//		t1.start();
		
		Counter c = new Counter();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
	}

}
