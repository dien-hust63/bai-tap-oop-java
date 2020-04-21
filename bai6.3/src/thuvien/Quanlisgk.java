package thuvien;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Quanlisgk {
	Scanner in = new Scanner(System.in);
	 ArrayList<Sachgiaokhoa> sgk = new ArrayList<Sachgiaokhoa>();
	 public Quanlisgk(){};
	 public void nhapsach() {
		 System.out.println("Ban hay nhap thong tin sach giao khoa");
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
		 System.out.println("tinh trang ( moi or cu ): ");
		 String tinhtrang = in.nextLine();
		 sgk.add(new Sachgiaokhoa(masach, tieude, ngaynhap, dongia,soluong, nhaxuatban, tinhtrang));
	}
	 public void thongtinsach() {
		 System.out.printf("%-12s%-12s%-12s%-12s%s\n", "tieu de", "dongia","soluong","ngaynhap","nhaxuatban");
		 for(int i = 0; i< sgk.size(); i++) {
		 Sachgiaokhoa s1 = sgk.get(i);
		 System.out.printf("%-12s%-12d%-12d%-12s%s\n",s1.tieude,s1.dongia,s1.soluong,s1.ngaynhap,s1.nhaxuatban);
	     }
     }
	 public void tongthanhtien() {
		 int sum = 0;
		 
		 for(int i = 0; i< sgk.size(); i++) {
			 
			 if(sgk.get(i).getTinhtrang().equals("moi")) {
				 sum += sgk.get(i).dongia * sgk.get(i).soluong;
			 }
			 else sum += sgk.get(i).dongia * sgk.get(i).soluong*0.5;
		 }
		System.out.println("tong thanh tien sgk: "+sum);
		
	 }
	 public void findsach(String a) {
		 int b = 0;
		 for(int i=0; i< sgk.size(); i++) {
			 if(sgk.get(i).nhaxuatban.equalsIgnoreCase(a)) {
				 b++;
				 this.thongtinsach();
			 }
		 }
		 if(b == 0) System.out.println("khong tim thay sach");
		 
	 }
}