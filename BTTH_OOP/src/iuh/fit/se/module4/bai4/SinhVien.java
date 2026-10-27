package iuh.fit.se.module4.bai4;

public class SinhVien {
	private final String maSV;
	private String hoTen;
	private int namSinh;
	public SinhVien() {
		this("","",0);
	}
	public SinhVien(String maSV, String hoTen, int namSinh) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getMaSV() {
		return maSV;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-10s %10d",maSV, hoTen, namSinh);
	}
	
	
	
}
