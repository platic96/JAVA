package movieStore;

import java.util.Scanner;

import java.util.ArrayList;

public class Reservation {
	public static void Print_seat(ArrayList<Seat> st) {
		for(int i=0;i<st.size();++i)
		{
			if(st.get(i).isPrimise()==false)
				System.out.print("0"+"\t");
			else
				System.out.print("1"+"\t");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Seat> st = new ArrayList<Seat>();
		Scanner seat = new Scanner(System.in);
		for(int i=0;i<10;++i) {
			st.add(new Seat());
		}
		int idx;
		while(true) {
			Print_seat(st);
			System.out.println();
			System.out.println("���� �Ͻ� �¼��� ������ �ּ��� : ");
			idx = seat.nextInt();
			if(idx <=0 || idx>st.size()) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				continue;
			}
				
			st.get(idx-1).Reservation(idx);
			if(st.get(idx-1).iscnt()==st.size())
				break;
		}
	}

}
