package p142;

public class Student extends Person{

	public Student(String name, int age) {
		super(name,age);
		this.job = "학생";
	}
	
	public void Behavior() {
		System.out.println(name + " " + age + "세 "+ job + "행동 : : 과제중");
	}
}
