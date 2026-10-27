package ck3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public abstract class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected LocalDate ngayVaoLam;
	
	public NhanVien() {
		this("","",LocalDate.now());
	}
	
	public NhanVien(String maNV, String hoTen, LocalDate ngayVaoLam) {
		if(maNV == null)
			throw new RuntimeException("Chuoi khong duoc rong");
		this.maNV = maNV;
		if(hoTen ==  null)
			throw new RuntimeException("Chuoi khong duoc rong");
		this.hoTen = hoTen;
		if(ngayVaoLam.isAfter(LocalDate.now()))
				throw new RuntimeException("Ngay phai truoc hoac bang ngay hien tai");
		this.ngayVaoLam = ngayVaoLam;
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

	public LocalDate getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(LocalDate ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	
	public abstract double tienLuong();
	public static String title() {
		return String.format("%-15s %-15s %-15s %-15s", "Ma nhan vien","Ho va ten","Ngay vao lam", "Tien luong");
	}
	@Override
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0 VND");
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return String.format("%-15s %-15s %-15s %-15s", maNV, hoTen, ngayVaoLam.format(dt), df.format(tienLuong())); 
	}
	
	
	
	
}
