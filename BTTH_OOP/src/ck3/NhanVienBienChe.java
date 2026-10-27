package ck3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NhanVienBienChe extends NhanVien {
	private double heSoLuong;
	private TienDo tienDo;
	public NhanVienBienChe() {
		super();
		this.heSoLuong = 0.0;
		this.tienDo = TienDo.Co;
	}
	public NhanVienBienChe(String maNV, String hoTen, LocalDate ngayVaoLam, double heSoLuong, TienDo tienDo) {
		super(maNV, hoTen, ngayVaoLam);
		if(heSoLuong < 2.34 || heSoLuong > 4.98)
			throw new RuntimeException("He so luong khong dung");
		this.heSoLuong = heSoLuong;
		this.tienDo = tienDo;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public TienDo getTienDo() {
		return tienDo;
	}
	public void setTienDo(TienDo tienDo) {
		this.tienDo = tienDo;
	}
	@Override
	public double tienLuong() {
		return tienDo == TienDo.Co ? heSoLuong * 1400000 + 2000000 : heSoLuong * 1400000 + 500000; 
	}
	public static String title() {
		return String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Ma nhan vien","Ho va ten","Ngay vao lam", "Tien luong", "He so luong","Tien do");
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0 VND");
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return String.format("%-15s %-15s %-15s %-15s %5.2f %15s", maNV, hoTen, ngayVaoLam.format(dt), df.format(tienLuong()), heSoLuong, tienDo); 
	}
	
	
	
}
