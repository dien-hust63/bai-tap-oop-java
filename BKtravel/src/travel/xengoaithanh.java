package travel;

public class xengoaithanh extends chuyenxe {
	
	private String noiden;
	private long songaydi;
	public String getNoiden() {
		return noiden;
	}
	public void setNoiden(String noiden) {
		this.noiden = noiden;
	}
	public long getSongaydi() {
		return songaydi;
	}
	public void setSongaydi(long songaydi) {
		this.songaydi = songaydi;
	}
	public xengoaithanh() {};
	public xengoaithanh(String msc, String ttx, int soxe,String noiden, long songaydi, double doanhthu) {
		this.mschuyen = msc;
		this.tentaixe = ttx;
		this.soxe = soxe;
		this.noiden = noiden;
		this.songaydi = songaydi;
		this.doanhthu = doanhthu;
	}	
	
}
