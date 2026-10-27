package iuh.fit.se.module3.bai2;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private TinhTrang tinhtrang;
	public SachGiaoKhoa() {
		super();
		this.tinhtrang = TinhTrang.MOI;
	}
	public SachGiaoKhoa(int maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, TinhTrang tinhtrang) {
		super(maSach, ngayNhap,donGia,soLuong,nhaXuatBan);
		this.tinhtrang = tinhtrang;
	}
	public TinhTrang getTinhtrang() {
		return tinhtrang;
	}
	public void setTinhtrang(TinhTrang tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	
	@Override
	public double getThanhTien() {
		return tinhtrang == TinhTrang.MOI ? soLuong*donGia : soLuong*donGia*0.5;
	}
}
