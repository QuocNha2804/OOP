package ck5;

import java.text.DecimalFormat;

public abstract class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected double luongCoBan;
	public NhanVien() {
		this("","",0.0);
	}
	public NhanVien(String maNV, String hoTen, double luongCoBan) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public abstract double tienLuong();
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		return String.format("%-15s %-15s %-15s %-15s", maNV, hoTen, df.format(luongCoBan), df.format(tienLuong()));
	}
	
}
