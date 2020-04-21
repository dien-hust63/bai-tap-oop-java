package travel;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlinoithanh {
	ArrayList<xenoithanh> xe1 = new ArrayList<xenoithanh>();
	
	public void nhapthongtin() {
		Scanner in = new Scanner(System.in);
		System.out.println("ma so chuyen:" );
		String msc = in.nextLine();
		System.out.println("ten tai xe:");
		String ttx = in.nextLine();
		System.out.println("so xe:" );
		int soxe = in.nextInt();
		System.out.println("so tuyen:" );
		in.nextLine();
		String sotuyen = in.nextLine();
		System.out.println("so km di duoc: ");
		double sokm = in.nextDouble();
		System.out.println("doanh thu: " );
		double doanhthu = in.nextDouble();
		xe1.add(new xenoithanh(msc, ttx, soxe, sotuyen, sokm, doanhthu));
		}
	public void xemthongtin() {
		System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%s\n","STT", "mschuyen", "ten tai xe", "so xe","so tuyen", "so km di dc","doanh thu" );
		for(int i = 0; i<  xe1.size(); i++) {
			xenoithanh a = xe1.get(i);
			System.out.printf("%-12d%-12s%-12s%-12d%-12s%-12s%f\n", i+1, a.getMschuyen(), a.getTentaixe(), a.getSoxe(),a.getSotuyen(),a.getSokm(),a.getDoanhthu());
		}
	}
	public double tongdoanhthu() {
		double sum = 0;
		for(int i = 0; i<  xe1.size(); i++) {
			sum += xe1.get(i).getDoanhthu();
		}
		return sum;
	}
}
