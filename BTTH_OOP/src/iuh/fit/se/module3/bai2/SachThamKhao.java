package iuh.fit.se.module3.bai2;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	private double thue;
	public SachThamKhao() {
		super();
		this.thue =0;
	}
	public SachThamKhao(int maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia,soLuong,nhaXuatBan);
		this.thue = thue;
	}
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	@Override
	public double getThanhTien() {
		double tienthua =  soLuong * donGia * thue;
		return donGia* soLuong + thue;
	}
}
