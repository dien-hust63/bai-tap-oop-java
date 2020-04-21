package travel;
import java.util.Scanner;

public class quanli {
	private static Quanlinoithanh x1;
	private static Quanlingoaithanh x2;
	public static void showMenu() {
		System.out.println("=========Menu========");
		System.out.println("1.Nhap thong tin chuyen xe ");
		System.out.println("2.Xem thong tin chuyen xe");
		System.out.println("3.Tong doanh thu");
		System.out.println("4. Save and exit");
		Scanner in = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("nhap vao gia tri tu 1 -4: ");
		int n =  in.nextInt();
		switch(n) {
		case 1:{
			System.out.println("1. nhap thong tin xe noi thanh");
			System.out.println("2. nhap thong tin xe ngoai thanh");
			System.out.println(" nhap gia trị 1 or 2:");
			int i = in.nextInt();
			switch(i) {
			case 1:{
				x1.nhapthongtin();
				showMenu();
				break;
			}
			case 2: {
				x2.nhapthongtin();
				showMenu();
				break;
			}
			default:{
				System.out.println("Ban nhap sai vui long nhap lai:");
				showMenu();
				break;
			}
			}
			
		}
		case 2:{
			System.out.println("1. xem thong tin xe noi thanh");
			System.out.println("2. xem thong tin xe ngoai thanh");
			System.out.println(" nhap gia trị 1 or 2:");
			int i = in.nextInt();
			switch(i) {
			case 1:{
				x1.xemthongtin();
				break;
			}
			case 2: {
				x2.xemthongtin();
				break;
			}
			default:{
				System.out.println("Ban nhap sai vui long nhap lai:");
				showMenu();
				break;
			}
			}
			showMenu();
			break;
		}
		case 3:{
			System.out.println("tong doanh thu xe noi thanh: "+ x1.tongdoanhthu() );
			System.out.println("tong doanh thu xe ngoai thanh:"+ x2.tongdoanhthu());
			showMenu();
			break;
		}
		case 4:{
			System.out.println("See you again !");
			System.exit(1);
		}
			
		
		default: {
				System.out.println("Bạn nhap sai, vui long nhap lại");
				showMenu();
				break;
		}
		}
	}
	public static void main(String[] args) {
		x1= new Quanlinoithanh();
		x2 = new Quanlingoaithanh();
		showMenu();
		
	}
}
	
	
