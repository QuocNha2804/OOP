package ck1;

import java.text.DecimalFormat;

public abstract class NhanVien {
	protected final String maNV;
	protected String hoVaTen;
	protected String dienThoai;
	protected double luongCanBan;
	public NhanVien() {
		this("","","",1800000.0);
	}
	public NhanVien(String maNV, String hoVaTen, String dienThoai, double luongCanBan) {
		if(maNV.startsWith("N")==false) 
			throw new RuntimeException("Loi r ma");
		this.maNV = maNV;
			
		this.hoVaTen = hoVaTen;
		this.dienThoai = dienThoai;
		this.luongCanBan = luongCanBan;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public Double getLuongCanBan() {
		return luongCanBan;
	}
	public void setLuongCanBan(Double luongCanBan) {
		this.luongCanBan = luongCanBan;
	}
	public String getMaNV() {
		return maNV;
	}
	
	public abstract double tienLuong();
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		return String.format("%-20s %-20s %-20s %10s %10s", maNV, hoVaTen, dienThoai, df.format(luongCanBan), df.format(tienLuong()));
	}
	
	
}
