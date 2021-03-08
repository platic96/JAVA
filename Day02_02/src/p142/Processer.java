package p142;

public class Processer extends Person {
	public Processer(String name, int age) {
		super(name,age);
		this.job = "교수";
	}
	
	public void Behavior() {
		System.out.println(name + " " + age + "세 "+ job + "행동 : : 과제 제출중");
	}
}
