package thuvien;



public class Sachthamkhao extends Sach {
	private String chuyennganh;
	private int thue;
	public Sachthamkhao() {};
	public Sachthamkhao(String masach, String tieude, String ngaynhap, int dongia, int soluong, String nhaxuatban, String chuyennganh, int thue) {
		this.masach = masach;
		this.tieude = tieude;
		this.ngaynhap = ngaynhap;
		this.dongia = dongia;
		this.soluong = soluong;
		this.nhaxuatban = nhaxuatban;
		this.chuyennganh = chuyennganh;
		this.thue = thue;
	}
	public String getChuyennganh() {
		return chuyennganh;
	}
	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	public int getThue() {
		return thue;
	}
	public void setThue(int thue) {
		this.thue = thue;
	}
	
}
