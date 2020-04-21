package thuvien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Quanlistk {
	Scanner in = new Scanner(System.in);
	 ArrayList<Sachthamkhao> stk = new ArrayList<Sachthamkhao>();
	 public Quanlistk(){};
	 public void nhapsach() {
		 System.out.println("Ban hay nhap thong tin sach tham khao");
		 System.out.println("ma sach: ");
		 String masach = in.nextLine();
		 System.out.println("tieu de: ");
		 String tieude = in.nextLine();
		 Calendar calendar = Calendar.getInstance();
		 SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		 String ngaynhap = formater.format(calendar.getTime());
		 System.out.println("don gia: ");
		 int dongia = in.nextInt();
		 System.out.println("so luong: ");
		 int soluong = in.nextInt();
		 System.out.println("nha xuat ban: ");
		 in.nextLine();
		 String nhaxuatban = in.nextLine();
		 System.out.println("chuyen nganh: ");
		 String chuyennganh = in.nextLine();
		 System.out.println("thue: ");
		 int thue = in.nextInt();
		 
		 stk.add(new Sachthamkhao(masach, tieude, ngaynhap, dongia,soluong, nhaxuatban, chuyennganh, thue));
	}
	 public void thongtinsach() {
		 System.out.printf("%-12s%-12s%-12s%-12s%-12s%s\n", "tieu de", "dongia","soluong","nhaxuatban","chuyennganh","ngaynhap");
		 for(int i = 0; i< stk.size(); i++) {
		 Sachthamkhao s1 = stk.get(i);
		 System.out.printf("%-12s%-12d%-12d%-12s%-12s%s\n",s1.tieude,s1.dongia,s1.soluong,s1.nhaxuatban,s1.getChuyennganh(),s1.ngaynhap);
	     }
    }
	 public void tongthanhtien() {
		 int sum = 0;
		 
		 for(int i = 0; i< stk.size(); i++) {
			sum += stk.get(i).dongia*stk.get(i).soluong + stk.get(i).getThue(); 
		 }
		System.out.println("tong thanh tien stk: "+sum);
		
	 }
	 public void tbcong() {
     int sum = 0;
		 
		 for(int i = 0; i< stk.size(); i++) {
			sum += stk.get(i).dongia; 
		 }
		System.out.println("trung binh cong don gia stk: "+ (float)sum/(float)stk.size());
	 }
}
