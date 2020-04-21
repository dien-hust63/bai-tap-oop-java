package thuvien;

public class Sachgiaokhoa extends Sach {
	private String tinhtrang;
	public Sachgiaokhoa() {};
	public Sachgiaokhoa(String masach, String tieude, String ngaynhap, int dongia, int soluong, String nhaxuatban, String tinhtrang ) {
		this.masach = masach;
		this.tieude = tieude;
		this.ngaynhap = ngaynhap;
		this.dongia = dongia;
		this.soluong = soluong;
		this.nhaxuatban = nhaxuatban;
		this.tinhtrang = tinhtrang;
	}
	public String getTinhtrang() {
		return tinhtrang;
	}
	public void setTinhtrang(String a) {
		this.tinhtrang = a;
	}
}
