package movieStore;

public class Seat {
	private boolean primise;
	private static int cnt=0;

	public boolean isPrimise() {
		return primise;
	}
	public Seat() {
		this.primise = false;
	}
	public int iscnt() {
		return cnt;
	}
	
	public void Reservation(int idx) {
		if(primise==false) {
			System.out.println(idx+"��° �¼��� ����Ǿ����ϴ�.");
			this.primise = true;
			this.cnt++;
		}
		else
			System.out.println(idx +"��° �¼��� ����Ǿ��ֽ��ϴ�. �ٽ� �������ּ���.");
	}
}
