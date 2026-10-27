package iuh.fit.se.module3.bai1;

public class XeNoiThanh extends Xe {
	private int soTuyen;
	private double soKM;
	public XeNoiThanh(){
		super();
		this.soTuyen =0;
		this.soKM =0.0;
	}
	
	public XeNoiThanh(int maChuyen, String hoTen, int soXe, double doanhThu,int soTuyen, double soKM) {
		super(maChuyen, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM= soKM;
		
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public double getSoKM() {
		return soKM;
	}

	public void setSoKM(double soKM) {
		this.soKM = soKM;
	}
	
	
}
