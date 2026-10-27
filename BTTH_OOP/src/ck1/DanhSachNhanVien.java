package ck1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	public boolean themNV(NhanVien nv) {
		for (NhanVien nhanvien : dsnv) {
			if(nhanvien.getMaNV().equals(nv.getMaNV()))
				return false;
		}
		if(nv == null)
			return false;
		else {
			dsnv.add(nv);
			return true;
		}
	}
	//in danh sach nhan vien
	public void getDanhSach() {
		for (NhanVien nv : dsnv) {
			System.out.println(nv);
		}
	}
	
	//thong ke luong trung binh
	public Map<String, Double> thongKeLuongTrungBinh(){
		Map<String, Double> thongKe = new HashMap<String, Double>();
		double sumBH =0, sumVP =0, countBH =0, countVP =0;
		for (NhanVien nv : dsnv) {
			if(nv instanceof NhanVienBanHang) {
				sumBH += nv.tienLuong();
				++countBH;
				
			}
			else {
				sumVP += nv.tienLuong();
				++countVP;
			}
		}
		thongKe.put("NhanVienBanHang", (double)sumBH/countBH);
		thongKe.put("NhanVienVanPhong", (double)sumVP/countVP);
		return thongKe;
	}
	//loc danh sach nhan vien ban hang khong co thu nhap tang them va sap xep
	public List<NhanVien> dsNVKhongCoThuNhapTangThem(){
		return dsnv.stream()
				.filter(a -> a instanceof NhanVienBanHang)
				.map(a -> (NhanVienBanHang)a)
				.filter(a -> a.getDoanhSoBan()<20000000.0)
				.sorted(Comparator.comparing(NhanVienBanHang::getDoanhSoBan))
				.collect(Collectors.toList());
	}
	//loc danh sach nhan vien ban hang co doanh so ban lon nhat
	public List<NhanVien> dsNVCoDoanhSoBanLonNhat(){
		double max  = 0.0;
		for (NhanVien nv : dsnv) {
			if(nv instanceof NhanVienBanHang) {
					double doanhSo = ((NhanVienBanHang) nv).getDoanhSoBan();
					if(doanhSo>max) {
						max = doanhSo;
					}
			}
		}
		
		List<NhanVien> temp = new ArrayList<NhanVien>();
		for (NhanVien nv : dsnv) {
			if(nv instanceof NhanVienBanHang) {
				if(((NhanVienBanHang) nv).getDoanhSoBan()==max)
					temp.add(nv);
			}
		}
		return temp;
	}
	//cap nhat he so luong nv van phong khi biet ma nhan vien
	public boolean capNhat(String maNV, double heSoLuong) {
		for (NhanVien nv : dsnv) {
			if(nv instanceof NhanVienVanPhong) {
				if(nv.getMaNV().equals(maNV)) {
					((NhanVienVanPhong) nv).setHeSoLuong(heSoLuong);
					return true;
				}
			}
		}
		return false;
	}
	//sap xep theo tien luong
	public List<NhanVien> sapXepTheoTienLuong(){
		List<NhanVien> temp = dsnv.stream()
				.sorted((o1,o2)-> Double.compare(o1.tienLuong(), o2.tienLuong()))
				.toList();
		return temp;
	}
	//sap xep theo ten
	public List<NhanVien> sapXepTheoTen(){
		List<NhanVien> temp = dsnv.stream()
				.sorted((o1,o2)-> o1.getHoVaTen().compareToIgnoreCase(o2.getHoVaTen()))
				.toList();
		return temp;
	}
	//sap xep giam dan thep doanh so nhan vien ban hang
	public List<NhanVien> sapXepTheoDoanhSoNVBH(){
		List<NhanVien> temp = dsnv.stream()
				.filter(a -> a instanceof NhanVienBanHang)
				.map(a -> (NhanVienBanHang) a)
				.sorted((o1,o2) -> Double.compare(o2.getDoanhSoBan(), o1.getDoanhSoBan()))
				.collect(Collectors.toList());
		return temp;
	}
}
