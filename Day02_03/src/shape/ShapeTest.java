package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		s1.draw();
		
		((Rectangle)s1).w = 10;
		
		if(s1 instanceof Shape)
			System.out.println("s1 : Shape");
		if(s1 instanceof Rectangle)
			System.out.println("s1 : Rectangle");
		
		Rectangle s2 = new Rectangle();
		((Shape)s2).draw();
		
		
	}
}
