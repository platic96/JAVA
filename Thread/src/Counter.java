
public class Counter {
	private int value = 0;
	public synchronized void increment() {value++;}
	public synchronized void decrement() {value--;}
	public synchronized void printCounter() {System.out.println(value);}
	
	//synchronized 란 하나의 스레드가 공유 메소드를 실행하는 동안 다른 스레드는 공ㅇ유 메소드를 실행할 수 없다.
	//하나의 스레드가 임계영역에 진입하면 다른 스레드들은 락이 풀릴때까지 기다리게함.
}
