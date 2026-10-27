package ck5;

import java.util.ArrayList;
import java.util.List;

public class DanhSachNhanVien implements IDSNhanVien {
	List<NhanVien> dsnv;
	

	public DanhSachNhanVien() {
		this.dsnv = new ArrayList<NhanVien>();
	}

	@Override
	public boolean themNV(NhanVien x) {
		for (NhanVien nv : dsnv) {
			if(nv.getMaNV().equals(x.getMaNV()))
				return false;
		}
		if( x == null) return false;
		dsnv.add(x);
		return true;
	}

	@Override
	public List<NhanVien> inDS() {
		return dsnv;
	}

	@Override
	public double tinhTongTien() {
		double sum =0;
		for (NhanVien nv : dsnv) {
			sum += nv.tienLuong();
		}
		return sum;
	}

	@Override
	public List<NhanVien> sapXepNhanVienTheoLuong() {
		return dsnv.stream()
				.sorted((o1,o2) -> Double.compare(o1.tienLuong(), o2.tienLuong()))
				.toList();
	}

	@Override
	public List<NhanVien> sapXepNhanVienTheoTen() {
		return dsnv.stream()
				.sorted((o1,o2) -> o1.getHoTen().compareTo(o2.getHoTen()))
				.toList();
	}

}
