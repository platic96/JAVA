package p214;

public class Beercan extends EmptyCan{
	public void printContent() {
		System.out.println("�����");
	}
	public void printName() {
	System.out.println("����ĵ �Դϴ�.");
	}
	public void sayHello() {
		System.out.println("�ȳ��ϼ��� ����ĵ�Դϴ�.");
	}
	
	public static void main(String[] args) {
	Beercan b = new Beercan();
	b.printContent();
	b.printName();
	b.sayHello();
	}
}
