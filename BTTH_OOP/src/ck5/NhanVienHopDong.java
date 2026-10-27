package ck5;

import java.text.DecimalFormat;

public class NhanVienHopDong extends NhanVien {
	private TinhTrang tinhTrang;

	public NhanVienHopDong() {
		super();
		this.tinhTrang = TinhTrang.CO;
	}

	public NhanVienHopDong(String maNV, String hoTen, double luongCoBan, TinhTrang tinhTrang) {
		super(maNV, hoTen, luongCoBan);
		this.tinhTrang = tinhTrang;
	}

	public TinhTrang getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(TinhTrang tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double tienLuong() {
		return tinhTrang == TinhTrang.CO ? luongCoBan + 0.4*luongCoBan : luongCoBan + 0.2*luongCoBan;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		return String.format("%-15s %-15s %-15s %-15s %-15s", maNV, hoTen, df.format(luongCoBan), df.format(tienLuong()), luongCoBan);
	}

	
	
	
}
