package p142;

public class Student extends Person{

	public Student(String name, int age) {
		super(name,age);
		this.job = "�л�";
	}
	
	public void Behavior() {
		System.out.println(name + " " + age + "�� "+ job + "�ൿ : : ������");
	}
}
