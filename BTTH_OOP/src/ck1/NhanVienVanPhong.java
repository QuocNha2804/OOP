package ck1;

import java.text.DecimalFormat;

public class NhanVienVanPhong extends NhanVien {
	private double heSoLuong;

	public NhanVienVanPhong(double heSoLuong) {
		super();
		this.heSoLuong = 0.0;
	}

	public NhanVienVanPhong(String maNV, String hoVaTen, String dienThoai, double luongCanBan, double heSoLuong) {
		super(maNV, hoVaTen, dienThoai, luongCanBan);
		if(heSoLuong <1.86 || heSoLuong > 8.69)
			throw new RuntimeException("Loi");
		this.heSoLuong = heSoLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double tienLuong() {
		return luongCanBan * heSoLuong;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		 return String.format("%-20s %-20s %-20s %10s %10s %10s", maNV, hoVaTen, dienThoai, df.format(luongCanBan), df.format(heSoLuong), df.format(tienLuong()));
	}
	
	
}
