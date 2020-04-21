package thuvien;


public class Sachngoaingu extends Sach{
	private String ngonngu;
	public Sachngoaingu() {};
	public Sachngoaingu(String masach, String tieude, String ngaynhap, int dongia, int soluong, String nhaxuatban, String ngonngu ) {
		this.masach = masach;
		this.tieude = tieude;
		this.ngaynhap = ngaynhap;
		this.dongia = dongia;
		this.soluong = soluong;
		this.nhaxuatban = nhaxuatban;
		this.ngonngu = ngonngu;
	}
	public void setngonngu(String a) {
		this.ngonngu = a;
	}
	public String getngonngu() {
		return this.ngonngu;
	}
}
