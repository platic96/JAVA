package p142;

public class Processer extends Person {
	public Processer(String name, int age) {
		super(name,age);
		this.job = "����";
	}
	
	public void Behavior() {
		System.out.println(name + " " + age + "�� "+ job + "�ൿ : : ���� ������");
	}
}
