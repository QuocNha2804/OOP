package ck3;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class NhanVienHopDong extends NhanVien {
	private int soNgayCong;

	public NhanVienHopDong() {
		super();
		this.soNgayCong = 0;
	}

	public NhanVienHopDong(String maNV, String hoTen, LocalDate ngayVaoLam, int soNgayCong) {
		super(maNV, hoTen, ngayVaoLam);
		if(soNgayCong <0 || soNgayCong > 30)
			throw new RuntimeException("So ngay cong khong hop le");
		this.soNgayCong = soNgayCong;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	@Override
	public double tienLuong() {
		if(soNgayCong >20)
			return soNgayCong*200000.0;
		else if( soNgayCong > 15)
			return soNgayCong*150000.0;
		else 
			return soNgayCong*100000.0;
	}
	
	public static String title() {
		return String.format("%-15s %-15s %-15s %-15s %-15s", "Ma nhan vien","Ho va ten","Ngay vao lam", "Tien luong","So ngay cong");
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0 VND");
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return String.format("%-15s %-15s %-15s %-15s %5d", maNV, hoTen, ngayVaoLam.format(dt), df.format(tienLuong()), soNgayCong); 
	}
	
	
	
	
}
