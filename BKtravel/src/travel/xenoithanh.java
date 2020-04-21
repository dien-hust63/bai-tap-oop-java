package travel;

public class xenoithanh extends chuyenxe{
	
	private String sotuyen;
	private double sokm;
	public String getSotuyen() {
		return sotuyen;
	}
	public void setSotuyen(String sotuyen) {
		this.sotuyen = sotuyen;
	}
	public double getSokm() {
		return sokm;
	}
	public void setSokm(double sokm) {
		this.sokm = sokm;
	}
	
	public xenoithanh() {};
	
	public xenoithanh(String msc, String ttx, int soxe, String sotuyen, double sokm, double doanhthu) {
		this.mschuyen = msc;
		this.tentaixe = ttx;
		this.soxe = soxe;
		this.sotuyen = sotuyen;
		this.sokm = sokm;
		this.doanhthu = doanhthu;
	}	
	
	
}
