package ck3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DanhSachNhanVien {
	List<NhanVien> dsnv;

	public DanhSachNhanVien() {
		this.dsnv = new ArrayList<NhanVien>();
	}

	public DanhSachNhanVien(ArrayList<NhanVien> dsnv) {
		this.dsnv = dsnv;
	}
	
	//them nhan vien
	public boolean themNV(NhanVien x) {
		for (NhanVien nv : dsnv) {
			if(x.getMaNV().equals(nv.getMaNV()))
				return false;
		}
		if(x == null) return false;
		dsnv.add(x);
		return true;
	}
	
	//tong tien luong phai tra trong thang
	public double tongTienLuong() {
		double sum =0;
		for (NhanVien nv: dsnv) {
			sum += nv.tienLuong();
		}
		return sum;
	}
	
	//sua so ngay cong cua nhan vien 
	public boolean suaSoNgayCong( String maNV, int soNgayCong) {
		for (NhanVien nv : dsnv) {
			if(nv.getMaNV().equals(maNV)) {
				if(nv instanceof NhanVienHopDong) {
					((NhanVienHopDong) nv).setSoNgayCong(soNgayCong);
						return true;
				}
			}
		}
		return false;
		
	}
	
	//lay danh sach nhan vien con ngay vao lam thang x nam y
	public List<NhanVien> getDSNVLamThangXNamY(int x, int y){
		return dsnv.stream()
				.filter(a->a.getNgayVaoLam().getYear()==y)
				.filter(a->a.getNgayVaoLam().getMonthValue()==x)
				.toList();
	}
	
	//lay danh sach
	public List<NhanVien> getDSNV() {
		return dsnv;
	}

	//sap xep nhan vien theo ten va theo ngay vao lam
	public List<NhanVien> sapXepTenVaNgayLam(){
		return dsnv.stream()
				.sorted((o1,o2)->o1.getHoTen().compareTo(o2.getHoTen()))
				.sorted((o1,o2)-> o1.getNgayVaoLam().compareTo(o2.getNgayVaoLam()))
				.toList();
	}
	
	// sap xep nhan vien theo ten va theo he so luong
	public List<NhanVien>  sapXepTenVaHeSoLuong(){
		return dsnv.stream()
				.filter(a->a instanceof NhanVienBienChe)
				.map(a->(NhanVienBienChe)a)
				.sorted((o1,o2) -> o1.getHoTen().compareTo(o2.getHoTen()))
				.sorted((o1,o2) -> Double.compare(o1.getHeSoLuong(), o2.getHeSoLuong()))
				.collect(Collectors.toList());
	}
	
	//sap xep nhan vien theo ngay vao lam va so ngay lam va ten
	public List<NhanVien> sapXepTenNgayVaoLamVaSoNgayLam(){
		return dsnv.stream()
				.filter(a->a instanceof NhanVienHopDong)
				.map(a -> (NhanVienHopDong)a)
				.sorted((o1,o2) -> o1.getHoTen().compareTo(o2.getHoTen()))
				.sorted((o1,o2) -> Double.compare(o1.tienLuong(), o2.tienLuong()))
				.sorted((o1,o2) ->o1.getNgayVaoLam().compareTo(o2.getNgayVaoLam()))
				.collect(Collectors.toList());
	}
	//danh sach nhan vien co so ngay lam cao nhat
	public List<NhanVien> getDSNVNgayLamMax(){
		double max = dsnv.stream()
				.filter(a -> a instanceof NhanVienHopDong)
				.map( a-> (NhanVienHopDong) a)
				.mapToDouble(NhanVienHopDong :: getSoNgayCong)
				.max()
				.orElse(0);
		return dsnv.stream()
				.filter( a-> a instanceof NhanVienHopDong)
				.map(a -> (NhanVienHopDong) a)
				.filter( a -> a.getSoNgayCong() == max)
				.collect(Collectors.toList());
	}
	
	//xoa nhan vien theo ma
	public boolean xoaNV( String maNV) {
		for (NhanVien nv : dsnv) {
			if(nv.getMaNV().equals(maNV)) {
				dsnv.remove(nv);
				return true;
			}
		}
		return false;
	}
}
