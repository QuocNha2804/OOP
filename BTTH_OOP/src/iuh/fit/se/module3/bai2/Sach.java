package iuh.fit.se.module3.bai2;

import java.time.LocalDate;

public abstract class Sach {
	protected int maSach;
	protected LocalDate ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaXuatBan;
	
	public Sach() {
		this(0,LocalDate.now(),0.0,0,"");
	}
	public Sach(int maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		this.maSach = maSach;
		this.ngayNhap= ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}
	public int getMaSach() {
		return maSach;
	}
	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	
	public abstract double getThanhTien();
	
	@Override
	public String toString() {
		return String.format("%-5d %-10s %-5.2f %-5d %-10s %5.2f",maSach,ngayNhap,donGia,soLuong,nhaXuatBan,getThanhTien());
	}
	
}
