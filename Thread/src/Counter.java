
public class Counter {
	private int value = 0;
	public synchronized void increment() {value++;}
	public synchronized void decrement() {value--;}
	public synchronized void printCounter() {System.out.println(value);}
	
	//synchronized �� �ϳ��� �����尡 ���� �޼ҵ带 �����ϴ� ���� �ٸ� ������� ������ �޼ҵ带 ������ �� ����.
	//�ϳ��� �����尡 �Ӱ迵���� �����ϸ� �ٸ� ��������� ���� Ǯ�������� ��ٸ�����.
}
