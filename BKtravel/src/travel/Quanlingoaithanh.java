package travel;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlingoaithanh {
	ArrayList<xengoaithanh> xe2 = new ArrayList<xengoaithanh>();
	public Quanlingoaithanh() {};
	
	public void nhapthongtin() {
		Scanner in = new Scanner(System.in);
		System.out.println("ma so chuyen:" );
		String msc = in.nextLine();
		System.out.println("ten tai xe:");
		String ttx = in.nextLine();
		System.out.println("so xe:" );
		int soxe = in.nextInt();
		System.out.println("noi den:" );
		in.nextLine();
		String noiden = in.nextLine();
		System.out.println("so ngay di: ");
		long songaydi = in.nextLong();
		System.out.println("doanh thu: " );
		double doanhthu = in.nextDouble();
		xe2.add(new xengoaithanh(msc, ttx, soxe, noiden, songaydi, doanhthu));
	}
	public void xemthongtin() {
		System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%s\n","STT", "ms chuyen", "ten tai xe", "so xe","noi den", "so ngay di","doanh thu" );
		for(int i = 0; i< xe2.size(); i++) {
			xengoaithanh a = xe2.get(i);
			System.out.printf("%-12d%-12s%-12s%-12d%-12s%-12s%f\n", i+1, a.getMschuyen(), a.getTentaixe(), a.getSoxe(),a.getNoiden(),a.getSongaydi(),a.getDoanhthu());
		}
	}
	public double tongdoanhthu() {
		double sum = 0;
		for(int i = 0; i<  xe2.size(); i++) {
			sum += xe2.get(i).getDoanhthu();
		}
		return sum;
	}
}
