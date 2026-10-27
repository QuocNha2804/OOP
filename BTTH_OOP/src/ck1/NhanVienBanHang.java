package ck1;

import java.text.DecimalFormat;

public class NhanVienBanHang extends NhanVien {
	private double doanhSoBan;

	public NhanVienBanHang() {
		super();
		this.doanhSoBan = 0.0;
		
	}

	public NhanVienBanHang(String maNV, String hoVaTen, String dienThoai, double luongCanBan, double doanhSoBan) {
		super(maNV, hoVaTen, dienThoai, luongCanBan);
		this.doanhSoBan = doanhSoBan;
	}

	public double getDoanhSoBan() {
		return doanhSoBan;
	}

	public void setDoanhSoBan(double doanhSoBan) {
		this.doanhSoBan = doanhSoBan;
	}
	
	public double tienLuong(){
		return doanhSoBan >= 20000000.0 ? luongCanBan + 0.03*doanhSoBan : luongCanBan;
	}
	
	@Override
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		return String.format("%-20s %-20s %-20s %10s %10s %10s", maNV, hoVaTen, dienThoai, df.format(luongCanBan), df.format(doanhSoBan), df.format(tienLuong()));
	}
	
	
	
}
