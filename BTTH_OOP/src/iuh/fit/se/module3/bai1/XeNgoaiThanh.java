package iuh.fit.se.module3.bai1;

public class XeNgoaiThanh extends Xe{
	private String noiDen;
	private int soNgay;
	public XeNgoaiThanh() {
		super();
		this.noiDen ="";
		this.soNgay = 0;
	}
	public XeNgoaiThanh(int maChuyen, String hoTen, int soXe, double doanhThu, String noiDen, int soNgay){
		super(maChuyen, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
		
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	
	
}
