package array;

//������ �帧�� ���

public class App {
	
	//�̱��� ���� �ڵ� ---------------------------------
	public App() {
		Init();
	}
	//�ڽ��� static ��ü ����
	private static App Singleton = new App();
	
	//���������� ������ �ڽ��� ��ü�� �ܺο� ���� �ż��� �ʿ�
	public static App getInstance() {
		return Singleton;
	}
	
	//----------------------------------------------
	//������
	
	
	//�ż���
	//�ʱ�ȭ ����
	public void Init() {
		BitGloval.Logo();
	}
	
	//�ݺ��� ���� - ����()
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
	
	//���α׷� ���� 
	public  void Exit() {
		BitGloval.Ending();
	}
}
