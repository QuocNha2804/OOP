package demo7;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UngVien {
	private String ten;
	private LocalDateTime thoiDiem;
	
	public UngVien(String ten) {
		this.ten = ten;
		thoiDiem = LocalDateTime.now();
	}
	

	public UngVien(String ten, LocalDateTime thoiDiem) {
		this.ten = ten;
		this.thoiDiem = thoiDiem;
	}


	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public LocalDateTime getThoiDiem() {
		return thoiDiem;
	}

	public void setThoiDiem(LocalDateTime thoiDiem) {
		this.thoiDiem = thoiDiem;
	}
	@Override 
	public String toString() {
		return String.format("%s %10s", ten, thoiDiem);
	}
}
