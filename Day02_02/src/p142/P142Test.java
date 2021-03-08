package p142;

import java.util.concurrent.Flow.Processor;

public class P142Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("¿µÈñ", 24);
		Processer pc = new Processer("Ã¶¼ö", 40);
		
		st.Behavior();
		pc.Behavior();
	}

}
