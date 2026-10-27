package ck5;

import java.text.DecimalFormat;

public class NhanVienBienChe extends NhanVien {
	private double heSoLuong;

	public NhanVienBienChe() {
		super();
		this.heSoLuong = 0.0;
	}

	public NhanVienBienChe(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
		super(maNV, hoTen, luongCoBan);
		this.heSoLuong = heSoLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Override
	public double tienLuong() {
		return heSoLuong*luongCoBan;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		return String.format("%-15s %-15s %-15s %-15s %5.2f", maNV, hoTen, df.format(luongCoBan), df.format(tienLuong()), heSoLuong);
	}
	
}
