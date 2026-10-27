package ck5;

import java.util.List;

public interface IDSNhanVien {
	public boolean themNV( NhanVien x);
	public List<NhanVien> inDS();
	public double tinhTongTien();
	public List<NhanVien> sapXepNhanVienTheoLuong();
	public List<NhanVien> sapXepNhanVienTheoTen();
}	
