package p142;

public class Student extends Person{

	public Student(String name, int age) {
		super(name,age);
		this.job = "切积";
	}
	
	public void Behavior() {
		System.out.println(name + " " + age + "技 "+ job + "青悼 : : 苞力吝");
	}
}
