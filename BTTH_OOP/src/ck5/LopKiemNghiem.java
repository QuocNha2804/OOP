package ck5;

import java.text.DecimalFormat;

public class LopKiemNghiem {
	public static void main(String[] args) {
		DanhSachNhanVien dsnv = new DanhSachNhanVien();
		dsnv.themNV(new NhanVienBienChe("NNV01", "Tran Quoc Nha", 1400000.0, 2.3));
		dsnv.themNV(new NhanVienBienChe("NNV02", "Do Minh Quan", 1300000.0, 1.3));
		dsnv.themNV(new NhanVienBienChe("NNV03", "Do Hoai Nho", 1500000.0, 3.5));
		dsnv.themNV(new NhanVienHopDong("NNV04", "Tran Quoc Thai", 1200000.0, TinhTrang.CO));
		dsnv.themNV(new NhanVienHopDong("NNV05", "Hoang Trong Nghia", 1400000.0, TinhTrang.KHONG));
		
		for (NhanVien nv : dsnv.inDS()) {
			System.out.println(nv);
		}
		
		DecimalFormat df = new DecimalFormat("#,##0.0");
		System.out.println("Tong tien la: "+df.format(dsnv.tinhTongTien()));
		
		System.out.println("Sap xep nhan vien theo luong");
		for (NhanVien nv : dsnv.sapXepNhanVienTheoLuong()) {
			System.out.println(nv);
			
		}
		
		System.out.println("Sap xep nhan vien theo ten");
		for (NhanVien nv : dsnv.sapXepNhanVienTheoTen()) {
			System.out.println(nv);
		}
	}
}
