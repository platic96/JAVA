package array;

//실행의 흐름을 담당

public class App {
	
	//싱글톤 패턴 코드 ---------------------------------
	public App() {
		Init();
	}
	//자신의 static 객체 생성
	private static App Singleton = new App();
	
	//내부적으로 생성된 자신의 객체를 외부에 노출 매서드 필요
	public static App getInstance() {
		return Singleton;
	}
	
	//----------------------------------------------
	//생성자
	
	
	//매서드
	//초기화 영역
	public void Init() {
		BitGloval.Logo();
	}
	
	//반복적 실행 - 엔진()
	public void Run() {
		while(true) {
			switch(BitGloval.MenuPrint()) {
			case '0' : return;
			case '1' : System.out.println("Insert");break;
			case '2' : System.out.println("Select");break;
			case '3' : System.out.println("Update");break;
			case '4' : System.out.println("Deleted");break;
			}
			BitGloval.Pause();
		}
	}
	
	//프로그램 종료 
	public  void Exit() {
		BitGloval.Ending();
	}
}
