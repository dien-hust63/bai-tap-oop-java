package thuvien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Quanlisnn {
	Scanner in = new Scanner(System.in);
	 ArrayList<Sachngoaingu> snn = new ArrayList<Sachngoaingu>();
	 public Quanlisnn(){};
	 public void nhapsach() {
		 System.out.println("Ban hay nhap thong tin sach ngoai ngu");
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
		 System.out.println("ngon ngu: ");
		 String ngonngu = in.nextLine();
		 snn.add(new Sachngoaingu(masach, tieude, ngaynhap, dongia,soluong, nhaxuatban, ngonngu));
	}
	 public void thongtinsach() {
		 System.out.printf("%-12s%-12s%-12s%-12s%-12s%s\n", "tieu de", "dongia","soluong","nhaxuatban","ngonngu","ngaynhap");
		 for(int i = 0; i< snn.size(); i++) {
		 Sachngoaingu s1 = snn.get(i);
		 System.out.printf("%-12s%-12d%-12d%-12s%-12s%s\n",s1.tieude,s1.dongia,s1.soluong,s1.nhaxuatban,s1.getngonngu(),s1.ngaynhap);
	     }
   }
	 public void tongthanhtien() {
		 int sum = 0;
		 
		 for(int i = 0; i< snn.size(); i++) {
			sum += snn.get(i).dongia*snn.get(i).soluong ;
		 }
		System.out.println("tong thanh tien snn: "+sum);
		
	 }
}
