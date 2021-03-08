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
			System.out.println(idx+"번째 좌석이 예약되었습니다.");
			this.primise = true;
			this.cnt++;
		}
		else
			System.out.println(idx +"번째 좌석은 예약되어있습니다. 다시 진행해주세요.");
	}
}
