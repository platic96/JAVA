package p214;

public class Beercan extends EmptyCan{
	public void printContent() {
		System.out.println("хФ╦фаж");
	}
	public void printName() {
	System.out.println("╦фажд╣ ют╢о╢ы.");
	}
	public void sayHello() {
		System.out.println("╬хЁГго╪╪©Д ╦фажд╣ют╢о╢ы.");
	}
	
	public static void main(String[] args) {
	Beercan b = new Beercan();
	b.printContent();
	b.printName();
	b.sayHello();
	}
}
