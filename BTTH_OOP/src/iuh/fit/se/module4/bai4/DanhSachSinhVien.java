package iuh.fit.se.module4.bai4;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSinhVien {
	private List<SinhVien> dssv = new ArrayList<SinhVien>();

	public DanhSachSinhVien() {
	}

	public DanhSachSinhVien(List<SinhVien> dssv) {
		this.dssv = dssv;
	}
	
	public boolean themSV( SinhVien x) {
		return this.dssv.add(x);
	}
	
	public List<SinhVien> getDSSV() {
		return this.dssv;
	}
	
	public boolean xoaSV(String maSV) {
		for (SinhVien sv : dssv) {
			if(sv.getMaSV().equalsIgnoreCase(maSV))
				return this.dssv.remove(sv);
			
		}
		return false;
	}
	
	public boolean timKiem(String maSV) {
		for (SinhVien sv : dssv) {
			if(sv.getMaSV().equalsIgnoreCase(maSV))
				return this.dssv.contains(sv);
		}
		return false;
	}
	public void sapxep() {
		dssv.sort((sv1,sv2) -> sv1.getMaSV().compareTo(sv2.getMaSV()));
		
	}
	
}
